package opgave11_synchronized;

public class CommonThread extends Thread {

	private Common x;
	private String navn;

	public CommonThread(String navn, Common common) {
		this.navn = navn;
		x = common;
	}

	public void run() {

		for (int j = 0; j < 100; j++) {
			x.opdaterGlobal();
			x.TagerRandomTid(5);
		}

	}

}
