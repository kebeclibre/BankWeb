package lu.actions;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManageAccountAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if (null==req.getSession().getAttribute("accountMap")) {
			req.setAttribute("accountState", "Account Non Existent. Please Create One");
			return "/WEB-INF/jsp/createAccount.jsp";
		}
		
		return "/WEB-INF/jsp/manageAccount.jsp";
	}

}
