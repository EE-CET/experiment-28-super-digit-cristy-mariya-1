import java.util.*;

public class SuperDigit {

    // Function to find super digit
    public static long superDigit(long num) {
        if (num < 10) return num;

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next(); // take as string (can be large)
        int k = sc.nextInt();

        long sum = 0;

        // Step 1: sum of digits of n
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        // Step 2: multiply by k
        sum = sum * k;

        // Step 3: find super digit
        System.out.println(superDigit(sum));

        sc.close();
    }
}
