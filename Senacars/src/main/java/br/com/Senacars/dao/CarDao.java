package br.com.Senacars.dao;

import br.com.Senacars.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDao {

 public void createcar(Car car) {

  String SQL = "INSERT INTO CAR (NAME) VALUES {?}";

  try {

   Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

   PreparedStatement preparedStatement = connection.prepareStatement(SQL);
   preparedStatement.setString(1, car.getName() );
   preparedStatement.execute();

   connection.close();


   System.out.println("Sucesso in connection");

  } catch (Exception e) {

   System.out.println("Fail in connection");


  }

 }

}
