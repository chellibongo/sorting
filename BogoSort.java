public class BogoSort {

    private boolean sorted(int[] intArray) {
        for(int i = 0; i < intArray.length - 1; i++) {
            if(intArray[i] > intArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    public void sort(int[] intArray) {
        FisherYatesShuffle fys = new FisherYatesShuffle();

        while(sorted(intArray) != true) {
            fys.Shuffle(intArray);
        }
    }

    public static void main(String[] args) {
        int[] intArray = {5, 8, 11, 12, 14, 2, 101, 33};
        BogoSort bogosort = new BogoSort();

        bogosort.sort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ",");
        }
        System.out.println();
    }
}
