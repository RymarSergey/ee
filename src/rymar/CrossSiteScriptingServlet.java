package rymar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 *
 *autor Сергей on 24.09.2018 17:36
 */
@WebServlet("/CrossSiteScriptingServlet")
public class CrossSiteScriptingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String one=request.getParameter("one");
            String two=request.getParameter("two");
            response.getWriter().write("<html>"+
                    "<head></head>"+
                    "<body>"+
                    "one= "+one+
                    "<form action='/CrossSiteScriptingServlet' method='post'>"+
                    "<textarea name='one'></textarea>"+
                    "<input type='submit' name='submit'/>"+
                    "</form>"+
                    "</body>"+
                    "</html>");
        }


}
