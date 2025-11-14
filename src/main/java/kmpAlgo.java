import java.util.ArrayList;
import java.util.List;

public class kmpAlgo {

    private Metrics metrics = new Metrics();

    public Metrics getMetrics() {
        return metrics;
    }

    // KMP string search
    public List<Integer> kmpAlgo(String pattern, String text) {
        List<Integer> matches = new ArrayList<>();

        if (pattern == null || pattern.isEmpty() || text == null || text.isEmpty()) {
            return matches;
        }

        long start = System.nanoTime();

        int M = pattern.length();
        int N = text.length();

        // Precompute LPS array
        int[] lps = new int[M];
        computeLPS(pattern, lps);

        int i = 0; // index for text
        int j = 0; // index for pattern

        while (i < N) {
            metrics.incComp();

            if (pattern.charAt(j) == text.charAt(i)) {
                metrics.incComp();
                i++;
                j++;
            }

            if (j == M) {
                // Match found
                matches.add(i - j);
                j = lps[j - 1];
            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                metrics.incComp();

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        long end = System.nanoTime();
        double execMS = (end - start) / 1_000_000.0;

        return matches;
    }

    // Build LPS array
    private void computeLPS(String pat, int[] lps) {
        int len = 0;
        int i = 1;

        lps[0] = 0;

        while (i < pat.length()) {
            metrics.incComp();

            if (pat.charAt(i) == pat.charAt(len)) {
                metrics.incComp();
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
