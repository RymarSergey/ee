package rymar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
 *
 *autor Сергей on 24.09.2018 19:04
 */
@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            super.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String > headerNames=request.getHeaderNames();
        while (headerNames.hasMoreElements()){                     //выводит headers
            String s=headerNames.nextElement();
            System.out.println(s+" = "+request.getHeader(s));
        }

    }
}
