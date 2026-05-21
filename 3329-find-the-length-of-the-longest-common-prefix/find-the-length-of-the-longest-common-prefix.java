class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        String[] s1 = new String[n];
        String[] s2 = new String[m];

        for (int i = 0; i < n; i++) s1[i] = String.valueOf(arr1[i]);
        for (int i = 0; i < m; i++) s2[i] = String.valueOf(arr2[i]);

        Arrays.sort(s1);
        Arrays.sort(s2);

        int i = 0, j = 0;
        int maxLen = 0;

        while (i < n && j < m) {
            int len = commonPrefix(s1[i], s2[j]);
            maxLen = Math.max(maxLen, len);

            // Move pointer smartly
            if (s1[i].compareTo(s2[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }

        return maxLen;
    }

    private int commonPrefix(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int len = 0;

        for (int i = 0; i < min; i++) {
            if (a.charAt(i) == b.charAt(i)) len++;
            else break;
        }
        return len;
    }
}