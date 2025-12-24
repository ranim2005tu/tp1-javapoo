package tp1java;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Donne un nombre : ");
        int n = sc.nextInt();
        
        boolean ok = true;
        
        if (n < 2) {
            ok = false;
        }
        
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
        }
        sc.close();
        if (ok) {
            System.out.println(n + " est premier");
        } else {
            System.out.println(n + " n'est pas premier");
        }

	}

}
