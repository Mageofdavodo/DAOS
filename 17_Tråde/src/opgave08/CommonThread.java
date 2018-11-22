package opgave08;

public class CommonThread extends Thread {

	private Common x;

	public CommonThread(String navn, Common common) {
		x = common;
	}

	public void run() {
		for (int j = 0; j < 100; j++) {
			x.opdaterGlobal();
			x.TagerRandomTid(5);
		}
	}

}
