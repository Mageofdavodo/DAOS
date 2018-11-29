package opgave01_buzyWaiting;

public class ThreadOffice extends Thread {
	Common common;
	String navn;
	static boolean[] flag = new boolean[2];
	static int turn = 0;
	static int id = 0;
	int myId = 0;

	public ThreadOffice(Common common) {
		this.common = common;
		this.myId = id;
		id++;
	}

	@Override
	public void run() {
		int other = myId == 0 ? 1 : 0;
		flag[myId] = true;
		turn = other;
		for (int i = 0; i < 50; i++) {
			while (flag[other] && turn == other) {
				try {
					sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			common.pickNumber();
		}
		flag[myId] = false;
	}
}
