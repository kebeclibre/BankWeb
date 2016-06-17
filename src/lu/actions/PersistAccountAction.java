package lu.actions;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lu.session.BanqueRemote;

public class PersistAccountAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		BanqueRemote banque= null;
		try {
			InitialContext ctx = new InitialContext();
			banque  = (BanqueRemote) ctx.lookup("java:app/BankEJB/Banque!lu.session.BanqueRemote");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String numero = req.getParameter("numero");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		Double balance = Double.parseDouble(req.getParameter("balance"));
		Double allowedCredit = Double.parseDouble(req.getParameter("allowedCredit"));
		banque.createAccount(numero, nom, prenom, balance, allowedCredit);
		
		req.getSession().setAttribute("accountMap", banque.getAccountData());
		
		
		return "manageAccount.do";
	}

}
