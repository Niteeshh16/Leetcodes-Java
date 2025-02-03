package arraybased;
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,5};
       int result = removeDuplicate(array);
        System.out.println("Number of elements after sorting is: "+ result);
        for (int i = 0; i < result; i++) {
            System.out.println(array[i]+ " ");
        }

    }
    public static int removeDuplicate(int[] array){

        int n = array.length;
        if(n <= 1){
            return n;

        }
        int idx = 1;

        for (int i = 1; i < n; i++) {
            if(array[i] != array[i-1]){
                array[idx] = array[i];
                idx++;
            }
        }

        return idx;
    }
}