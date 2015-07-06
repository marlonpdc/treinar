package atividade;

public class Y {

	public static void main(String[] args) {

		X x = new X();
		x.size = 1;

		for (;;) {
			x.increase();
			System.out.println(x.size);

		}
	}

}
