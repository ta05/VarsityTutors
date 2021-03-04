public class PalindromeSearch {
    private String word;

    public PalindromeSearch(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public boolean isPalindrome() {
        int forwardIndex = 0;
        int backwardIndex = word.length() - 1;

        while (forwardIndex != backwardIndex) {
            if (word.charAt(forwardIndex) != word.charAt(backwardIndex))
                return false;
            forwardIndex++;
            backwardIndex--;
        }
        return true;
    }

    public boolean isNearlyPalindrome() {
        String copy = word;
        word = word.toLowerCase().replaceAll("\\s", "");
        boolean nearly = isPalindrome();

        word = copy;
        return nearly;
    }

    public boolean isOffByOnePalindrome() {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
            } else {
                String temp = word;
                word = temp.substring(start, end);
                if (isPalindrome()) {
                    word = temp;
                    return true;
                }

                word = temp.substring(start + 1, end + 1);
                if (isPalindrome()) {
                    word = temp;
                    return true;
                }

                return false;
            }
        }
        return true;
    }
    
    public int findOffByOneLetterIndex() {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
            } else {
                String temp = word;
                word = temp.substring(start, end);
                if (isPalindrome()) {
                    word = temp;
                    return end;
                }

                word = temp.substring(start + 1, end + 1);
                if (isPalindrome()) {
                    word = temp;
                    return start;
                }

                return -1;
            }
        }
        return -1;
    }

    public String convertToPalindrome() {
        if(isPalindrome())
            return word;
        if(isNearlyPalindrome())
            return word.toLowerCase().replaceAll("\\s", "");
        if (isOffByOnePalindrome()) {
            int index = findOffByOneLetterIndex();
            return word.substring(0, index) + word.substring(index + 1);
        }
        return null;
    }
}
