package school.mjc.stage0.loops.task2;

public class FactorialNumbers {

    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) {
            System.out.println(1);
        } else {
            int result = 1;
            int i = 1;
            while (i < printToInclusive + 2) {
                System.out.println(result);
                result = result * i;
                i++;
            }
        }
    }

}

