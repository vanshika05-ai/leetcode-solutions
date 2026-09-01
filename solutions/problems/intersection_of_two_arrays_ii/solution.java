class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // if(nums1.length > nums2.length) return intersect(nums2, nums1);

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        // int i = 0,
        //     j = 0,
        //     k = 0;
        // int[] res = new int[nums1.length];

        // while(i < nums1.length && j < nums2.length){
        //     if(nums1[i] == nums2[j]){
        //         res[k] = nums1[i];
        //         i++;
        //         j++;
        //         k++;
        //     }else if(nums1[i] > nums2[j]){
        //         j++;
        //     }else{
        //         i++;
        //     }
        // }

        // return Arrays.copyOfRange(res, 0, k);
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums1){
            m.put(num, m.getOrDefault(num,0) + 1);
        }
        int k = 0;
        int[] res = new int[nums1.length];
        for(int num : nums2){
            int count = m.getOrDefault(num, 0);
            if(count == 0)      continue;
            else{
                res[k] = num;
                k++;
                m.put(num, count - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}