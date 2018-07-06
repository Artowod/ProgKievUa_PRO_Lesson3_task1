package ua.kiev.prog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua</title></head>" +
            "<body><h1>%s</h1></body></html>";

    private List<String> database = new ArrayList<>();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String age = req.getParameter("age");

        String answerOne = req.getParameter("questionOne");
        String answerTwo = req.getParameter("questionTwo");
        String answerThree = req.getParameter("questionThree");

        HttpSession session = req.getSession();

        StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("<b>Name:</b> " + name + "; ");
            strBuilder.append("<b>Surname:</b> " + surname + "; ");
            strBuilder.append("<b>Age:</b> " + age + ".");

        database.add(strBuilder.toString());

        strBuilder = new StringBuilder();
            strBuilder.append("<b>Answer1:</b> " + answerOne + "; ");
            strBuilder.append("<b>Answer2:</b> " + answerTwo + "; ");
            strBuilder.append("<b>Answer3:</b> " + answerThree + ".");

        database.add(strBuilder.toString());
        database.add("<br>");

        session.setAttribute("database", database);

        resp.sendRedirect("response.jsp");
        //   resp.getWriter().println(String.format(TEMPLATE, msg));
    }
}
