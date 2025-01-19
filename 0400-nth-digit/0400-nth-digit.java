class Solution {
    public int findNthDigit(int n){
        long digitCount=1;
        long range=9;
        long start=1;
        while (n>digitCount*range){
            n-=digitCount*range;
            digitCount++;
            range*=10;
            start*=10;
        }
        long number=start+(n-1)/digitCount;
        String numberString=Long.toString(number);
        int digit=(int)numberString.charAt((int)((n-1)%digitCount))-'0';
        return digit;
    }
}