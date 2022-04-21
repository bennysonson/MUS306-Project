import java.util.Random;

public class Vocal {
		
	public Vocal() {
		
	}
	
	public int[] getVocals() {
		int[] ret = new int[40];
		Random rand = new Random();
		int n = rand.nextInt(16);
		int gen = 0;
		for (int i = 0; i < ret.length; i++) {
			ret[i] = n;
			gen = rand.nextInt(100);
			if (n < 7) {
				if (gen < 80) {
					n = rand.nextInt(8);
				} else {
					n = rand.nextInt(13) + 8;
				}
			} else {
				if (gen < 25) {
					n = 9;
				} else if (gen < 60) {
					n = 14;
				} else if (gen < 90) {
					n = rand.nextInt(13) + 8;
				} else {
					n = rand.nextInt(8);
				}
			}
		}
		
		return ret;
	}
}
