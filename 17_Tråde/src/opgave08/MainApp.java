package opgave08;

public class MainApp {

	public static void main(String[] args) {
		Common common = new Common();
		CommonThread t1 = new CommonThread("Fisk", common);
		CommonThread t2 = new CommonThread("Bananer", common);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(common.getGlobal());

	}

}
