package school.mjc.stage0.loops.task2;

public class Multiplication {

    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1;
        int digit = 0;
        int multiplier = multiplyByAndToInclusive;

        if (multiplyByAndToInclusive < 0) {
            multiplier = -multiplier;
        }

        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
            while (i <= multiplier + 1) {
                System.out.println(digit * multiplyByAndToInclusive);
                i++;
                digit++;
            }
        }
    }
}
