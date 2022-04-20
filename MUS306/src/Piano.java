import java.util.Random;

public class Piano {

	String[] AmSoft = { "A4", "B4", "C5", "E5", "A5", "B5" };
	String[] AmHard = { "E4", "A4", "B4", "C5", "E5", "A5", "B5", "C6", "E6" };
	String[] ESoft = { "G#4", "B4", "E5", "G#5", "B5" };
	String[] EHard = { "E4", "G#4", "B4", "E5", "G#5", "B5", "E6" };
	String[] measure;

	public Piano(String key, boolean goHard) {
		if (key == "Am" && !goHard)
			measure = koenig(AmSoft, getNumbNotes(goHard));
		if (key == "Am" && goHard)
			measure = koenig(AmHard, getNumbNotes(goHard));
		if (key == "E" && !goHard)
			measure = koenig(ESoft, getNumbNotes(goHard));
		if (key == "E" && goHard)
			measure = koenig(EHard, getNumbNotes(goHard));
		
	}

	private int getNumbNotes(boolean goHard) {
		Random rand = new Random();
		int numb = rand.nextInt(100);
		if (!goHard) {
			if (numb < 5)
				return 0;
			if (numb < 15)
				return 3;
			if (numb < 40)
				return 4;
			return 5;
		}
		if (goHard) {
			if (numb < 50)
				return 5;
			if (numb < 60)
				return 6;
			if (numb < 70)
				return 7;
			return 8;
		}
		return 0;
	}

	private String[] koenig(String[] notes, int numbNotes) {
		String[] ret = new String[8];
		Random rand = new Random();
		int n = notes.length - 1;
		int index = 0;
		String temp = null;
		for (int i = 0; i < numbNotes; i++) {
			index = rand.nextInt(n);
			ret[i] = notes[index];
			temp = notes[n];
			notes[n] = notes[index];
			notes[index] = temp;
		}

		return ret;
	}

	public String[] getPiano() {
		return measure;
	}
}
