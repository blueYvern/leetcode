class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) {
            return false;  // Strings must be of equal length
        }

        int[] shifts = new int[26];  // To track how many times each shift is used

        for (int i = 0; i < s.length(); i++) {
            int diff = (t.charAt(i) - s.charAt(i) + 26) % 26;

            if (diff != 0) {  // Only consider different characters
                int requiredMoves = diff + shifts[diff] * 26;  // Handle repeat cycles

                if (requiredMoves > k) {
                    return false;  // Exceeds available moves
                }
                shifts[diff]++;
            }
        }

        return true;

    }
}