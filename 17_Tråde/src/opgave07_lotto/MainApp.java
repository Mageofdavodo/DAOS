package opgave07_lotto;

public class MainApp {

	public static void main(String[] args) {
		Lottoraek[] rows = new Lottoraek[10000000];

		for (int i = 0; i < 10000000; i++) {
			rows[i] = new Lottoraek();
		}

		Lottoraek rigtigRow = new Lottoraek();
		int[] rowAntal1 = new int[8];
		int[] rowAntal2 = new int[8];
		long startTime = System.nanoTime();
		threadClassLotto t1 = new threadClassLotto(0, rows.length / 2, rows, rigtigRow, rowAntal1);
		threadClassLotto t2 = new threadClassLotto(rows.length / 2, rows.length, rows, rigtigRow, rowAntal2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();

		for (int i = 0; i < rowAntal1.length; i++) {
			int sum = 0;
			sum = rowAntal1[i] + rowAntal2[i];
			System.out.println(i + " Rigtige: " + sum);

		}

		System.out.println("Total tid brugt: " + (endTime - startTime) / 1000000);
	}

}
