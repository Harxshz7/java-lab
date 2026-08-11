package Practice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "java";
        int[] freq = new int[127];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }

}
