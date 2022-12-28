// Problem -> Rearrange characters in a string such that no two adjacent are same

class Solution{
    String chooseandswap(String A){
        char[] arr = A.toCharArray();
        int[] freq = new int[26];
        for(char c : arr){
            freq[c - 'a']++;
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            char curr = arr[i];
            for(int j = 0 ; j < (curr - 'a'); j++){
                if(freq[j] > 0) return replace(arr, curr, (char) ('a' + j));
            }
            freq[curr - 'a'] = 0;
        }
       return A;
    }
    
    String replace(char[] arr, char a, char b){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == a) arr[i] = b;
            else if(arr[i] == b) arr[i] = a;
        }
        return String.valueOf(arr);
    }
    
}