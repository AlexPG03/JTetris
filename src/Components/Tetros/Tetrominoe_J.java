package Components.Tetros;

public class Tetrominoe_J extends Tetrominoe {
    /*
        Shape (3 x 3)
        0º      90º     180º    270º
        r0      r1      r2      r3
        ■ □ □   ■ ■ □   ■ ■ ■   □ ■ □
        ■ ■ ■   ■ □ □   □ □ ■   □ ■ □
        □ □ □   ■ □ □   □ □ □   ■ ■ □
    */
    private static final byte[][] spawnShape = {
            {1, 0, 0},
            {1, 1, 1},
            {0, 0, 0},
    };
    public Tetrominoe_J(String tetroColor) {
        super(tetroColor);
    }

    @Override
    public void rotate() {

    }
}