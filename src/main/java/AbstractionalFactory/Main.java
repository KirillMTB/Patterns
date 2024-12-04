package AbstractionalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Troops tr = null;

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                tr = new Archer();
                break;
            case 2:
                tr = new Infantry();
                break;
            case 3:
                tr = new Cavalry();
                break;
        }

       View view = tr.createView();
        view.create();
    }
}
