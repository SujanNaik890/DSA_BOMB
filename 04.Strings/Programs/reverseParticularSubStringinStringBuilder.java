public class reverseParticularSubStringinStringBuilder {
    public static void main(String[] args) {

            StringBuilder sb = new StringBuilder("Sujan Naik");

            System.out.println(sb);

            int start = 6;
            int end = sb.length();
            String reversed = new StringBuilder(
                    sb.substring(start, end)
            ).reverse().toString();

            sb.replace(start, end, reversed);

            System.out.println(sb);

    }
}
