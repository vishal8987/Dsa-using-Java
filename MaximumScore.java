public class MaximumScore {
    public static int maxScore(int[] arr) {
        int n = arr.length;

        // Create a DP table to store the maximum score for subarrays
        int[][] dp = new int[n][n];

        // Initialize the DP table with minimum values
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Initialize the minimum array values for subarrays of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = arr[i];
        }

        // Iterate over subarray lengths
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                // Calculate the maximum score for the current subarray
                dp[i][j] = Math.max(
                    arr[i] * len + dp[i + 1][j],   // Score for removing the left element
                    arr[j] * len + dp[i][j - 1]    // Score for removing the right element
                );
            }
        }

        // The maximum score for the entire array is stored in dp[0][n-1]
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int maxScore = maxScore(arr);
        System.out.println("Maximum Score: " + maxScore);
    }
}
