package br.com.treinar.agenda.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.agenda.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class AgendaListener
 *
 */
@WebListener
public class AgendaListener implements ServletContextListener {

    public AgendaListener() {
        
    }

    public void contextDestroyed(ServletContextEvent context)  { 
    	
    }

    public void contextInitialized(ServletContextEvent context)  { 
    	context.getServletContext().setAttribute("tiposTelefone", TipoTelefone.values());         
    }
	
}
