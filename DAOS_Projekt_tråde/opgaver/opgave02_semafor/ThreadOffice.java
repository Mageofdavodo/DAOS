package opgave02_semafor;

import java.util.concurrent.Semaphore;

public class ThreadOffice extends Thread {
	Common common;
	static Semaphore sema = new Semaphore(1);

	public ThreadOffice(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		try {
			sema.acquire();
			for (int i = 0; i < 50; i++) {
				common.pickNumber();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sema.release();
	}
}
