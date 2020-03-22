package servlet;

import core.StudentHomework;
import jdbc.StudentHomeworkJdbc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentHomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StudentHomework> list= StudentHomeworkJdbc.selectAll();

        req.setAttribute("list",list);
        req.getRequestDispatcher("student.jsp").forward(req,resp);
    }
}
