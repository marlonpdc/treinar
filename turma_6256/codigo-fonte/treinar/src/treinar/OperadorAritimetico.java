package treinar;

public class OperadorAritimetico {

	public static void main(String[] args) {
		//soma
		int i = 10;
		int j = 20;
		int soma = i + j;
		System.out.println(soma);
		
		//subtracao
		int k = 10;
		int l = 20;
		int sub = k - l;
		System.out.println("Subtração " + sub);
		
		//Multiplicacao
		int m = 10;
		int n = 20;
		int mult = m * n;
		System.out.println("Multiplicação " + mult);
		
		//Multiplicacao
		int o = 10;
		int p = 20;
		float divisao = o / p;
		//float divisao = ((float) o) / p;
		System.out.println("Divisão " + divisao);

		int r = 21;
		int s = 2;
		int mod = r % s;
		//float divisao = ((float) o) / p;
		System.out.println("Mod " + mod);
		
		char a = 'a';
		char b = 'b';
		char c = (char) (a + b);
		System.out.println(c);
		
		String nome = "Gleidson ";
		String sobrenome = "Moura";
		
		System.out.println(nome + sobrenome);
		
		
		int u = 21;
		int incremento = ++u;
		System.out.println(u);
		System.out.println("Incremento " + incremento);
		
		int v = 21;
		int decremento = --v;
		System.out.println(u);
		System.out.println("Decremento " + decremento);
		
		u = u + 10;
		System.out.println(u);
		u += 10;
		System.out.println(u);
		u -= 10;
		System.out.println(u);
		u *= 10;
		System.out.println(u);
		u /= 10;
		System.out.println(u);
		
		
		
	}
	
}
