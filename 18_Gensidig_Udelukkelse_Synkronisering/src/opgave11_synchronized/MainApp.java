package opgave11_synchronized;

public class MainApp {

	public static void main(String[] args) {
		Common common = new Common();
		CommonThread t1 = new CommonThread("0", common);
		CommonThread t2 = new CommonThread("1", common);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(common.getGlobal());

	}

}
