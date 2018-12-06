package opgave02_semafor;

import java.util.concurrent.Semaphore;

public class Common {

	public int counter = 0;
	public volatile int queueLast = 0;
	private Semaphore sema = new Semaphore(1);
	private Semaphore semaWait = new Semaphore(0);

	public Common() {
	}

	public void pickNumber() throws InterruptedException {
		sema.acquire();
		int tal = queueLast + 1;
		System.out.println("trækker nummer: " + tal);
		this.queueLast++;
		sema.release();
		semaWait.release();
	}

	public void yell() throws InterruptedException {
		semaWait.acquire();
		this.counter++;
		System.out.println("Nummer: " + counter + "!");
	}
}
