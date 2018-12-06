package opgave03_Monitor;

public class ThreadOffice extends Thread {
	Common common;

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
