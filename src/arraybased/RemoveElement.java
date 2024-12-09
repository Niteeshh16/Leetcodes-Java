package arrayproblems;

public class RemoveElement {
    public static void main(String[] args) {
    int[] array = {1,2,3,3,4,5};
    int value = 3;
    remoElement(array,value);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
          //  System.out.println(array.length);

        }

    }
    public static int remoElement(int[] array, int value){
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value){
                array[k] = array[i];
                k++;
            }

        }
        return k;

    }
}
