package mainpack;

import java.util.Scanner;

public class ReadData {
    public String name;
    public String surname;

    public ReadData() {
        System.out.println("Enter your name: ");
        Scanner scanner_n = new Scanner(System.in);
        name = scanner_n.nextLine();
        System.out.println("Enter your surname: ");
        Scanner scanner_s = new Scanner(System.in);
        surname = scanner_s.nextLine();
    }
}
