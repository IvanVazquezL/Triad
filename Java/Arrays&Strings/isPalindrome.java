class isPalindrome {
    // Method to check if the given string is a palindrome
    public boolean isPalindrome(String s) {
        String processedString = "";

        for (int i = 0; i < s.length(); i++) {
            if (isAlphanumeric(s.charAt(i))) {
                processedString += Character.toLowerCase(s.charAt(i));
            }
        }

        int left = 0;
        int right = processedString.length() - 1;

        while (left < right) {
            if (processedString.charAt(left) != processedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    boolean isAlphanumeric(char character) {
        return Character.isLetterOrDigit(character);
    }

    public static void main(String[] args) {
        isPalindrome solution = new isPalindrome();

        System.out.println(solution.isPalindrome("abcdcba"));
        System.out.println(solution.isPalindrome("racecar"));
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome(" "));
    }
}
