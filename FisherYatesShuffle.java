import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FisherYatesShuffle {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        System.out.println(Shuffle(numbers));
    }

    public void Shuffle(int[] intArray) {
        Random rand = new Random();

        for(int i = intArray.length - 1; i > 1; i--) {
            int j = rand.nextInt(0, i);

            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
    }

    private static ArrayList<Integer> Shuffle(ArrayList<Integer> numIn) {

        //Generate random seed
        Random rand = new Random();

        //iterate backwards through ArrayList
        for(int i = numIn.size() - 1; i > 1; i--) {
            //pick a random element in array
            int j = rand.nextInt(0, i);
            //swap current element with random one picked
            Collections.swap(numIn, i, j);
        }

        return numIn;
    }
}
