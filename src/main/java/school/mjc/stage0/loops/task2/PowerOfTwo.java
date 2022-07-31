package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        new PowerOfTwo().printPower(4);
    }
    public void printPower(int power) {
        if(power<0){
            System.out.println("too much power");
        } else {
            int i = 0;
            double result;
            while (i<power+1){
                result = Math.pow(2,i);
                System.out.println((int) result);
                i++;

            }
        }
    }
}
