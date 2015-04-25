package br.com.treinar.agenda.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.agenda.modelo.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class AgendaListener
 *
 */
@WebListener
public class AgendaListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public AgendaListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
    	ServletContext ctx = sce.getServletContext();
		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Carregando Enumns");
		ctx.setAttribute("tipos", TipoTelefone.valuesOrderByDescription());
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
    	Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Encerrando Aplicação..." + sce.getServletContext().getContextPath());
    }
	
}
