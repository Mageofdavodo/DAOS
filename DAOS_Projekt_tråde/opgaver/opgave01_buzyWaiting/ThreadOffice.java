package opgave01_buzyWaiting;

public class ThreadOffice extends Thread {
	Common common;
	static boolean[] flag = new boolean[2];
	static int turn = 0;
	private int myId = 0;

	public ThreadOffice(int me, Common common) {
		this.common = common;
		this.myId = me;
	}

	@Override
	public void run() {
		int other = myId == 0 ? 1 : 0;
		for (int i = 0; i < 50; i++) {
			flag[myId] = true;
			turn = other;
			while (flag[other] && turn == other) {
				try {
					sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			common.pickNumber();
			flag[myId] = false;
		}

	}
}
