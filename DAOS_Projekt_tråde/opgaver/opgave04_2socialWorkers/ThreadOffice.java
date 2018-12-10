package opgave04_2socialWorkers;

public class ThreadOffice extends Thread {
	private Common common;
	private String navn;

	public ThreadOffice(Common common, String navn) {
		this.common = common;
		this.navn = navn;
	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			try {
				common.pickNumber(navn);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
