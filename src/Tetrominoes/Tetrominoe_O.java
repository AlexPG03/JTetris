package Tetrominoes;

public class Tetrominoe_O extends Tetrominoe {
    /*
        Shape (2 x 2)
        0º    90º   180º  270º
        r0    r1    r2    r3
        ■ ■   ■ ■   ■ ■   ■ ■
        ■ ■   ■ ■   ■ ■   ■ ■
    */
    public Tetrominoe_O(String tetroColor) {
        super(tetroColor);

        int[][] aux = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
        vectPosition = aux;
    }

    @Override
    public int[][] rotate(int numrotate) {
        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        return aux;
    }
    
}
