import java.util.HashSet;
import java.util.Set;

public class CricketLeap {
    public int countPossible(int[] crickets) {
        Set<Integer> cricketPositions = new HashSet<>();
        for (int cricket : crickets) {
            cricketPositions.add(cricket);
        }

        int count = 0;

        // Iterate over pairs of consecutive crickets only
        for (int i = 0; i < crickets.length - 1; i++) {
            int a = crickets[i];
            int b = crickets[i + 1];

            // Check if cricket A at a can jump over cricket B at b
            int jumpAToB = 2 * b - a;
            if (!cricketPositions.contains(jumpAToB)) {
                count++;
            }

            // Check if cricket B at b can jump over cricket A at a
            int jumpBToA = 2 * a - b;
            if (!cricketPositions.contains(jumpBToA)) {
                count++;
            }
        }

        return count;
    }
}