package estudo.wrapper;

public class PoolInteiro {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 10;
		Integer c = 1000;
		Integer d = 1000;
		
		System.out.println(a == b);
		
		System.out.println(c == d);
		
		System.out.println(c.equals(d));
		
	}
	
}
