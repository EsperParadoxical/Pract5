package demo;

import com.google.gson.Gson;
import org.codehaus.jettison.json.JSONObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 151260D on 11/14/2016.
 */

@WebServlet(name = "Servlet", urlPatterns = "/servlet")

public class Servlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book b = new Book();
        Gson gson = new Gson();
        String json = gson.toJson(b);
        response.setContentType("application/json");
        PrintWriter pw = response.getWriter();
        pw.println(json);

        pw.close();

    }



}
