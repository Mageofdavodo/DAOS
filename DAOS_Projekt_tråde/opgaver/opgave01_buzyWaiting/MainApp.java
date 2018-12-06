package opgave01_buzyWaiting;

public class MainApp {

	public static void main(String[] args) {
		Common common = new Common();
		ThreadOffice office1 = new ThreadOffice(0, common);
		ThreadOffice office2 = new ThreadOffice(1, common);
		ThreadSocialWorker worker = new ThreadSocialWorker(common);

		office1.start();
		office2.start();
		worker.start();
	}
}