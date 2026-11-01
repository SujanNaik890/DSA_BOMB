public class CountCharacterFrequency {
    public static void main(String[] args) {

        String s = "banana";

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
