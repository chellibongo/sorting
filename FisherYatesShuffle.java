import java.util.ArrayList;
import java.util.Random;

public class FisherYatesShuffle {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        System.out.println(Shuffle(numbers));
    }

    private static ArrayList<Integer> Shuffle(ArrayList<Integer> numIn) {
        ArrayList<Integer> numOut = new ArrayList<Integer>();
        Random rand = new Random();

        while(numIn.size() > 0) {
            int n = rand.nextInt(0, numIn.size());
            numOut.add(numIn.get(n));
            numIn.remove(n);
        }

        return numOut;
    }
}
