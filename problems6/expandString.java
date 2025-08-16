package problems6;

public class expandString {

    // expand the given string
    // String str = 3[a2[c]] => 3[acc] => accaccacc
    // Output = accaccacc

    public static String expandStr(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            // Case 1: Letters → add directly
            if (Character.isLetter(ch)) {
                result.append(ch);
                i++;
            }
            // Case 2: Number → read full number, then substring inside brackets
            else if (Character.isDigit(ch)) {
                int rep = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    rep = rep * 10 + (str.charAt(i) - '0');
                    i++;
                }

                // Boundary check before '['
                if (i >= str.length() || str.charAt(i) != '[') {
                    return result.toString(); // No bracket → return as is
                }
                i++; // skip '['

                // Extract substring inside matching brackets
                int bracketCount = 1;
                int start = i;
                while (i < str.length() && bracketCount > 0) {
                    if (str.charAt(i) == '[')
                        bracketCount++;
                    else if (str.charAt(i) == ']')
                        bracketCount--;
                    i++;
                }

                // Inner substring without outer brackets
                String inner = str.substring(start, i - 1);

                // Recursive expansion
                String expandedInner = expandStr(inner);

                // Append repeated substring
                result.append(expandedInner.repeat(rep));
            } else {
                // If it's neither letter nor digit, just skip it
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aa3[a2[c]]";
        String newString = expandStr(str);
        System.out.println(newString);
    }

}
