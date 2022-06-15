public class BubbleSort {

    public void sort(int[] intArray) {

        for(int i = 0; i < intArray.length - 1; i++) {
            for(int j = 0; j < intArray.length - i - 1; j++) {
                if(intArray[j] > intArray[j + 1]) {
                        int temp = intArray[j];
                        intArray[j] = intArray[j+1];
                        intArray[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int testArray[] = {9,8,7,6,5,4,3,2,1};
        BubbleSort bs = new BubbleSort();

        bs.sort(testArray);

        for(int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + ",");
        }

        System.out.println();
    }
}
