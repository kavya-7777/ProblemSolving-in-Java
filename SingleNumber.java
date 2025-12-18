//136. Single Number

/* Properties of XOR(^):
      a ^ a = 0
      a ^ 0 = a
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
//         for(int num : map.keySet()){
//             if(map.get(num) == 1) return num;
//         }
//         return 0;
//     }
// }

// class Solution {
//     public int singleNumber(int[] nums) {
//         int[] hash = new int[10];
//         for(int i=0;i<nums.length;i++){
//             hash[nums[i]]++;
//         }
//         for(int i=0;i<10;i++){
//             if(hash[i] == 1) return i;
//         }
//         return 0;
//     }
// }