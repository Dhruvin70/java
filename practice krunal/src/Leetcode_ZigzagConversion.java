public class Leetcode_ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        int iter = (numRows - 1) * 2;
        String creating = "";
        int j = 0;
        if (s.length() == 1) return s;

        for (int i = 0; i < numRows; i++) {
            for (j = i; j < s.length(); j = j + iter) {
                creating = creating + s.charAt(j);

                if (i > 0 && i < numRows - 1 && j + iter - 2*i < s.length()) {
                    creating += s.charAt((j + iter) - (2*i));
                }
            }

        }
        return creating.toString();
    }
}





