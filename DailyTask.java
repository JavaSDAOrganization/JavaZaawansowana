import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DailyTask {
    public static int countDecodedWays(String message) {
        if (message == null || message.length() == 0) {
            return 0;
        }

        int n = message.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (message.charAt(i) == '0') {
                dp[i] = 0;
            } else {
                dp[i] = dp[i + 1];
                if (i < n - 1 && (message.charAt(i) == '1' || (message.charAt(i) == '2' && message.charAt(i + 1) <= '6'))) {
                    dp[i] += dp[i + 2];
                }
            }
        }

        return dp[0];
    }


    public static void main(String[] args) {
        String message = "1124";
        int ways = countDecodedWays(message);
        System.out.println("Number of ways the message can be decoded: " + ways); // Output: 3
    }
}