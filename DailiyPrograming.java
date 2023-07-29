import java.util.ArrayList;
import java.util.Scanner;

public class DailiyPrograming {
    //Good morning! Here's your coding interview problem for today.
    //
    //This problem was recently asked by Google.
    //
    //Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    //
    //For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    //
    //Bonus: Can you do this in one pass?

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
        } while(!validInput);
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
    public static boolean checking (ArrayList<Integer> list) {
        System.out.println("Podaj liczbe do sprawdzenia: ");
        int check = getIntFromUser();
        for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) == check) {
                        return true;
                    }
                }
            }
        System.out.println("Nie znaleziono pary cyfr, która sumuje się do tej liczby.");
        return false;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int input = getIntFromUser();
        ArrayList<Integer> numberList = makeList(input);

        // Wywołaj funkcję checking() na utworzonej liście
        boolean result = checking(numberList);
        System.out.println("Wynik: " + result);
    }
}
