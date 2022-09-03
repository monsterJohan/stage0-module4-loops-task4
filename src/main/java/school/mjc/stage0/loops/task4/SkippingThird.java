package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int third = 0;
        for (int i = 1; i <= lastPrinted; i++) {
            third++;
            if (third == 3) {
                third = 0;
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
