package frank.util.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//请求数据编码：请求体产生作用，URL中的数据无效
        resp.setCharacterEncoding("UTF-8");//服务器响应的数据设置编码
        //告诉浏览器：1，数据类型；2，编码格式
        resp.setContentType("text/html;charset=UTF-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        PrintWriter pw=resp.getWriter();
        if ("abc".equals(username)&&"123".equals(password)){
            pw.println("登录成功");
        }else {
            pw.println("登录失败");
        }
        pw.flush();
    }
}
