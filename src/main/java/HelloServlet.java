import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    // Phương thức xử lý yêu cầu GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Thiết lập kiểu phản hồi là text/html
        response.setContentType("text/html");

        // Lấy đối tượng PrintWriter để ghi phản hồi ra trình duyệt
        PrintWriter out = response.getWriter();

        // Hiển thị họ tên của bạn ra trình duyệt
        out.println("<h1>Họ và tên: Trần Thị Ngọc Ánh</h1>");
    }
}
