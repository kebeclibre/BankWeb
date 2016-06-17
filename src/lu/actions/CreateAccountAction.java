package lu.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateAccountAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		return "/WEB-INF/jsp/createAccount.jsp";
	}

}
