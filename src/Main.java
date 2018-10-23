import mainpack.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        String[] table;
        table = new String[n];

        for (int i = 0; i < table.length; i++) {
            ReadData who_is = new ReadData();
            CheckString name_check = new CheckString(who_is.name);
            CheckString surname_check = new CheckString(who_is.surname);


            if (name_check.success == true && surname_check.success == true) {
                EmailGenerated addres = new EmailGenerated(who_is.name, who_is.surname,table);
                table[i] = addres.e_mail;
            } else {
                System.out.println("Can not create email.");
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
