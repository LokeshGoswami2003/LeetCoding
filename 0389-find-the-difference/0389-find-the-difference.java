class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        char a=s.charAt(0);
        for(int i=1;i<s.length();i++){
            a^=(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            a^=(t.charAt(i));
        }
        return a;
    }
}