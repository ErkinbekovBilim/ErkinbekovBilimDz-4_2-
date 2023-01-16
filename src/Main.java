import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 5 имен для А");
        Scanner scannerA = new Scanner(System.in);

        String A1 = scannerA.nextLine();
        String A2 = scannerA.nextLine();
        String A3 = scannerA.nextLine();
        String A4 = scannerA.nextLine();
        String A5 = scannerA.nextLine();

        ArrayList<String> namesA = new ArrayList<>();
        namesA.add(A1);
        namesA.add(A2);
        namesA.add(A3);
        namesA.add(A4);
        namesA.add(A5);

        System.out.println("----------Имена A:");
        for (int i = 0; i < namesA.size(); i++) {
            System.out.println(namesA.get(i));
        }
        System.out.println("----------------------");

        System.out.println("Введите 5 имен для B");

        Scanner scannerB = new Scanner(System.in);

        String B1 = scannerB.nextLine();
        String B2 = scannerB.nextLine();
        String B3 = scannerB.nextLine();
        String B4 = scannerB.nextLine();
        String B5 = scannerB.nextLine();

        ArrayList<String> namesB = new ArrayList<>();
        namesB.add(B1);
        namesB.add(B2);
        namesB.add(B3);
        namesB.add(B4);
        namesB.add(B5);

        System.out.println("----------Имена B:");
        for (int i = 0; i < namesB.size(); i++) {
            System.out.println(namesB.get(i));
        }
        System.out.println("----------Намес С");
        ArrayList<String> namesC = new ArrayList<>();
        namesC.add(A1);
        namesC.add(B5);
        namesC.add(A2);
        namesC.add(B4);
        namesC.add(A3);
        namesC.add(B3);
        namesC.add(A4);
        namesC.add(B2);
        namesC.add(A5);
        namesC.add(B1);
        System.out.println(namesC);
        System.out.println("-----------------------------------------");
        Collections.sort(namesC, Comparator.comparing(String::length));
        System.out.println("Сортированный: " + namesC);
    }
}
