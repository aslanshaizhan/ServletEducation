package model;

import entity.PostBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    private static Connection connect;
    public static Connection getConnect(){
        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/education",
                    "postgres","root");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connect;
    }

    public static boolean addPost(PostBean postBean){
        int rows = 0;
        try{

            PreparedStatement statement = connect.prepareStatement("INSERT INTO posts (id, title, author_name, description, created_at) " +
                    "VALUES (NULL, ?, ?, ?, NOW())");

            statement.setString(1, postBean.getTitle());
            statement.setLong(2, Integer.parseInt(postBean.getAuthor().getUsername()));
            statement.setInt(3, Integer.parseInt(postBean.getDescription()));

            rows = statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return rows>0;
    }
}
