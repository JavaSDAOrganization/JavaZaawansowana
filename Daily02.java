import java.util.ArrayList;
import java.util.Scanner;

public class Daily02 {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was asked by Uber.
    //
    //Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
    //
    //For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    //
    //Follow-up: what if you can't use division?
    public static int getIntFromUser() {
        int number = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("To nie liczba calkowita!");
            }
        } while (!validInput);
        return number;
    }

    public static ArrayList<Integer> makeList(int number) {
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Podaj liczby do listy: ");
        for (int i = 0; i < number; i++) {
            int num = getIntFromUser();
            numberList.add(num);
        }
        return numberList;
    }

    public static ArrayList<Integer> result(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        int pivot = 1;

        for (int num : list) {
            pivot *= num;
        }
        for (int i = 0; i < list.size(); i++) {
            int result = pivot / list.get(i);
            newList.add(result);
        }
        return newList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int input = getIntFromUser();
        ArrayList<Integer> numberList = makeList(input);

        ArrayList<Integer> result = result(numberList);

        System.out.println("Wynik: " + result);
    }
}
