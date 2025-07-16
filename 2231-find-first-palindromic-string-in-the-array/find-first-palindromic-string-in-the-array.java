class Solution {
    public String firstPalindrome(String[] words) {
       for(int i=0;i<words.length;i++){
          String s = words[i];
          String s1 = "";
          for(int j=s.length()-1;j>=0;j--){
            s1=s1+s.charAt(j);
          }
          if(s.equals(s1)){
            return words[i];
          }
        }
        return "";
    }
}
