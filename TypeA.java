import java.util.*;

public class TypeA extends Thing {
    public TypeA(int row, int col, char lab) {
        super(row, col, 'r');
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
        step();
    }
}