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
				// sleep(2) bruges til at man kan se de skifter frem og tilbage
				// - processoren er for hurtig.
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
