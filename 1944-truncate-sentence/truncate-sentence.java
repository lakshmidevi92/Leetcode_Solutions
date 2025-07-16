class Solution {
    public String truncateSentence(String s, int k) {
       String a[] = s.split(" ");
       String str = "";
       for(int i=0;i<k;i++){
          if(i!=k-1){
            str=str+a[i]+" ";
          }
          else
          {
            str=str+a[i];
          }
       }
       return str;
        
    }
}