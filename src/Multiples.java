public class Multiples {
    public static void main(String[] args) {
        int count_nums = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

//                System.out.println("Fizz Buzz");
                count_nums++;

            } else if (divisibleBy3) {

//                System.out.println("Fizz");
                count_nums++;

            } else if (divisibleBy5) {

//                System.out.println("Buzz");
                count_nums++;

            } else {

//                System.out.println(i);

            }

        }
        System.out.println("There are: " + count_nums);
    }

}
