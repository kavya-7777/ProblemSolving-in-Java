//1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int secondFind = target - nums[i];
            if(map.containsKey(secondFind)){
                return new int[]{i, map.get(secondFind)};
            }
            map.put(nums[i],i);
        }

        return null;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],i);
//         }
//         for(int i=0;i<nums.length;i++){
//             int secondFind = target - nums[i];
//             if(map.containsKey(secondFind) && (map.get(secondFind) != i)){
//                 return new int[]{i, map.get(secondFind)};
//             }
//         }
//         return null;
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] + nums[j] == target){
//                     result[0] = i;
//                     result[1] = j;
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }