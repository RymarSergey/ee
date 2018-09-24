package rymar;/*
 *
 *autor Сергей on 14.09.2018 20:22
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@WebServlet("/SingleThreadServlet")
public class SingleThreadServlet extends HttpServlet{
    int i;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println(Thread.currentThread().getName());
        for (int j = 0; j <1_000_000 ; j++) {
            i++;
        }
        System.out.println(i+" "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int index = 0; index <2 ; index++) {
            new Thread() {
                public void Run() {
                    try {
                        URLConnection urlConnection = new URL("http://localhost:8080/temp").openConnection();
                        urlConnection.getInputStream();
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
