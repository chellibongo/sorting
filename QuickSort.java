public class QuickSort {

    //method to swap two elements in an array of ints
    private void swap(int[] arr, int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

    //method to partition array and return new pivot
    private int partition(int[] arr, int low, int high) {
        int n = low;
        for(int i = low+1; i <=high; i++) {
            if(arr[i] < arr[low]) {
                n += 1;
                swap(arr,n, i);
            }
        }
        swap(arr, low, n);
        return n;
    }

    //main part of Quicksort algorithm
    public void sort(int[] arr, int low, int high) {
        if(low < high) {
            //get new pivot
            int p = partition(arr, low, high);
            //recurse on both sides of pivot
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }

    public static void main(String[] args) {
        int[] numarray = {2,7,4,5,9,22,33,41,1};

        QuickSort qs = new QuickSort();
        qs.sort(numarray, 0, numarray.length-1);

        for(int i = 0; i < numarray.length; i++) {
            System.out.print(numarray[i] + ",");
        }
        System.out.println();
    }

}
