package servlet;

import Util.JASONUtil;
import model.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public  abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    resp.setContentType("application/json");

    Response response=new Response();
        try {
            Object o=process(req,resp);
            response.setSuccess(true);
            response.setData(o);
        } catch (Exception e) {
            response.setCode("500");
            response.setMessage(e.getMessage());
            StringWriter sw=new StringWriter();
            PrintWriter pw=new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace=sw.toString();
            System.err.println(stackTrace);
            response.setStackTrace(stackTrace);
        }
        PrintWriter pw=resp.getWriter();
        pw.println(JASONUtil.write(response));
        pw.flush();
    }
    public abstract Object process (HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
