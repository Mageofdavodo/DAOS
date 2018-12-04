package opgave04_2socialWorkers;

public class ThreadSocialWorker extends Thread {

	Common common;

	public ThreadSocialWorker(Common common) {
		this.common = common;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				common.yell();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
