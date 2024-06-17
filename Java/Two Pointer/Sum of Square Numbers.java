// use 2 pointer approach in this left = 0 and right is the square root of the c (i.e 2.2) . Since long is mentioned it ignores the decimal value

class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0 , right =(long)Math.sqrt(c);
        while(left <= right){
            if(left * left + right * right == c) return true;
            if(left * left + right * right > c) right--;
            else left++;
        }
        return false;
    }
}
