package opgave08_Peterson;

public class CommonThread extends Thread {

	private Common x;
	static boolean[] flag = new boolean[2];
	static int turn = 0;
	private String navn;

	public CommonThread(String navn, Common common) {
		this.navn = navn;
		x = common;
	}

	public void run() {
		int id = Integer.parseInt(navn);
		int other = id == 0 ? 1 : 0;
		flag[id] = true;
		turn = other;
		for (int j = 0; j < 100; j++) {
			while (flag[other] && turn == other)
				;

			x.opdaterGlobal();
			x.TagerRandomTid(5);
		}
		flag[id] = false;
	}

}
