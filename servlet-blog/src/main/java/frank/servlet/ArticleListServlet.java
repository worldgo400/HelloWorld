package frank.servlet;

import frank.model.Article;
import frank.model.Response;
import frank.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

//  @WebServlet("/articleList")
    public class ArticleListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     req.setCharacterEncoding("UTF-8");
     resp.setCharacterEncoding("UTF-8");
     resp.setContentType("application/json;charset=UTF-8");
     String id=req.getParameter("id");
        Response response=new Response();
        try {
            List<Article>articles= ArticleDAO.query(Integer.parseInt(id));
            response.setSuccess(true);
            response.setData(articles);
        } catch (Exception e) {

            response.setMessage(e.getMessage());
            StringWriter sw=new StringWriter();
            PrintWriter write=new PrintWriter(sw);
            e.printStackTrace(write);
           response.setStackTrace(sw.toString());

        }
        PrintWriter pw= resp.getWriter();
        pw.println(JSONUtil.serialize(response));
        pw.flush();
    }
}

