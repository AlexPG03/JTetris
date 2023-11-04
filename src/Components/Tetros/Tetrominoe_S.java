package Components.Tetros;

import GUI.Properties.TColor;

public class Tetrominoe_S extends Tetrominoe {
    /*
        Shape (3 x 3)
        0º      90º     180º    270º
        r0      r1      r2      r3
        □ ■ ■   □ ■ □   □ □ □   ■ □ □
        ■ ■ □   □ ■ ■   □ ■ ■   ■ ■ □
        □ □ □   □ □ ■   ■ ■ □   □ ■ □
    */
    private static final byte[][] spawnShape = {
            {0, 5, 5},
            {5, 5, 0},
            {0, 0, 0},
    };
    private final byte[][] rotateShape = new byte[4][4];
    public Tetrominoe_S () {
        tetroColor = TColor.GREEN;
    }

    @Override
    public byte[][] rotate(byte[][] c) {
        for (int x = 0; x<c.length;x++){
            for (int y= 0; y < c.length; y++){
                rotateShape[y][rotateShape.length -1 -x] = c[x][y];
            }
        }
        return rotateShape ;

    }

    public byte[][] getRotateShape() {
        return rotateShape;
    }

    public byte[][] getSpawnShape() {
        return spawnShape;
    }
}
