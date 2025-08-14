class Solution {
    public String largestGoodInteger(String num) {
        int max = -1, c = 0;
        int k = -1;
        int n = num.length(), prev = -1;
        for(int i = 0; i < n; i++){
            int ch = num.charAt(i) - '0';
            if(ch == prev){
                c++;
                if(c == 3){
                    if(ch > max){
                        max = ch;
                        k = i - 2;
                    }
                }
            }
            else{
                c = 1;
                prev = ch;
            }
        }
        return k == -1? "" : num.substring(k, k + 3);
    }
}