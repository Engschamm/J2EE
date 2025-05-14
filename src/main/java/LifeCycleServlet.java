import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifeCycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Thông báo khi phương thức init() được gọi
        System.out.println("==> init() của LifeCycleServlet được gọi");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Thông báo khi phương thức doGet() được gọi
        System.out.println("==> doGet() của LifeCycleServlet được gọi");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Chào bạn, từ LifeCycleServlet!</h1>");
    }

    @Override
    public void destroy() {
        // Thông báo khi phương thức destroy() được gọi
        System.out.println("==> destroy() của LifeCycleServlet được gọi");
    }
}
