package opgave02_semafor;

public class MainApp {

	public static void main(String[] args) {
		Common common = new Common();
		ThreadOffice office1 = new ThreadOffice(common);
		ThreadOffice office2 = new ThreadOffice(common);
		ThreadSocialWorker worker = new ThreadSocialWorker(common);

		office1.start();
		office2.start();
		worker.start();
		try {
			worker.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
