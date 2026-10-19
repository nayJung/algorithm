import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] counts = new int[patterns.length];
        int max = 0;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < patterns.length; j++){
                if(answers[i] == patterns[j][i % patterns[j].length]){
                    counts[j]++;
                }
            }
        }

        for(int count : counts){
            max = Math.max(max, count);
        }

        for(int i = 0; i < counts.length; i++){
            if(counts[i] == max){
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}