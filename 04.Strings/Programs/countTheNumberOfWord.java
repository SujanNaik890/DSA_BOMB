public class countTheNumberOfWord {
    public static void main(String[] args) {

        String s = "Java is easy to learn  ";

        String trimmed = s.trim();

        int words;

        if (trimmed.isEmpty()) {
            words = 0;
        } else {
            words = trimmed.split("\\s+").length;
        }

        System.out.println("Words: " + words);
    }
}
