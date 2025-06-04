public class SimilarityChecker {
    private String firstString;
    private String secondString;

    public SimilarityChecker(String firstString, String secondString) {
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
            return 60; // Assuming 60 is the score for equal length strings
        }

        if (firstLength / secondLength >= 2 || secondLength / firstLength >= 2) {
            return 0; // Assuming 0 is the score for strings with a length ratio of 2 or more
        }

        int result = 60;
        return result;
    }
}
