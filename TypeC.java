import java.util.*;

public class TypeC extends Thing {

    private boolean Diagonal;

    public TypeC(int row, int col, char lab) {
        super(row, col, 'y');
        this.isTypeC = true;
    }

    public void maybeTurn(Random rand) {
        if (Diagonal == true) {
            rightTurn();
        } else {
            leftTurn();
        }
        Diagonal = !Diagonal;
        step();

    }
}
