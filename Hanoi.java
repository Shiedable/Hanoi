public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDiscs = 5;
        towerOfHanoi(numDiscs, "A", "C", "B");
    }

    public static void towerOfHanoi(int numDiscs, String fromPeg, String toPeg, String auxPeg) {
        if (numDiscs == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }else {
            towerOfHanoi(numDiscs - 1, fromPeg, auxPeg, toPeg);
            System.out.println("Move disk " + numDiscs + " from peg " + fromPeg + " to peg " + toPeg);
            towerOfHanoi(numDiscs - 1, auxPeg, toPeg, fromPeg);
        }
    }
}
