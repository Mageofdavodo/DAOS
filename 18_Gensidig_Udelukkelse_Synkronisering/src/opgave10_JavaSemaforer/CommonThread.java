package opgave10_JavaSemaforer;

import java.util.concurrent.Semaphore;

public class CommonThread extends Thread {

	private Common x;
	static Semaphore sema;
	private String navn;

	public CommonThread(String navn, Common common) {
		this.navn = navn;
		sema = new Semaphore(1);
		x = common;
	}

	public void run() {
		try {
			sema.acquire();
			for (int j = 0; j < 100; j++) {
				x.opdaterGlobal();
				x.TagerRandomTid(5);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sema.release();
	}

}
