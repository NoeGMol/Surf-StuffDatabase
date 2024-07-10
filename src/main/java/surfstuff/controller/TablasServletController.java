package surfstuff.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import surfstuff.data.TablasDAO;
import surfstuff.model.Tablas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.util.Map;
//import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/tablas")
public class TablasServletController extends HttpServlet {
    List<Tablas> tablasList = new ArrayList<>();
    static Logger logger = LoggerFactory.getLogger(TablasServletController.class);
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String route = req.getParameter("action");
      logger.info("route : " + route);
      switch (route) {
        case ("getAll"): {
          res.setContentType("application/json; charset=UTF-8");
          tablasList = TablasDAO.seleccionar();
          logger.info("Dentro de getAll : " + tablasList.size());
          //transformo en json y lo envio
          mapper.writeValue(res.getWriter(), tablasList);
          logger.info(mapper.toString());
        }        
        default: {
          System.out.println("Parámetro no válido");
        }
      }
    }
  /*/
    //En el doPost enviamos los datos del formulario a Java para que los
    //inserte en la base de datos.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      //String route = req.getParameter("action");
      String route = "add";
      logger.info("Dentro del doPost()");
      logger.info("route : " + route);
      logger.info("req : " + req);
      logger.info("req : " + req.getParameter("nombre"));
      switch(route) {
        case ("add") {
          String nomProd = req.getParameter("nombre");
          String tipoProd = req.getParameter("tipo");
          String marcaProd = req.getParameter("marca");
          String matProd = req.getParameter("material");
          String tamProd = req.getParameter("tamaño");
          String diseProd = req.getParameter("disenio");
          int precioProd = Integer.parseInt(req.getParameter("Precio"));
          logger.info(nomProd, tipoProd, marcaProd, matProd, tamProd, diseProd, precioProd);
  
          Tablas nuevaTabla = new Tablas();
         
          //Hardcodeo una peli
          Tablas hardTablas = new Tablas();
          TablasDAO.insertar(hardTablas);
  
          res.setContentType("application/json; charset=UTF-8");
          Map<String, String> response = new HashMap();
          response.put("message", "Tabla guardada exitosamente!!!");
          mapper.writeValue(res.getWriter(), response);
  
        }
      }
    }*/
}
