package opgave04_2socialWorkers;

public class Common {
	public volatile int counter = 0;
	public volatile int queueLast = 0;
	public int count, nextIn, nextOut = 0;
	public String[] buffer;

	public Common() {
		buffer = new String[25];
	}

	public synchronized void pickNumber(String navn) throws InterruptedException {
		try {
			while (count == buffer.length) {
				wait();
			}
			this.queueLast++;
			buffer[nextIn] = navn;
			System.out.println(buffer[nextIn] + " trækker nummer: " + queueLast + " (Index: " + nextIn + ")");
			nextIn = (nextIn + 1) % buffer.length;
			this.count++;
		} finally {
			notify();
		}
	}

	public synchronized void yell() throws InterruptedException {
		try {
			while (count == 0) {
				wait();
			}
			counter++;
			System.out.println("Nummer: " + counter + ": " + buffer[nextOut] + " (index: " + nextOut + ")");
			nextOut = (nextOut + 1) % buffer.length;
			count--;
		} finally {
			notify();
		}
	}

}
