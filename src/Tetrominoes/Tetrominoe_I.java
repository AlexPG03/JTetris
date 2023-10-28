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
    private final byte[][] tetrominoe_I_spawnShape = {
            {1, 1, 1, 1},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };
    public Tetrominoe_I (byte tetroDimension, String tetroColor) {
        super (tetroDimension, tetroColor);
    }
}