package dyrelyde;

public class threadClass extends Thread {

	String dyrelyd;

	public threadClass(String dyrelyd) {
		super();
		this.dyrelyd = dyrelyd;
	}

	public void run() {
		int time = 100;
		for (int i = 0; i < 5; i++) {
			try {
				sleep(time);
				time += 100;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(dyrelyd);
		}

	}

}
