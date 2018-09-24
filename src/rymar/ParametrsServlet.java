package rymar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/*
 *
 *autor Сергей on 18.09.2018 23:13
 *
 */
@WebServlet("/parametrs")
public class ParametrsServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String one=request.getParameter("one");
//        String two=request.getParameter("two");
//        System.out.println(one);
//        System.out.println(two);
//
//        String[] equalsParametrs=request.getParameterValues("one");
//        Arrays.stream(equalsParametrs).forEach(System.out::println);
//
//        Enumeration<String > parametrNames=request.getParameterNames();
//        while (parametrNames.hasMoreElements()) {
//            String nextParametr=parametrNames.nextElement();
//            System.out.println(nextParametr + " = " + request.getParameter(nextParametr));
//        }
//        Map<String ,String []> parametrMap=request.getParameterMap();

//
//        System.out.println(request.getRequestURI()+" RequestURI");
//        System.out.println(request.getRequestURL()+" RequestURL");
//        System.out.println(request.getServletPath()+" ServletPath");
//        System.out.println(request.getRemoteUser()+" getRemoteUser");
//        System.out.println(request.getRemoteHost()+" RemoteHost");
//        System.out.println(request.getLocalAddr()+" getLocalAddr");
//        System.out.println(request.getLocalPort()+" getLocalPort");
//        System.out.println(request.getQueryString()+" QueryString");
       String one=request.getParameter("one");
       String two=request.getParameter("two");
        response.getWriter().write("<html>"+
                "<head></head>"+
                "<body>"+
                "one= "+one+
                " two= "+two+
                "<form action='/parametrs' method='post'>"+
                "<input type='text' name='one'/>"+
                "<input type='text' name='two'/>"+
                "<input type='submit' name='submit'/>"+
                "</form>"+
                "</body>"+
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
//        String one=req.getParameter("one");
//        String two=req.getParameter("two");
//        resp.getWriter().write("<html>"+
//                "<head></head>"+
//                "<body>"+
//                "one= "+one+
//                " two= "+two+
//                "<form action='/parametrs' method='get'>"+
//                "<input type='text' name='one'/>"+
//                "<input type='text' name='two'/>"+
//                "<input type='submit' name='submit'/>"+
//                "</form>"+
//                "</body>"+
//                "</html>");
    }
}
