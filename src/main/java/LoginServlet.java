import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/login")  // Định tuyến /login đến Servlet này
public class LoginServlet extends HttpServlet {

    // Override phương thức doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Thiết lập kiểu nội dung của response là text/html
        response.setContentType("text/html");

        // Lấy đối tượng PrintWriter để viết ra HTML
        PrintWriter out = response.getWriter();

        // Viết thông báo đăng nhập thành công
        out.println("<h2>Đăng nhập thành công!</h2>");
    }
}
