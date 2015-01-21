package br.com.treinar.bradesco.teste;

import br.com.treinar.bradesco.banco.BradescoUtil;

public class TesteSingleton {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.println("3");
		BradescoUtil b = BradescoUtil.getInstance();
		/*este atributo nao deve ser removido bla bla bla
		 * 
		 * adslfkjçalsdkjfçljk
		 */
		BradescoUtil b1 = BradescoUtil.getInstance();
		BradescoUtil b2 = BradescoUtil.getInstance();
		BradescoUtil b3 = BradescoUtil.getInstance();
		BradescoUtil b4 = BradescoUtil.getInstance();
		
		b.soma(10, 50);
		
	}
	
}
