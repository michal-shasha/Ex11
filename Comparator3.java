import java.util.Comparator;

public class Comparator3 implements Comparator<ConcretePiece> {
    private boolean blueWon;

    public Comparator3(boolean blueWin1) {
        this.blueWon = blueWin1;
    }

    @Override
    public int compare(ConcretePiece o1, ConcretePiece o2) {
        if (o2.getSquares() != o1.getSquares()) {
            return o2.getSquares() - o1.getSquares();
        }
//       If the distance is equal - we will sort according to the vessel number

        if (o2.getTag() != o1.getTag()) {
            return o1.getTag() - o2.getTag();
        }
//        If the number of the tool is equal - we will sort according to the winning team
        if (blueWon) {
            if (o1.getOwner().isPlayerOne()) {
                return -1;
            }
            return 1;
        } else {
            if (!o1.getOwner().isPlayerOne()) {
                return -1;
            }
            return 1;
        }
    }
}
