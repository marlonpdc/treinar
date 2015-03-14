package br.com.treinar.agenda.util;

public class AgendaException extends Exception {

	private static final long serialVersionUID = -8790978991166427010L;

	public AgendaException() {
		super();
	}
	
	public AgendaException(String msg) {
		super(msg);
	}
	
	public AgendaException(Throwable cause) {
		super(cause);
	}
	
	
}
