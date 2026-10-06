class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str.length()).append("#").append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find #
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(str.substring(i, j));

            // Get actual string
            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to next string
            i = j + 1 + length;
        }

        return result;
    }
}