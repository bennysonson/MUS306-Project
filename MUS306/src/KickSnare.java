import java.util.Random;

public class KickSnare {

	int[] kick;
	int[] snare;
	int[] clap;
	int[] hey;

	public KickSnare(boolean goHard) {
		kick = new int[16];
		snare = new int[16];
		clap = new int[16];
		hey = new int[16];
		Random rand = new Random();
		if (rand.nextInt(100) < 80)
			kick[0] = 1;

		if (goHard && kick[0] == 1 && rand.nextInt(100) < 15)
			kick[1] = 1;

		if (goHard && rand.nextInt(100) < 30)
			kick[2] = 1;

		if (kick[2] == 0 && rand.nextInt(100) < 30)
			snare[2] = 1;

		if (goHard && kick[2] == 0 && rand.nextInt(100) < 30)
			kick[3] = 1;
		if (goHard && kick[2] == 1 && rand.nextInt(100) < 10)
			kick[3] = 1;

		if (goHard && rand.nextInt(100) < 10)
			kick[4] = 1;

		if (kick[0] == 1) {
			if (rand.nextInt(100) < 80)
				snare[8] = 1;
			if (rand.nextInt(100) < 80)
				kick[6] = 1;
		} else {
			if (rand.nextInt(100) < 50)
				snare[8] = 1;
			if (rand.nextInt(100) < 50)
				kick[6] = 1;
		}

		if (goHard && rand.nextInt(100) < 50)
			kick[7] = 1;

		if (!goHard && rand.nextInt(100) < 20)
			kick[10] = 1;
		else if (goHard && rand.nextInt(100) < 50)
			kick[10] = 1;

		if (goHard && snare[8] == 1 && rand.nextInt(100) < 40)
			snare[11] = 1;

		if (snare[11] == 0 && rand.nextInt(100) < 50)
			snare[12] = 1;

		if (rand.nextInt(100) < 40)
			kick[14] = 1;

		if (kick[14] == 0 && rand.nextInt(100) < 50)
			snare[14] = 1;

		if (goHard && rand.nextInt(100) < 20)
			kick[15] = 1;

		if (goHard && snare[14] == 1 && kick[15] == 0 && rand.nextInt(100) < 50)
			snare[15] = 1;
		else if (goHard && snare[14] == 0 && kick[15] == 0 && rand.nextInt() < 20)
			snare[15] = 1;

		if (goHard) {
			for (int i = 0; i < snare.length; i++)
				if (snare[i] == 1)
					if (rand.nextInt(100) < 50)
						clap[i] = 1;
			if (rand.nextInt(100) < 50) {
				hey[4] = 1;
				hey[12] = 1;
			}
		}

	}

	public int[] getKicks() {
		return kick;
	}

	public int[] getSnares() {
		return snare;
	}

	public int[] getClaps() {
		return clap;
	}

	public int[] getHeys() {
		return hey;
	}
}
