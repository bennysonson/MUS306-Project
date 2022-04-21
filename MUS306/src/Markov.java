
public class Markov {

	static int[] measure = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		
		//vocal:  15 7 8 9 0 6 15 9 9 14 6 14 9 9 14 9 1 14 14 14 14 14 9 9 9 9 3 14 14 9 14 6 5 2 0 16 9 9 14 14 
		HipHat hh = new HipHat(true);
		KickSnare ks = new KickSnare(true);
		Piano piano = new Piano("Am", true);
		Vocal vocal = new Vocal();
		
		System.out.print("Count:  ");
		for (int i = 0; i < measure.length; i++) {
			System.out.print(measure[i] + " ");
			if ((i + 1) % 4 == 0)
				System.out.print("|");
		}
		
		System.out.println();
		System.out.print("hi hat: ");
		
		int[] hihatMeasure = hh.getMeasure();
		for (int i = 0; i < hihatMeasure.length; i++) {
			System.out.print(hihatMeasure[i] + " ");
			if ((i + 1) % 4 == 0) {
				System.out.print("|");
			}
		}
		
		System.out.println();
		System.out.print("kick:   ");
		for (int i = 0; i < ks.getKicks().length; i++) {
			System.out.print(ks.getKicks()[i] + " ");
			if ((i + 1) % 4 == 0)
				System.out.print("|");
		}
		
		System.out.println();
		System.out.print("snare:  ");
		for (int i = 0; i < ks.getSnares().length; i++) {
			System.out.print(ks.getSnares()[i] + " ");
			if ((i + 1) % 4 == 0)
				System.out.print("|");
		}
		
		System.out.println();
		System.out.print("clap:   ");
		for (int i = 0; i < ks.getClaps().length; i++) {
			System.out.print(ks.getClaps()[i] + " ");
			if ((i + 1) % 4 == 0)
				System.out.print("|");
		}
		
		System.out.println();
		System.out.print("hey:    ");
		for (int i = 0; i < ks.getHeys().length; i++) {
			System.out.print(ks.getHeys()[i] + " ");
			if ((i + 1) % 4 == 0)
				System.out.print("|");
		}
		
		System.out.println();
		System.out.print("piano:  ");
		for (int i = 0; i < piano.getPiano().length; i++) {
			System.out.print(piano.getPiano()[i] + " ");

		}
		
		System.out.println("\n");
		System.out.print("vocal:  ");
		for (int i = 0; i < vocal.getVocals().length; i++) {
			System.out.print(vocal.getVocals()[i] + " ");

		}
	}
}
