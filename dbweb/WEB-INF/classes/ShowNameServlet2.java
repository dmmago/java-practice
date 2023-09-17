import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/showname2")
public class ShowNameServlet2 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    StudentDAO sdao = new StudentDAO();
    sdao.connect();
    String name = sdao.select(3);
    sdao.disconnect();
    
    req.setAttribute("name", name);
    
    RequestDispatcher rd = req.getRequestDispatcher("/showname2.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}

