class Solution {
    public int maximum69Number (int num) {
        int d = (int)Math.log10(num);
        int pow = (int)Math.pow(10, d);
        // System.out.println(pow);
        int sum = 0;
        while(pow > 0){
            int c = num / pow;
            // System.out.println(c);
            if(c == 6){
                sum = ((sum * 10 + 9) * pow) + (num % pow);
                break;
            }
            sum = sum * 10 + c;
            num = num % pow;
            pow = pow/10;
            // System.out.println(num + " " + sum + " " + pow);
        }
        return sum;
    }
}