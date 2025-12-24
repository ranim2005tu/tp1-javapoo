package tp1java;

import java.util.Scanner;
public class Exercice4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la chaîne : ");
        String chaine = scanner.nextLine();
        
        System.out.print("Combien de fois : ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(chaine);}
        scanner.close();

	}

}
