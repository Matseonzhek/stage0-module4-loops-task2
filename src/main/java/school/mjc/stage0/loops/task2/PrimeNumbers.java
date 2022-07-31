package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        switch (printToInclusive) {
            case (0):
                System.out.print("");
                break;
            case (1):
                System.out.print("");
            case (2):
                System.out.println(2);
                break;
            case (3):
                System.out.println("2" + "\n" + "3");
                break;
            case (4):
                System.out.println("""
                        2
                        3""");
                break;
            case (5):
                System.out.println("""
                        2
                        3
                        5""");
                break;
            default:
                System.out.println("""
                        2
                        3
                        5""");
                int i = 6;
                while (i <= printToInclusive) {
                    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                        System.out.print("");
                    } else {
                        System.out.println(i);
                    }
                    i += 1;
                }
                break;
        }
    }
}
