package com.codegym.service;

import com.codegym.model.Product;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProductJDBCServiceImpl implements ProductService {
private String jdbcURL="jdbc:mysql://localhost:3306/products";
private String jdbcUsername="root";
private String jdbcPassword="Ryan_25121997";
private static final String INSERT_USERS_SQL = "INSERT INTO products"+"(Name,Cost,Description,Manufacturer) VALUES"+"(?,?,?,?);";
private static final String SELECT_USER_BY_ID ="SELECT Id,Name,Cost,Description,Manufacturer FROM products WHERE Id=?";
private static final String SELECT_ALL_USERS ="SELECT * FROM products;";
private static final String DELETE_USERS_SQL ="DELETE FROM products WHERE Id=?;";
private static final String UPDATE_USERS_SQL="UPDATE products SET Name=?,Cost=?,Description=?,Manufacturer=? WHERE Id=?;";
private static final String SELECT_USER_BY_NAME="SELECT * FROM products.products WHERE Name LIKE '%?%';";
protected Connection getConnection(){
    Connection connection=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
    }
    catch (SQLException e){
        e.printStackTrace();
    }
    catch (ClassNotFoundException e){
        e.printStackTrace();
    }
    return connection;
}
private void printSQLException(SQLException ex){
    for (Throwable e:ex){

        if(e instanceof SQLException){
            e.printStackTrace(System.err);
            System.err.println("SQLState:"+((SQLException) e).getSQLState());
            System.err.println("Error Code:"+((SQLException) e).getSQLState());
            System.err.println("Message: "+e.getMessage());
            Throwable t=ex.getCause();
            while (t!= null){
                System.out.println("Cause: "+t);
                t=t.getCause();
            }
        }
    }
}
    @Override
    public List<Product> findAll() {
        List<Product> products=new ArrayList<>();
        try(Connection connection=getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("Name");
                float cost=rs.getFloat("Cost");
                String description=rs.getString("Description");
                String manufacturer=rs.getString("Manufacturer");
                products.add(new Product(id,name,cost,description,manufacturer));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void save(Product product) {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL);){
            preparedStatement.setString(1,product.getName());
            preparedStatement.setFloat(2,product.getCost());
            preparedStatement.setString(3,product.getDescription());
            preparedStatement.setString(4,product.getManufacturer());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        Product product=null;
        try (Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_ID);){
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                String name=rs.getString("Name");
                float cost=rs.getFloat("Cost");
                String description=rs.getString("Description");
                String manufacturer=rs.getString("Manufacturer");
                product=new Product(id,name,cost,description,manufacturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
    @Override
    public List<Product> findByName(String name) {
        List<Product> list=new ArrayList<>();
        try (Connection connection=getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_NAME);){
            preparedStatement.setString(1,name);
            System.out.println(preparedStatement);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next()){
                int id=rs.getInt("Id");
                String Name=rs.getString("Name");
                float cost=rs.getFloat("Cost");
                String description=rs.getString("Description");
                String manufacturer=rs.getString("Manufacturer");
                Product product = new Product(id, Name, cost, description, manufacturer);
//                list.add(id,name,cost,description,manufacturer);
                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void update(int id, Product product) {
       boolean rowUpdated;
       try (Connection connection=getConnection();
       PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_USERS_SQL);){
           preparedStatement.setString(1,product.getName());
            preparedStatement.setFloat(2,product.getCost());
            preparedStatement.setString(3,product.getDescription());
            preparedStatement.setString(4,product.getManufacturer());
            preparedStatement.setInt(5,product.getId());
            rowUpdated=preparedStatement.executeUpdate()>0;
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

    @Override
    public void remove(int id) {
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(DELETE_USERS_SQL);) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
