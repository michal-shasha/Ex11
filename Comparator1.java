import java.util.Comparator;

public class Comparator1 implements Comparator<ConcretePiece> {

    @Override
    public int compare(ConcretePiece c1, ConcretePiece c2) {
        if (c1.stepsArr.size() != c2.stepsArr.size()) {
            return c1.stepsArr.size() - c2.stepsArr.size();
        }
        // The length of their steps is the same - sort by its number
        return c1.getTag() - c2.getTag();
    }
}