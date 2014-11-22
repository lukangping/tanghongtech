package com.tanghongtech;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kplu on 11/22/14.
 */
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("key1", "value1");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/forward.jsp");
        requestDispatcher.forward(req, resp);
    }
}
