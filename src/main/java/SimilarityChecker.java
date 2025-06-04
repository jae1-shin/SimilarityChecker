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
        if (firstString.length() == secondString.length()) {
            return 60; // Assuming 60 is the score for equal length strings
        }

        int result = 60;
        return result;
    }
}
