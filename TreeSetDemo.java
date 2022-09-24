import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<String> fruitSet = new TreeSet<String>();

        fruitSet.add("banana");
        fruitSet.add("apple");
        fruitSet.add("strawberry");
        fruitSet.add("pear");

        System.out.println("Elements of Set : ");
        for (String fruit : fruitSet) { // practice more for loop

            System.out.println("\t" + fruit);
        }

        System.out.println("Try to add a duplicate element");
        if (fruitSet.add("apple") == false) {

            System.out.println("\t apple is already in the set"); // command sou for system..
        }

        if (fruitSet.contains("apple")) {

        }

        Iterator<String> it2 = fruitSet.iterator();

        // An Iterator is an object that can be used to loop through collections,
        // like ArrayList and HashSet. It is called an "iterator" because "iterating" is
        // the technical term for looping.
        // To use an Iterator, you must import it from the java. util package.

        System.out.println("Elements of the set (again): ");
        while (it2.hasNext()) {

            String element = it2.next();
            if (element.equals("strawberry")) {
                it2.remove();
            }

            else {

                System.out.println("\t" + element);
            }

        }

    }

}
