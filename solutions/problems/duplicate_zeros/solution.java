class Solution {
    public void duplicateZeros(int[] arr) {
        int pZD = 0;
        int lastIdx = arr.length - 1;

        for(int i = 0; i <= lastIdx - pZD; i++){
            if(arr[i] == 0){
                if(i == lastIdx - pZD){
                    arr[lastIdx] = 0;
                    lastIdx -= 1;
                    break;
                }
                pZD++;
            }
        }
        int newLastIdx = lastIdx - pZD;
        for(int i = newLastIdx; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + pZD] = 0;
                pZD--;
                arr[i + pZD] = 0;
            }else{
                arr[i + pZD] = arr[i];
            }
        }
    }
}