import java.util.HashSet;
import java.util.Set;

class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }

        return hashSet.size() != nums.length;
    }
}
