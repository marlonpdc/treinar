package ExceptionGeneric;

public class CpfException extends Exception {	
	
	private String msgErro;
	
	public CpfException(String msg) {
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
