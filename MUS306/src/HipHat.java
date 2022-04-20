import java.util.Random;

public class HipHat {
	int[] measure;

	public HipHat(boolean goHard) {
		measure = new int[16];
		Random rand = new Random();
		for (int i = 0; i < measure.length; i += 2) {
			if (rand.nextInt(100) < 90) {
				measure[i] = 1;
			}
		}
		
		for (int i = 1; i < measure.length; i += 2) {
			if (!goHard && rand.nextInt(100) < 20) {
				measure[i] = 1;
			}
			else if (goHard && rand.nextInt(100) < 50)
				measure[i] = 1;
		}
	}
	
	public int[] getMeasure() {
		return measure;
	}
}
