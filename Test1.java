package com.example;
/*ここ→https://invertko.tistory.com/71*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.SercletException;
import javax.servlet.annotation.WebSerclet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServeltRequest;
import javax.servlet.http.HttpServeltResponse;

@WebSerclet("/funny")
public class Test1 extends HttpServlet {
  private static final long serialVersionUID = 1L;

    public Test1() {
      super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<hr>");
        out.println("Time on the server is: " +new java.util.Date());
        out.println("</body></html>");

    }
    @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          doGet(req, resp);
}