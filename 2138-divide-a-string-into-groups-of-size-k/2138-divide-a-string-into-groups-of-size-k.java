class Solution {
    public String[] divideString(String s, int k, char fill) {
        int chunks = s.length() % k != 0? (s.length() / k) + 1 : s.length() / k;
        String[] res = new String[chunks];
        StringBuilder sb = new StringBuilder(s);
        if (s.length() % k > 0) {
            for (int i = 0; i < k - (s.length() % k); i++) {
                sb.append(fill);
            }
        }
        s = sb.toString();
        sb.setLength(0);
        int i = 0;
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            if (sb.length() == k) {
                res[i++] = sb.toString();
                sb.setLength(0);
            }
        }
        return res;
    }
}