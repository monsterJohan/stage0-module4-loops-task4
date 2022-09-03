package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip <= lastInRow) {
            int skippedSum = 0;
            int actualSum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    skippedSum += i;
                } else {
                    actualSum += i;
                }
            }

            System.out.println("skipped sum is " + skippedSum + "\n" + "counted sum is " + actualSum);
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        }
    }
}
