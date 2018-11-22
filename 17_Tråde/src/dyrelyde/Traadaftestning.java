package dyrelyde;

public class Traadaftestning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Vi er igang");
		threadClass t1 = new threadClass("MUUH");
		threadClass t2 = new threadClass("ØF");
		threadClass t3 = new threadClass("Mææh");
		t3.setPriority(10);
		t1.start();
		t2.start();

		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Nu er det slut");
	}

}
