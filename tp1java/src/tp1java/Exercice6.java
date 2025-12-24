package tp1java;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez 6 nombres :");
        
        int max = sc.nextInt();
        
        for (int i = 1; i < 6; i++) {
            int nombre = sc.nextInt();
            if (nombre > max) {
                max = nombre;
            }
        }
        System.out.println("Le maximum est = " + max);
        sc.close();

	}

}
