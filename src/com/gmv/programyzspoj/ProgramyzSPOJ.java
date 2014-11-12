package com.gmv.programyzspoj;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.TabularType;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ProgramyzSPOJ {

	public static void main(String[] args) {
		odwocTablice();
	}

	private static void czyPalindrom() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Wpisz wyraz aby sprawdzic czy to palidnrom: ");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Wyraz jest palindromem.");
		else
			System.out.println("Wyraz nie jest palindromem.");
	}

	public static int potega(int p, int w) { // Czy umiesz potêgowaæ
		if (w == 0)
			return 1;
		return p * potega(p, --w);
	}

	public static int silnia(int a) { // Dwie cyfry silni
		if (a == 1) {
			return 1;
		}
		return a * silnia(a - 1);
	}

	public static int Przedszkolanka(int grupaA, int grupaB) { // najmniejszy wspolny dzielnik
		while (grupaA != grupaB) {
			if (grupaA > grupaB) {
				grupaA = grupaA - grupaB;
			} else {
				grupaB = grupaB - grupaA;
			}
		}

		return grupaA;
	}

	public static int NWW(int a, int b) { // najmniejsza wspolna wielokrotnosc
		int wynik = (a * b) / Przedszkolanka(a, b);

		return wynik;

	}

	public static void wystapieniaMax() { // zlicza jaka cyfra jest dominanta
		int tablica[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, };
		int wystapienia = 0;
		int wystapieniaMax = 0;
		int wystapieniaTemp = 0;
		for (int i = 0; i < tablica.length - 1; i++) {
			wystapienia = 0;
			for (int j = 0; j < tablica.length - 1; j++) {

				if (tablica[j] == i) {
					wystapienia++;
					wystapieniaTemp = wystapienia;
					if (wystapieniaTemp > wystapieniaMax) {
						wystapieniaMax = wystapieniaTemp;
					}

				}
			}

		}
		System.out.println("Wystatpienia max: " + wystapieniaMax);

	}

	public static void mniejszeZuzycieFlamastra() { // Flamaster
		String napis = "abcasdfghjkjhgfdwertyujkhgfc";
		int dlugoscNapisu = napis.length();
		int wystapieniaLiter = 0;
		String ciagZnakowILiczb = "";
		String ciagFinalny = "";
		for (char literka = 'a'; literka <= 'z'; literka++) {
			wystapieniaLiter = 0;
			ciagZnakowILiczb = "";
			for (int i = 0; i < dlugoscNapisu; i++) {
				char znak = napis.charAt(i);
				if (literka == znak) {
					wystapieniaLiter++;
					if (wystapieniaLiter > 1) {
						ciagZnakowILiczb = literka + String.valueOf(wystapieniaLiter) + " ";
					} else {
						ciagZnakowILiczb = literka + " ";
					}

				}

			}
			ciagFinalny = ciagFinalny + ciagZnakowILiczb;

		}
		System.out.println(ciagFinalny.toUpperCase());

	}

	public static void odwocTablice() {
		int tablica[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 66, 88, 77, 99, 66, 99, 88, 77, 44, 22, 33 };
		int rozmiarTablicy = tablica.length;
		int pustaTablica[] = new int[rozmiarTablicy];
		int zmienna = 0;
		for (int i = rozmiarTablicy - 1; i >= 0; i--) {
			pustaTablica[i] = tablica[zmienna];
			zmienna++;

		}
		for (int i = 0; i < rozmiarTablicy; i++) {
			System.out.println(tablica[i] + ", " + pustaTablica[i]);

		}

	}
}
