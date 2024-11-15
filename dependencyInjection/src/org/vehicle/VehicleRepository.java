package org.vehicle;

import java.sql.*;

public class VehicleRepository {
    private static Connection connection = null;
    public String databaseUrl;
    public String databaseUserName;
    public String databasePassword;

    public VehicleRepository(String databaseUrl, String databaseUserName, String databasePassword) {
        this.databaseUrl = databaseUrl;
        this.databaseUserName = databaseUserName;
        this.databasePassword = databasePassword;
    }


    private Connection createConnection() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(databaseUrl, databaseUserName, databasePassword);
            System.out.println("Connection created successfully.");
        return connection;
    }
    private void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Connection closed.");
        }
    }

    public void saveVehicleData(String vehicleType, String vehicleModel) {
       try {
           String insertQuery = "insert into vehicle (vehicleType, vehicleBrand) values (?,?)";

           PreparedStatement preparedStatement = createConnection().prepareStatement(insertQuery);
           preparedStatement.setString(1, vehicleType);
           preparedStatement.setString(2, vehicleModel);

           if (preparedStatement.execute()) {
               System.out.println("Data saved successfully.");
           }

           closeConnection();

       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
