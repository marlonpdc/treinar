package br.com.treinar.bradesco.teste;

import br.com.treinar.bradesco.banco.BradescoUtil;

public class TesteSingleton {

	public static void main(String[] args) {
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.println("3");
		BradescoUtil b = BradescoUtil.getInstance();
		BradescoUtil b1 = BradescoUtil.getInstance();
		BradescoUtil b2 = BradescoUtil.getInstance();
		BradescoUtil b3 = BradescoUtil.getInstance();
		BradescoUtil b4 = BradescoUtil.getInstance();
		
		b4.soma(10, 50);
		
	}
	
}
