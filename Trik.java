import java.util.Scanner;

public class Trik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        input.close();

        // cups

        boolean[] cups = { true, false, false }; // initialize - When should boolean be used?
        // The Boolean data type is used to store the values true and false. This data
        // type may be used to store information that allows one of two states, on or
        // off

        int output = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i); // The charAt() method returns the character at the specified index in a string.
                                     // The index of the first character is 0, the second character is 1, and so on.
            boolean temp;

            if (c == 'A') {
                temp = cups[0];
                cups[0] = cups[1];
                cups[1] = temp;

            } else if (c == 'B') {

                temp = cups[1];
                cups[1] = cups[2];
                cups[2] = temp;

            } else {

                temp = cups[0];
                cups[0] = cups[2];
                cups[2] = temp;

            }

        }

        for (int j = 0; j < cups.length; j++)

        {

            if (cups[j]) {
                output = j + 1;
                break;
            }

        }

        System.out.println(output);

    }

}
