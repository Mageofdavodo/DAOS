package opgave03_Monitor;

public class ThreadSocialWorker extends Thread {

	Common common;

	public ThreadSocialWorker(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			while (common.queueLast == common.counter) {

			}
			common.yell();
		}
	}

}
