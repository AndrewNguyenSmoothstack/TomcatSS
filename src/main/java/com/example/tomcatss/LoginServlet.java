package com.example.tomcatss;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    private ArrayList<String> u=new ArrayList<>();
    private ArrayList<String> p=new ArrayList<>();

    @Override
    public void init() {
        u.add("asdf");
        p.add("asdf");

        u.add("asd");
        p.add("asd");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean loggedin=false;
        for(int i = 0;i<u.size();i++){
            if(u.get(i).equals(request.getParameter("username_form_name"))&&p.get(i).equals(request.getParameter("password_form_name"))){
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h1>" +"Logged in"+ "</h1>");
                out.println("</body></html>");
                loggedin=true;
            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body><h2>u/p:</h2><p>");

        for(int i=0;i< u.size();i++){
            out.println(u.get(i).toString()+"/"+p.get(i)+" ");
        }
        if(loggedin==false){
            out.println("</p><h1>No log in</h1></body></html>");
        }
        else {
            out.println("</p></body></html>");
        }

    }
}
