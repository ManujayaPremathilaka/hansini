import java.util.ArrayList;
import java.util.List;

public class Quandongs4Sale {

    public int makePunnets(int[] quandongs) {
        java.util.Arrays.sort(quandongs);

        // Remove baskets with zero quandongs
        int n = quandongs.length;
        int nonEmptyIndex = 0;
        while (nonEmptyIndex < n && quandongs[nonEmptyIndex] == 0) {
            nonEmptyIndex++;
        }

        // If all baskets are empty, return 0
        if (nonEmptyIndex == n) return 0;

        // All non-empty baskets should have the minimum number of quandongs
        int minQuandongs = quandongs[nonEmptyIndex];
        int totalQuandongs = 0;
        for (int i = nonEmptyIndex; i < n; i++) {
            totalQuandongs += minQuandongs;
        }

        return totalQuandongs;
    }
}
