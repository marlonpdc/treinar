package br.com.treinar.bb.exception;

public class BBException extends Exception {
	
	private String msgErro;
	
	public BBException(String msg) {
		this.msgErro = msg;
	}

	private static final long serialVersionUID = 1L;

	public String getMsgErro() {
		return msgErro;
	}

	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}
}
