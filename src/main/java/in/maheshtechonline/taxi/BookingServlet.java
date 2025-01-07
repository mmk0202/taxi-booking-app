package in.maheshtechonline.taxi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String pickup = request.getParameter("pickup");
        String drop = request.getParameter("drop");

        // Simulate storing data in RDS
        System.out.println("Booking: " + name + ", " + pickup + " -> " + drop);

        // Pass data to success.jsp
        request.setAttribute("name", name);
        request.setAttribute("pickup", pickup);
        request.setAttribute("drop", drop);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
