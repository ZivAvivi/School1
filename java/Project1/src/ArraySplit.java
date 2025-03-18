public class ArraySplit {
    public static void main(String[] args) {

        int[] arr = Array.getRandomArray(15, -25, 25);

    }
    static int indexEmptyArr1 = 0;
    static int indexEmptyArr2 = 0;


    public static void splitArr(int[] arr, int[] emptyArr1, int[] emptyArr2){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                emptyArr1[indexEmptyArr1] = arr[i];
                indexEmptyArr1++;
            } else {
                emptyArr2[indexEmptyArr2] = arr[i];
                indexEmptyArr2++;
            }
        }
    }

    // merges two sorted array into a bigger array and returns it
    public int[] mergeArrays(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int i=0, j=0, k=0;
        while (i < a.length && j < b.length ){
            if(a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }

}
