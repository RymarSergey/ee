package rymar;/*
 *
 *autor Сергей on 15.09.2018 13:26
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/codeExample")
public class CodeExampleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getServletPath());
        System.out.println(request.getProtocol());
        System.out.println(request.getQueryString());
        System.out.println(request.getServerPort());//порт
        System.out.println(request.getParameter("myParameter"));//получение значения параметна если таковой присутствует
        HttpSession session = request.getSession();//получение сессии

        String path = request.getServletPath();
        if (path.equals("/")){
            request.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(request, response);
        }
        else if (path.equals("/welcome")){
            request.getRequestDispatcher("/WEB-INF/view/welcome.jsp").forward(request, response);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
