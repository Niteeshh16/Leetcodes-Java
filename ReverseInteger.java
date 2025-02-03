public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        int reversed = 0;
        while (x != 0){
            int lastDigit =  x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x/10;

        }
        System.out.println(reversed);
    }
}
