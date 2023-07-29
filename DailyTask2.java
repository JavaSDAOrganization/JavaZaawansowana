public class DailyTask2 {
    public static int count (String message) {
        if (message == null || message.length() == 0) {
            return 0;
        }
        int n = message.length();
        int[] dp = new int[n+1];
        for (int i = n - 1; i >= 0; i--) {
            if (message.charAt(i) == '0') {
                dp[i] = 0;
            } else {

            }
        }
    }
    public static void main(String[] args) {
        String message = "111";

    }
}
