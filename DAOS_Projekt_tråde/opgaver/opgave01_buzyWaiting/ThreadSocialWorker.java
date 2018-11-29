package opgave01_buzyWaiting;

public class ThreadSocialWorker extends Thread {

	Common common;

	public ThreadSocialWorker(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			while (common.queueLast == common.counter) {
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
			common.yell();
		}

	}
}
