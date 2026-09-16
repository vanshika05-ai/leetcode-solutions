class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> a = new HashSet<>();
        for(int num : arr){
            if(a.contains(2*num) || a.contains(num/2) && (num % 2 == 0))    return true;

            a.add(num);
        }
        return false;
    }
}