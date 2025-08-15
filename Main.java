import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String args[]) {
        int n, sum = 0, temp, remainder, digits = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number to check if it is an Armstrong number:");
        n = in.nextInt();
        temp = n;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10; // Corrected: Update temp to remove the last digit
            digits++;
        }

        temp = n; // Reset temp to original number
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    static int power(int n, int r) {
        int p = 1;
        for (int c = 1; c <= r; c++) {
            p = p * n;
        }
        return p;
    }
}
