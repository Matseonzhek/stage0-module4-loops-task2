package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int count = 1;
        int output = 0;
        while (count <= lastPrinted+1) {
            System.out.println(output);
            count++;
            output = output + 1;
        }
    }
}
