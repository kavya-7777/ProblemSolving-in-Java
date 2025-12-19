//912. Sort an Array

class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 1) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right){        // divide
        if(left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right){   //merge
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while(i <= mid) temp[k++] = nums[i++];
        while(j <= right) temp[k++] = nums[j++];

        for(int x=0;x<temp.length;x++){
            nums[left + x] = temp[x];
        }
    }
}

// class Solution {
//     public int[] sortArray(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] > nums[j]){
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
//         return nums;
//     }
// }

// class Solution {
//     public int[] sortArray(int[] nums) {
//         Arrays.sort(nums);
//         return nums;
//     }
// }