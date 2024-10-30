import java.util.HashMap;
import java.util.Map;

public class WordGame {
    public int bestScore(String S) {
        Map<Character, Integer> countMap = new HashMap<>();
        countOccurences(countMap, S);

        int initialScore = getInitialScore(countMap);

        // Find the maximum score possible with one change
        int maxScore = initialScore;
        for (char letterToChange : countMap.keySet()) {
            int originalCount = countMap.get(letterToChange);
            for (char newLetter : countMap.keySet()) {
                if (newLetter != letterToChange) {
                    // New count for the new letter
                    int newCount = countMap.get(newLetter) + originalCount;

                    // Calculate the new score
                    int newScore = initialScore
                            - (originalCount * originalCount) // Remove the score of the old letter
                            - (countMap.get(newLetter) * countMap.get(newLetter)) // Remove the score of the new letter
                            + (newCount * newCount); // Add the new count score

                    // Update max score if this new score is higher
                    maxScore = Math.max(maxScore, newScore);
                }
            }
        }

        return maxScore;
    }

    // Count occurrences of each letter
    public void countOccurences(Map<Character, Integer> countMap, String S){
        for (char ch : S.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
    }

    // Calculate the initial score
    public int getInitialScore(Map<Character, Integer> countMap){
        int initialScore = 0;

        for (int freq : countMap.values()) {
            initialScore += freq * freq;
        }
        return initialScore;
    }
}
