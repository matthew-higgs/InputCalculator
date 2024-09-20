import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);  // Possible exception throw here
                sum += num;
                // add 1 to count
                count += 1;
            } catch(Exception e) {
                break;
            }
        }

        // create an int called average.  Start it at 0

        int average = 0;

        if (count == 0) {
            average = 0;
        } else {
            // YOU CALCULATE THE AVERAGE
            average = sum - count;
        }

        // print out the sum and the average.
        System.out.println(sum);
        System.out.println(average);


    }
}
