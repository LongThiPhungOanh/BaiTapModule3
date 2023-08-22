package com.example.jstl.Bai10_BaiTap.BaiTap1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ServletCustomer", value = "/CustomerList")
public class ServletCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ManagerCustomer customer = new ManagerCustomer();
        customer.addProduct();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Bai10_BaiTap/BaiTap1.jsp");
        req.setAttribute("customers", customer.customers);
        requestDispatcher.forward(req, resp);
    }
}
