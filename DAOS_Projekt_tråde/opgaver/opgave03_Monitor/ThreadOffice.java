package opgave03_Monitor;

import java.util.concurrent.Semaphore;

public class ThreadOffice extends Thread {
	Common common;
	static Semaphore sema = new Semaphore(1);

	public ThreadOffice(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			common.pickNumber();
		}
	}
}
