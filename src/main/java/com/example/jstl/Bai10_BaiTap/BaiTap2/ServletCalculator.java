package com.example.jstl.Bai10_BaiTap.BaiTap2;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCalculator", value = "/calculator")
public class ServletCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double value1 = Double.parseDouble(req.getParameter("value1"));
        double value2 = Double.parseDouble(req.getParameter("value2"));
        String opera = req.getParameter("optional");
        double result = 0;
        switch (opera){
            case "addition":
                result = value1 + value2;
                break;
            case "subtraction":
                result = value1 - value2;
                break;
            case "multiplication":
                result = value1 * value2;
                break;
            case "division":
                result = value1 / value2;
                break;
        }
        req.setAttribute("value1", value1);
        req.setAttribute("value2", value2);
        req.setAttribute("optional", opera);
        req.setAttribute("result", result);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Bai10_BaiTap/BaiTap2/BaiTap2.jsp");
        requestDispatcher.forward(req, resp);
    }
}
