package rymar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 *
 *autor Сергей on 24.09.2018 17:57
 */
@WebServlet("/temp")
public class TempServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String one=request.getParameter("one");
        one=one==null?"":one.replaceAll("<","&lt;").replaceAll(">","&gt;");//defend from XSS
        response.getWriter().write("<html>"+
                "<head></head>"+
                "<body>"+
                "one= "+one+
                "<form action='/temp' method='post'>"+
                "<textarea name='one'></textarea>"+
                "<input type='submit' name='submit'/>"+
                "</form>"+
                "</body>"+
                "</html>");
    }
}
