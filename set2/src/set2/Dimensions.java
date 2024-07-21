package set2;

public class Dimensions {
	private int feet;
	private int inches;

	public Dimensions(int inches) {
		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;

		}

	}

	public int getFeet() {
		// TODO: Return the value of feet.
		return feet;
	}

	public int getInches() {
		// TODO: Return the value of inches.
		return inches;
	}
}
