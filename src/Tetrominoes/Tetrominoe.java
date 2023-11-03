package Tetrominoes;

public abstract class Tetrominoe {
    protected String tetroColor;
    protected int[][] vectPosition;

    public Tetrominoe(String tetroColor) {
        this.tetroColor = tetroColor;
    }

    public int[][] getVectorPosition(){
        return vectPosition;
    }
    
    public void setVectPosition(int[][] vectPosition) {
        this.vectPosition = vectPosition;
    }

    public int[][] mov_left() {
        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        for (int i = 0; i < 4; ++i) {
            aux[i][1]++;
        }
        return aux;
    }

    public int[][] mov_rigth() {
        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        for (int i = 0; i < 4; ++i) {
            aux[i][1]--;
        }
        return aux;
    }

    public int[][] mov_down() {
        int[][] aux = new int[4][2];
        System.arraycopy(vectPosition, 0, aux, 0, vectPosition.length);
        for (int i = 0; i < 4; ++i) {
            aux[i][0]++;
        }
        return aux;
    }

    abstract public int[][] rotate(int numrotate);
}
