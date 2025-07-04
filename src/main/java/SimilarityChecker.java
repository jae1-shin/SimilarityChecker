public class SimilarityChecker {
    private String firstString;
    private String secondString;

    public SimilarityChecker(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            throw new NullPointerException("Strings cannot be null");
        }

        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String getFirstString() {
        return firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public int lengthCheck() {
        int firstLength = firstString.length();
        int secondLength = secondString.length();

        if (firstLength == secondLength) {
            return 60;
        }

        if (isDoubleOrMoreLengthDiff(firstLength, secondLength)) {
            return 0;
        }

        return getPartialScore(firstLength, secondLength);
    }

    private boolean isDoubleOrMoreLengthDiff(int firstLength, int secondLength) {
        int maxLength = Math.max(firstLength, secondLength);
        int minLength = Math.min(firstLength, secondLength);

        return maxLength / minLength >= 2;
    }

    private int getPartialScore(int firstLength, int secondLength) {
        int gap = Math.abs(firstLength - secondLength);
        int minLength = Math.min(firstLength, secondLength);

        return (int) ((1 - ((double) gap / minLength)) * 60);
    }
}
