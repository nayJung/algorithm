import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        /*
        1. 조합을 구하지 않고도 최댓값을 알 수 있는 문제인지를 먼저 판단하기
        2. 선택할 수 있는 폰켓몬 수와 서로 다른 폰켓몬 수 중 작은 값을 리턴
         */

        int num = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        return Math.min(num, set.size());
    }
}