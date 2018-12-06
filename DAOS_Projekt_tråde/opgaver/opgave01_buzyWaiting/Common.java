package opgave01_buzyWaiting;

public class Common {

	public int counter = 0;
	public volatile int queueLast = 0;

	public Common() {

	}

	public void pickNumber() {
		int tal = queueLast + 1;
		System.out.println("trækker nummer: " + tal);
		this.queueLast++;
	}

	public void yell() {
		while (queueLast == counter)
			;
		this.counter++;
		System.out.println("Nummer: " + counter + "!");
	}

}
