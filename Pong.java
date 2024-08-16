class Pong {
    private static final int BORD_X = 6;
    private static final int BORD_Y = 6;

    private static void drawBord() {
	int[][] bord = new int[BORD_Y][BORD_X];

        char value = 0;
	for (int y = 0; y < Pong.BORD_Y; y++) {
            for (int x = 0; x < Pong.BORD_X; x++) {
                value = ++value;
                bord[y][x] = value;

		System.out.println(bord[y][x] + " ");
            }
	}


    }

    public static void main(String[] args) {
	Pong.drawBord();
    }
}
