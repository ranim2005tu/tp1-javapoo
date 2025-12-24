package tp1java;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }
        System.out.println("La factorielle de " + n + " est " + resultat);
        sc.close();

	}

}
