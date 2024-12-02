package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.Type;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
@Scope("singleton")
public class DatabaseOperations {
    @Value("${database.url}")
    private String databaseUrl;
    @Value("${database.username}")
    private String databaseUsername;
    @Value("${database.password}")
    private String databasePassword;
    public static Connection connection;

    @PostConstruct
    public void connectToDatabase() throws SQLException {
        connection = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
        System.out.println("Connection established.");
    }

    @PreDestroy
    public void disconnectFromDatabase() throws SQLException {
        if (connection != null)
            connection.close();
        System.out.println("Connection closed.");
    }

    public void save(int id, String brand, Type type) {
        String saveVehicleQuery = "insert into vehicles values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(saveVehicleQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, brand);

            preparedStatement.setObject(3, type.toString());

            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
