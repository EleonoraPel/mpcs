/*package it.polimi.awt.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class homeController {
	
	@RequestMapping(value="/home")
    
    public String getIndex() 
    {
        return "home";
    }
}*/
package it.polimi.awt.springmvc.web;
import java.io.IOException;
import javax.servlet.*;

import javax.servlet.http.*;
import java.io.PrintWriter;


public class homeController extends HttpServlet {
        private static final long serialVersionUID = 1L;
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {
                response.setContentType("text/plain");
                PrintWriter out = response.getWriter();
                out.println("Hello");
                out.close();
} }

