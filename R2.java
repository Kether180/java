import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int r1 = input.nextInt(); // values that I want to calculate
        int s = input.nextInt();

        int r2 = 2 * s - r1;

        System.out.println(r2);

        input.close();

    }

}

/*
 * 
 * The number S is called the mean of two numbers R1 and R2 if S is equal to
 * (R1+R2)/2 .
 * Mirko’s birthday present for Slavko was two integers R1 and R2 . Slavko
 * promptly calculated
 * their mean which also happened to be an integer but then lost R2! Help Slavko
 * restore R2 .
 * 
 * Input
 * The first and only line of input contains two integers and , both between
 * -1000 and 1000.
 * Output
 * Output R2 on a single line.
 * 
 * https://www.youtube.com/channel/UCg6OChJmqDko6ETc3IpqWsA
 */
