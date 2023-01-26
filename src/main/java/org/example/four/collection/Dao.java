package org.example.four.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jdk.jshell.StatementSnippet;
import org.example.three.jdbc.Customer;
public interface Dao<E> {
   String URL = "jdbc:mysql://localhost:3306/sql_store";
   String USERNAME = "root";
   String PASSWORD = "monalisa1984";

    E create(E entity);

   List<E> getAll();

   E get(long primaryKey);

   E update (E entity);

   void delete(E entity);


}
