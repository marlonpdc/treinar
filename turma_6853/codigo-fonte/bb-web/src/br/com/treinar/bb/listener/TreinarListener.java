package br.com.treinar.bb.listener;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.bb.modelo.StatusConta;


@WebListener
public class TreinarListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext ctx = sce.getServletContext();
		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Carregando Enumns");
		ctx.setAttribute("status", Arrays.asList(StatusConta.values()));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println(sce);
	}

	

}