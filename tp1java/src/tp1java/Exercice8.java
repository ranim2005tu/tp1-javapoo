package tp1java;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donne la taille du triangle : ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

	}

}
