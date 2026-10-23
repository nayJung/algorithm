class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}