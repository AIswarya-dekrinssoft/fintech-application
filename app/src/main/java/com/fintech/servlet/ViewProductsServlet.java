package com.fintech.servlet;

import com.fintech.dao.ProductDAO;
import com.fintech.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ViewProductsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            List<Product> products = ProductDAO.getProducts();
            req.setAttribute("products", products);
            req.getRequestDispatcher("products.jsp").forward(req, res);

        } catch(Exception e){
            req.getRequestDispatcher("error-db.jsp").forward(req, res);
        }
    }
}
