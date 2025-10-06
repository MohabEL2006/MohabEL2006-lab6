import java.util.*;

public abstract class Thing {
    protected int row, col, dir, timeSinceLast;
    protected char lab;
    protected Random rand = new Random();
    protected boolean isTypeB;
    protected boolean isTypeC;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = rand.nextInt(4);
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = { 0, 1, 0, -1 };
        final int[] dr = { -1, 0, 1, 0 };
        row += dr[dir];
        col += dc[dir];
    }

    public abstract void maybeTurn(Random rand);

    public String toString() {
        return row + " " + col + " " + lab;
    }
}
