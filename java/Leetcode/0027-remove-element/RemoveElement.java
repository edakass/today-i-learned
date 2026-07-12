import java.util.Arrays;

/*
Medium (TR): Detailed explanation
https://medium.com/@edakas/leetcode-27-remove-element-probleminin-java-ile-%C3%A7%C3%B6z%C3%BCm%C3%BC-286d1b1c7b83
 */

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            System.out.println("i = " + i + ", nums[i] = " + nums[i]);

            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }

            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println();
        }

        return counter;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("Value to remove: "+ val);

        int k = removeElement(nums, val);
        System.out.println("k = " + k);

    }
}
