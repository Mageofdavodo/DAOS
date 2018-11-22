package opgave5;

public class MainApp {

	public static void main(String[] args) {
		Lottoraek[] rows = new Lottoraek[10000000];

		for (int i = 0; i < 10000000; i++) {
			rows[i] = new Lottoraek();
		}

		long startTime = System.nanoTime();
		Lottoraek rigtigRow = new Lottoraek();
		int antal = 0;
		int[] rowAntal = new int[8];
		for (int i = 0; i < rows.length; i++) {
			antal = rows[i].antalRigtige(rigtigRow);
			rowAntal[antal]++;
		}
		long endTime = System.nanoTime();
		for (int i = 0; i < rowAntal.length; i++) {
			System.out.println(i + " Rigtige: " + rowAntal[i]);
		}

		System.out.println("Total tid brugt: " + (endTime - startTime) / 1000000);
	}

}
