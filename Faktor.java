import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i; // the impact factor
        int a; // the # of articles published
        int b; // minimum # citations needed

        a = input.nextInt(); // Method
        i = input.nextInt();

        // i = b/a
        b = a * (i - 1) + 1;

        System.out.println(b
                           
                           
        input.close();

    }

}

/*
 * 
 * The impact factor of a scientific journal is a measure reflecting the average
 * number of citations to articles published in science journals. For this task
 * we are using a simplified formula for calculating the impact factor:
 * 
 * 
 * Rounding is always performed upwards. For example the impact factor of the
 * “Journal for ore research and time wasting” that published articles cited
 * times is rounding up to .
 * 
 * You are the editor of one scientific journal. You know how many articles you
 * are going to publish and the owners are pushing you to reach a specific
 * impact factor. You are wondering how many scientists you will have to bribe
 * to cite your articles to meet the owners demands. Since money is tight you
 * want to bribe the minimal amount of scientists. Each bribed scientist buys
 * you a single citation.
 * 
 * Input
 * First and only line of input will contain integers, (), the number of
 * articles you plan to publish and (), the impact factor the owners require.
 * 
 * Output
 * The first and only line of output should contain one integer, the minimal
 * number of scientists you need to bribe.
 * 
 * Sample Input 1 Sample Output 1
 * 38 24
 * 875
 */
