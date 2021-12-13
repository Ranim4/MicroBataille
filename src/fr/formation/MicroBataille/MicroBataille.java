package fr.formation.MicroBataille;

import java.util.Random;
import java.util.Scanner;

public class MicroBataille {
	static Scanner scanner = new Scanner(System.in);

	public static int generateRandom(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	public static void main(String[] args) {
		char[][] grid = new char[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grid[i][j] = '?');
			}
			System.out.println();
		}
		int b1 = generateRandom(0, 3);
		int b2 = generateRandom(0, 3);
		System.out.println(b1 + ", " + b2);
		while (true) {

			System.out.println("Quelle ligne entre 0 et 3 ?");
			int l = scanner.nextInt();
			if (l <= 3) {
				System.out.println("Quelle colonne entre 0 et 3 ?");
				int c = scanner.nextInt();
				if (c <= 3) {
					if (l == b1 && c == b2) {
						System.out.println("Boom ! Touché coulé\nBravo, vous avez gagné !");
						break;
					} else {
						System.out.println("Plouf ! A l'eau !");
						grid[l][c] = '~';
						for (int i = 0; i < 4; i++) {
							for (int j = 0; j < 4; j++) {
								System.out.print(grid[i][j]);
							}
							System.out.println();
						}

					}
				}
				else
					System.out.println("la colonne choisi n'est pas entre 0 et 3 !!");
			}
			else
				System.out.println("le ligne choisi n'est pas entre 0 et 3 !!");
		}
	}
}
