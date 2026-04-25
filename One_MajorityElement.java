import java.util.HashMap;

public class One_MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        One_MajorityElement obj = new One_MajorityElement();

        int[] nums = {2, 2, 1, 1, 2, 2, 2};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}