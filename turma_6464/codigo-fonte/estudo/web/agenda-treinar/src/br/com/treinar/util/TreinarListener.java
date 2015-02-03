package br.com.treinar.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.modelo.TipoTelefone;

@WebListener
public class TreinarListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext ctx = sce.getServletContext();
		ctx.setAttribute("tiposTelefone", TipoTelefone.values());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println(sce);
	}

}
