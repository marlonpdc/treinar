package estudo.thread;

public class Programa implements Runnable {

	private Integer id;

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
			if (i % 1000 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
