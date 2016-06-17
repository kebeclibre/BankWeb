package lu.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lu.dispatch.Dispatch;

/**
 * Servlet implementation class BankServ
 */
@WebServlet("/BankServ")
public class BankServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BankServ() {
        super();

    }

    public void service(HttpServletRequest req, HttpServletResponse resp) {
    	
    	new Dispatch().delegate(req, resp);
    }
	

}
