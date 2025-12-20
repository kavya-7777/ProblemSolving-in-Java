//496. Next Greater Element I

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()) map.put(stack.pop(), -1);

        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] result = new int[nums1.length];

//         for(int i=0;i<nums1.length;i++){
//             int current = nums1[i];
//             int indexInNums2 = -1;
//             for(int j=0;j<nums2.length;j++){
//                 if(nums1[i] == nums2[j]){
//                     indexInNums2 = j;
//                     break;
//                 }
//             }

//             int nextGreater = -1;
//             for(int j=indexInNums2+1;j<nums2.length;j++){
//                 if(nums2[j] > current){
//                     nextGreater = nums2[j];
//                     break;
//                 }
//             }
//             result[i] = nextGreater;
//         }
//         return result;
//     }
// }