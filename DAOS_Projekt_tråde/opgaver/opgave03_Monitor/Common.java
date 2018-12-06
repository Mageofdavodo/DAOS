package opgave03_Monitor;

public class Common {

	public int counter = 0;
	public volatile int queueLast = 0;

	public Common() {

	}

	public synchronized void pickNumber() {
		int tal = queueLast + 1;
		System.out.println("trækker nummer: " + tal);
		this.queueLast++;
		notify();
	}

	public synchronized void yell() throws InterruptedException {
		if (queueLast == counter) {
			wait();
		}
		this.counter++;
		System.out.println("Nummer: " + counter + "!");
	}
}
