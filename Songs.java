import java.util.Scanner;

// need to use main 

public class Songs1 {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String typeOfContainer = input.next();
        String stringOf = input.next();
        String typeOfBeverage = input.next();

        public void songs()

        {

                while (n > 1) {

                        System.out
                                        .println(n + " " + typeOfContainer + " " + stringOf + " " + typeOfBeverage + " "
                                                        + "on the wall "
                                                        + '\n'
                                                        + n
                                                        + " "
                                                        + typeOfContainer + " " + stringOf + " " + typeOfBeverage);
                        n = n - 1;

                        if (n == 1) {
                                String stringS = "One";
                                System.out.println(
                                                "Take one down, pass it around " + '\n' + stringS + " "
                                                                + typeOfContainer.substring(0,
                                                                                typeOfContainer.length() - 1)
                                                                + " " + stringOf + " "
                                                                + typeOfBeverage + " "
                                                                + "on the wall" + '\n');

                        }

                        if (n == 1) {

                                String stringS = "One";
                                System.out.println(stringS + " "
                                                +
                                                typeOfContainer.substring(0, typeOfContainer.length() - 1) + " "
                                                + stringOf + " "
                                                + typeOfBeverage + " " + "on the wall " + '\n' +
                                                stringS + " "
                                                + typeOfContainer.substring(0, typeOfContainer.length() - 1) + " "
                                                + stringOf + " "
                                                + typeOfBeverage);
                                System.out.println(
                                                "Take one down, pass it around " + '\n'
                                                                + "No more" + " " + typeOfContainer + " " + stringOf
                                                                + " " + typeOfBeverage
                                                                + " " + "on the wall");

                        }

                        if (n > 1) {
                                System.out.println(
                                                "Take one down, pass it around " + '\n' + n + " "
                                                                + typeOfContainer + " " + stringOf + " "
                                                                + typeOfBeverage + " " + "on the wall" + '\n');
                        }

                }

                input.close();
        }

}

// }

// // All you have to come up with are the titles, and everything else follows.

// // where the "..." should be replaced by all the verses in between. The
// lesser
// // known "14 kegs of mead" goes like:

// // You must be able to print the lyrics to any song with a title of the form
// // "<N> <container>s of <drink>".
