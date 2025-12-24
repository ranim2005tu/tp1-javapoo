package tp1java;

import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X = ");
        int X = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        long resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat = resultat * X;
        }
        System.out.println(X + "^" + n + " = " + resultat);
        sc.close();

	}

}
