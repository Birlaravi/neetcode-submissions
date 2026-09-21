class Solution {
    public boolean isPalindrome(String s) {
    
       StringBuilder s1 = new StringBuilder();

        for (char a : s.toLowerCase().toCharArray()) {
           if(isAlphaNumeric(a)){
              s1.append(a);
           }
       }

           String original = s1.toString();
String reversed = s1.reverse().toString();
return original.equals(reversed);
    }

    boolean isAlphaNumeric(char c){

        if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
            return true;
        }
       return false;
    }
}
