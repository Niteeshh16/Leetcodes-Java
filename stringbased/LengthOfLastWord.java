package stringproblems;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        findLength(s);

    }
    public static void findLength(String s){
        // trim the if any space in the beginning or at the end
        String str = s.trim();
        // find the lenth till the space here which is 5
        int lastIndex = str.lastIndexOf(' ');
        //total length - 5 - and -1
        int lengthOfLastWord = str.length() - lastIndex - 1;
        System.out.println(lengthOfLastWord);
    }
}
