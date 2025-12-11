class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            // Skip non-alphanumeric at start
            char a = s.charAt(start);
            if (!((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                start++;
                continue;
            }

            // Skip non-alphanumeric at end
            char b = s.charAt(end);
            if (!((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                end--;
                continue;
            }

            // Convert both to lowercase for comparison
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}