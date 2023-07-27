class Solution {
    public int majorityElement(int[] nums) {
        int res = 0, count = 0;
        for (int ele : nums) {
            if (count == 0)
                res = ele;
            if (res == ele)
                count++;
            else
                count--;
        }
        return res;

    }
}