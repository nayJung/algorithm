class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;

        for(int i = 1; i <= number; i++){
            int count = 0;

            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){
                    if(j * j == i){
                        count++;
                    }else{
                        count += 2;
                    }
                }
            }

            sum += count > limit ? power : count;
        }

        return sum;
    }
}