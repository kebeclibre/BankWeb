package lu.actions;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "/WEB-INF/jsp/index.jsp";
	}

}
