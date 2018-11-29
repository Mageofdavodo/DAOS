package opgave02_semafor;

public class Common {

	public int counter = 0;
	public volatile int queueLast = 0;

	public Common() {

	}

	public void pickNumber() {
		this.queueLast++;
		System.out.println("trækker nummer: " + queueLast);
	}

	public void yell() {
		this.counter++;
		System.out.println("Nummer: " + counter + "!");
	}

}
