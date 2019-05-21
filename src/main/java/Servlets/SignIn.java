package Servlets;

//import JavaClass.UserList;

//import jdbc.dao.MyDaoImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/signin")
public class SignIn extends HttpServlet {
    //private UserList usList = new UserList();
    // private TestSQLClass testSQLClass = new TestSQLClass();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doPost(req, resp);
        //response.setContentType("text/html");
        //--HttpSession session = request.getSession(false);
        //request.getSession(false) вернет текущий сеанс, если текущий сеанс существует, а затем он не создаст новый сеанс.

        HttpSession session = request.getSession(false);
        System.out.println("session = " + session);
        String name = (String) session.getAttribute("name");
        System.out.println("name = " + name);


        String login = request.getParameter("login");
        String password = request.getParameter("password");


        PrintWriter out = response.getWriter();
        try {
            // если объект ранее не установлен
            if(name == null) {
                // устанавливаем объект с ключом name
                session.setAttribute("name", "Tom Soyer");
                out.println("Session data are set");
            }
            else {
                out.println("Name: " + name);
                // удаляем объект с ключом name
                session.removeAttribute("name");
            }
        }
        finally {
            out.close();
        }

       // MyDaoImplement myDao = new MyDaoImplement();


        //if (usList.contains(login,password) == true) {
        //if (testSQLClass.contains(login, password) == true)  {
        System.out.println("--------------------");
        System.out.println("login ==" + login);
        System.out.println("password ==" + password);


    }
}
