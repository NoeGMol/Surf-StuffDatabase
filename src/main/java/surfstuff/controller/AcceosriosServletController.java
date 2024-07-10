package surfstuff.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import surfstuff.data.AccesoriosDAO;
import surfstuff.model.Accesorios;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.util.Map;
//import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcceosriosServletController {
@WebServlet("/accesorios")
public static class TrajeservletController extends HttpServlet {
    List<Accesorios> accesoriosList = new ArrayList<>();
    static Logger logger = LoggerFactory.getLogger(AcceosriosServletController.class);
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String route = req.getParameter("action");
      logger.info("route : " + route);
      switch (route) {
        case ("getAll"): {
          res.setContentType("application/json; charset=UTF-8");
          accesoriosList = AccesoriosDAO.seleccionar();
          logger.info("Dentro de getAll : " + accesoriosList.size());
          //transformo en json y lo envio
          mapper.writeValue(res.getWriter(), accesoriosList);
          logger.info(mapper.toString());
        }        
        default: {
          System.out.println("Parámetro no válido");
        }
      }
    }
}
}

