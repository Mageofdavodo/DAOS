package opgave04_2socialWorkers;

public class MainApp {

	public static void main(String[] args) {
		Common common = new Common();
		ThreadOffice office1 = new ThreadOffice(common, "Peter");
		ThreadOffice office2 = new ThreadOffice(common, "Morten");
		ThreadSocialWorker worker = new ThreadSocialWorker(common);
		ThreadSocialWorker worker2 = new ThreadSocialWorker(common);

		office1.start();
		office2.start();
		worker.start();
		worker2.start();
	}
}
