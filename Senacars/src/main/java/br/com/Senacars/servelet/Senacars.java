package br.com.Senacars.servelet;


import br.com.Senacars.dao.CarDao;
import br.com.Senacars.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class Senacars extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String carName = req.getParameter("car-name");

      Car car = new Car();

      car.setName(carName);

      new CarDao().createcar(car);


      System.out.println(carName);

      req.getRequestDispatcher("index.jsp").forward(req, resp);

      }
   }