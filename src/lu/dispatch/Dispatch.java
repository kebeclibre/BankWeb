package lu.dispatch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lu.actions.Action;
import lu.actions.CreateAccountAction;
import lu.actions.IndexAction;
import lu.actions.ManageAccountAction;
import lu.actions.PersistAccountAction;

public class Dispatch {
	private Map<String,Action> paths;
	
	public Dispatch() {
		populate();
	}
	
	private void populate() {
		paths=new HashMap<>();
		paths.put("/index.do", new IndexAction());
		paths.put("/createAccount.do", new CreateAccountAction());
		paths.put("/sendCreateAccount.do", new PersistAccountAction());
		paths.put("/manageAccount.do", new ManageAccountAction());
	}
	
	public void delegate(HttpServletRequest req, HttpServletResponse resp) {
		String whereTo = paths.get(req.getServletPath()).execute(req, resp);
		
		try {
			req.getRequestDispatcher(whereTo).forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
