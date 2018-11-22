package opgave07_lotto;

public class threadClassLotto extends Thread {

	int minRange;
	int maxRange;
	Lottoraek[] rows;
	Lottoraek rigtig;
	int[] rowAntal;

	public threadClassLotto(int minRange, int maxRange, Lottoraek[] rows, Lottoraek rigtig, int[] rowAntal) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.rows = rows;
		this.rigtig = rigtig;
		this.rowAntal = rowAntal;
	}

	public void run() {
		int antal = 0;
		for (int i = minRange; i < maxRange; i++) {
			antal = rows[i].antalRigtige(rigtig);
			rowAntal[antal]++;
		}

	}

}
