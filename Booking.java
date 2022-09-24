import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r = input.nextInt(); // number of rooms in hotel

        int n = input.nextInt(); // rooms already booked

        // nextInt() will try to read the incoming input. It will see that this input is

        if (n >= r) {
            System.out.println("Too late");

            input.close();
            return;
        }

        // } else {

        ArrayList<Integer> bookedRooms = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int roomNumber = input.nextInt(); // input will check your input and check if the room is available
            bookedRooms.add(roomNumber); // 1, 2 , 3 ?
        }

        int guess = 1;

        while (true) {

            if (!bookedRooms.contains(guess)) { // if it does not contains a guess ...print !

                System.out.println(guess);
                break;
            }
            guess++;

        }

        input.close();

    }

}
