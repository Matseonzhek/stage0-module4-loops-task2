package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        new WordsBuilder().buildPhrase('H', 'e', 'l', 'l', 'o');
    }

    public void buildPhrase(char... chars) {
        int i = 0;
        while (i <= chars.length - 1) {
            System.out.print(chars[i]);
            i++;
        }
    }
}
