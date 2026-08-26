// class Solution {
//     public void rev(int[] num, int start, int end){
//         while(start <= end){
//             int temp = num[start];
//             num[start] = num[end];
//             num[end] = temp;

//             end--;
//             start++;
//         }
//     }
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         if(k % n == 0){
//             return;
//         }
//         k = k % n;
//         rev(nums, 0, n - 1);
//         rev(nums, 0, k - 1);
//         rev(nums, k, n - 1);

//     }
// }

class Solution {
    public void rotate(int[] nums, int k){
        int n = nums.length;

        int count = 0;
        for(int i = 0; count < n; i++){
            int idx = i;
            int curr = nums[idx];
            do{
                 int next = nums[(idx + k) % n];
                nums[(idx + k) % n] = curr;
                curr = next;
                idx = (idx + k) % n;
                count = count + 1;
            }while(idx != i);
        }
    }
}