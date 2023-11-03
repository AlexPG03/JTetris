package Tetrominoes;

public class Tetrominoe_J extends Tetrominoe {
    /*
        Shape (3 x 3)
        0º      90º     180º    270º
        r0      r1      r2      r3
        ■ □ □   ■ ■ □   ■ ■ ■   □ ■ □
        ■ ■ ■   ■ □ □   □ □ ■   □ ■ □
        □ □ □   ■ □ □   □ □ □   ■ ■ □
    */
    public Tetrominoe_J(String tetroColor) {
        super(tetroColor);

        int[][] aux = { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 1, 2 } };
        vectPosition = aux;
    }

    @Override
    public int[][] rotate(int numrotate) {
        int[][][] r = { { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, -2 } },
                { { 1, 1 }, { 0, 2 }, { -1, 1 }, { -2, 0 } },
                { { 1, -2 }, { 2, -1 }, { 1, 0 }, { 0, 1 } },
                { { -2, 0 }, { -1, -1 }, { 0, 0 }, { 1, 1 } } };

        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        for (int i = 0; i < 4; ++i) {
            aux[i][0] += r[numrotate % 4][i][0];
            aux[i][1] += r[numrotate % 4][i][1];
        }
        return aux;
    }

}
