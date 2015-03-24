package br.com.quartetoalegreto.orcamento;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.quartetoalegreto.orcamento.modelo.StatusOrcamento;
import br.com.quartetoalegreto.orcamento.modelo.TipoEvento;
import br.com.quartetoalegreto.orcamento.modelo.TipoInstrumento;
import br.com.quartetoalegreto.orcamento.modelo.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class InicializadorListener
 *
 */
@WebListener
public class InicializadorListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InicializadorListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext ctx = sce.getServletContext();
		ctx.setAttribute("statusOrcamento", StatusOrcamento.values());
		ctx.setAttribute("tipoEvento", TipoEvento.values());
		ctx.setAttribute("tipoTelefone", TipoTelefone.values());
		ctx.setAttribute("tipoInstrumento", TipoInstrumento.values());
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
