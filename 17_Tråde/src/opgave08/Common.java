package opgave08;

public class Common {

	public Common() {

	}

	private int global;

	void TagerRandomTid(int max) {
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				int tal = 1;
				String abe = "abe";
				String kat = "kat";
				String abekatmedtal = abe + kat + (tal + max);
			}
		}
	}

	public int getGlobal() {
		return global;
	}

	public void opdaterGlobal() {
		int temp;
		temp = global;
		TagerRandomTid(2);
		global = temp + 1;
	}

}
