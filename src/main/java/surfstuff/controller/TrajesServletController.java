package surfstuff.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import surfstuff.data.TrajesDAO;
import surfstuff.model.Trajes;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.util.Map;
//import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrajesServletController {
    
@WebServlet("/trajes")
public static class TrajeservletController extends HttpServlet {
    List<Trajes> trajesList = new ArrayList<>();
    static Logger logger = LoggerFactory.getLogger(TrajesServletController.class);
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String route = req.getParameter("action");
      logger.info("route : " + route);
      switch (route) {
        case ("getAll"): {
          res.setContentType("application/json; charset=UTF-8");
          trajesList = TrajesDAO.seleccionar();
          logger.info("Dentro de getAll : " + trajesList.size());
          //transformo en json y lo envio
          mapper.writeValue(res.getWriter(), trajesList);
          logger.info(mapper.toString());
        }        
        default: {
          System.out.println("Parámetro no válido");
        }
      }
    }
}
}