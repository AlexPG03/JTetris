package Tetrominoes;

public class Tetrominoe_I extends Tetrominoe {
    /*
        Shape (4 x 4)
        0º        90º       180º      270º
        r0        r1        r2        r3
        ■ ■ ■ ■   ■ □ □ □   ■ ■ ■ ■   ■ □ □ □
        □ □ □ □   ■ □ □ □   □ □ □ □   ■ □ □ □
        □ □ □ □   ■ □ □ □   □ □ □ □   ■ □ □ □
        □ □ □ □   ■ □ □ □   □ □ □ □   ■ □ □ □
     */
    public Tetrominoe_I(String tetroColor) {
        super(tetroColor);
        int[][] aux = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } };
        vectPosition = aux;
    }

    @Override
    public int[][] rotate(int numrotate) {
        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        for (int i = 0; i < 4; ++i) {
            aux[i][0] += aux[i][1];
            aux[i][1] = aux[i][0] - aux[i][1];
            aux[i][0] = aux[i][0] - aux[i][1];
        }
        return aux;
    }
} 