package br.com.treinar.bradesco.banco;


public class BradescoUtil {
	
	private static BradescoUtil instance;
	
	private Conta conta;
	
	private BradescoUtil() {
		super();
	}
	
	static {
		instance = new BradescoUtil();
	}
	
	public static BradescoUtil getInstance() {
		return instance;
	}
	
	public Integer soma(Integer a, Integer b) {
		return a + b;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
