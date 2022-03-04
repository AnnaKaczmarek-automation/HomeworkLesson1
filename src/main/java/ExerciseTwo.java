import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give one chosen integer number: ");

        int usersNumber = scanner.nextInt();
        List<Integer> numbersArray = new ArrayList<>(usersNumber);

        for (int i = 0; i < usersNumber; i++) {

            System.out.println("Give a random integer number: ");
            int usersInput = scanner.nextInt();
            numbersArray.add(usersInput);


        }
        System.out.println("Array consist of values: " + numbersArray);
        int sum = 0;
        for (int i = 0; i < usersNumber; i++) {
            sum += numbersArray.get(i);
        }
        double average = sum / usersNumber;
        System.out.println("Average of the array is: " + average);

        int maxValue = Collections.max(numbersArray);
        System.out.println("The largest given value is: "+maxValue);

    }
}