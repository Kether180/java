
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StackingCups {

    public static boolean isNumeric(String value) {

        return Character.isDigit(value.charAt(0)); // method that check if it is a digit
    }

    public static void main(String[] args) { // when is static we can not access any other method , this method is
                                             // accessing the isNumeric method

        Scanner input = new Scanner(System.in);

        int nCups = Integer.parseInt(input.nextLine()); // convierte valor a integer, leyendo linea por linea

        Map<Integer, String> cups = new TreeMap<Integer, String>(); // treemap ordena

        for (int i = 0; i < nCups; i++) {
            String cupInfo = input.nextLine(); // radio y color escrito por input
            String[] tokens = cupInfo.split(" "); // tomando la cadena y dividiendo por espacio, caracter espacio
                                                  // termina de leer.

            String color = ""; // regresa en strings
            int radius = 0;

            if (isNumeric(tokens[0])) {
                color = tokens[1];
                radius = Integer.parseInt(tokens[0]) / 2; // cambiar cadena string to integer.

            } else {

                color = tokens[0];
                radius = Integer.parseInt(tokens[1]);
            }
            cups.put(radius, color); // metodo para agregar mapa

        }

        for (String color : cups.values()) { // primera parte como se llama el elemento, string int color numero , de
                                             // donde vienen los valores paso 2 dentor del mapa , llamar metodo . key
                                             // set para llamar todas las llaves del mapa.
            System.out.println(color);
        }

        input.close();

    }

}
