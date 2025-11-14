public class Main {
    public static void main(String[] args) {

        kmpAlgo kmp = new kmpAlgo();
        // short text
        String text1 = "ABABABC";
        String pattern1 = "ABAB";

        long start1 = System.nanoTime();
        System.out.println("Short text matches: " + kmp.kmpAlgo(pattern1, text1));
        long end1 = System.nanoTime();
        System.out.println("Execution time (short): " + (end1 - start1) / 1_000_000.0 + " ms\n");

        // medium text
        String text2 = "AABACAADAABAAABAAABACAAABA";
        String pattern2 = "AABA";

        long start2 = System.nanoTime();
        System.out.println("Medium text matches: " + kmp.kmpAlgo(pattern2, text2));
        long end2 = System.nanoTime();
        System.out.println("Execution time (medium): " + (end2 - start2) / 1_000_000.0 + " ms\n");
        // long text
        String text3 = "AABACAADAABAAABAAABACAAABAAABACAAABAAABAC";
        String pattern3 = "AAABAC";

        long start3 = System.nanoTime();
        System.out.println("Long text matches: " + kmp.kmpAlgo(pattern3, text3));
        long end3 = System.nanoTime();
        System.out.println("Execution time (long): " + (end3 - start3) / 1_000_000.0 + " ms\n");
    }
}
