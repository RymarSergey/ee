package rymar;/*
 *
 *autor Сергей on 14.09.2018 18:25
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/life")
public class ServletLifeCycle extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Initialization!!");
//        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("method GET");
        String s="<html>"+
                "<header><title>This is title</title></header>"+
                "<body>"+
                "Hi Serik)"+
                "</body>"+
                "</html>";
        resp.getWriter().write(s);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("method PUT ");
        super.doGet(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("method service ");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
//        super.destroy();
    }
}
