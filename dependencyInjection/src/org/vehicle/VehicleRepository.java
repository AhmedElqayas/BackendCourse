package org.vehicle;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class VehicleRepository {
    private static Connection connection = null;
    private static final Properties properties = new Properties();

    private static void loadProperties() {
        try (InputStream stream = VehicleRepository.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(stream);
        } catch (Exception e) {
            System.out.println("There is a problem in reading the properties.");
        }
    }

    private static String readProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }


    private Connection createConnection() throws SQLException, ClassNotFoundException {
            loadProperties();
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(readProperty("database.url"), readProperty("database.username"), readProperty("database.password"));
            System.out.println("Connection created successfully.");
        return connection;
    }
    private void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Connection closed.");
        }
    }

    public void saveVehicleData(int vehicleId, String vehicleType, String vehicleModel) {
       try {
           String insertQuery = "insert into vehicle values (?,?,?)";

           PreparedStatement preparedStatement = createConnection().prepareStatement(insertQuery);
           preparedStatement.setInt(1, vehicleId);
           preparedStatement.setString(2, vehicleType);
           preparedStatement.setString(3, vehicleModel);

           if (preparedStatement.execute()) {
               System.out.println("Data saved successfully.");
           }

           closeConnection();

       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
