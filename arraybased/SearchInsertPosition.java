package arraybased;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,8};
        int target = 9;
      //  findOrInsertElement(nums,target);
        System.out.println(findOrInsertElement(nums,target));

    }
    public static int findOrInsertElement(int[] nums, int target){

        int start = 0;
        int end = nums.length -1;


        while(start <= end){
            int mid = start+(end - start) /2;
            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = end -1;

            }else{
                return mid;
            }
        }


        return start;
    }

}
