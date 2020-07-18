package frank.util.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/test")

public class TestServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//请求数据编码：请求体产生作用，URL中的数据无效
        resp.setCharacterEncoding("UTF-8");//服务器响应的数据设置编码
       //告诉浏览器：1，数据类型（浏览器处理数据的方式）；2，编码：浏览器解析数据的编码
        PrintWriter pw=resp.getWriter();
        String i=req.getParameter("i");
        if ("1".equals(i)){//重定向
            resp.sendRedirect("index.html");

        }else if ("2".equals(i)){//转发
            req.getRequestDispatcher("index.html").forward(req,resp);

        }else {//如果是int，就正常返回，如果不是，就返回400
            try {
                Integer.parseInt(i);
                pw.println(i);
                //能够解析为int，正常返回；
            } catch (NumberFormatException e) {
            //非int，返回400
                resp.setStatus(400);
                pw.println("非数值"+i);
            }

        }
        pw.flush();
    }
}
