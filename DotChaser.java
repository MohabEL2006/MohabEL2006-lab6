
public class DotChaser {

  public static void main(String[] args) {
    int N = 200;

    if (args.length != 0)
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    Node L = null;
    Thing list = new Thing();
    int count = 0;
    DotChaser thing = new DotChaser();
    while (true) {
      // Every N rounds, add another typeA and typeB Thing.
      if (count % N == 0) {
        TypeA tA = new TypeA();
        tA.setTypeA();
        L = list.add(tA);
        TypeB tB = new TypeB();
        tB.setTypeB();
        L = list.add(tB);
      }
      list.PRINTALL(L);
      list.MOVEALL(L);
      count++;
    }
  }
}