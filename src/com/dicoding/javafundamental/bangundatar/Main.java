package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        // Panggil metode

        mainMenu();

        //kondisional untuk pilihan menu yang dimasukan
        switch (pilihan){
            case '1' : {
                System.out.println("Masukan Panjang Persegi : ");
                s1 = scanner.nextInt();
                System.out.println("Masukan Lebar Persegi : ");
                s2 = scanner.nextInt();
                System.out.println("Luas Persegi Panjang : " + opersegi.luas(s1,s2));
                System.out.println("Keliling Persegi Panjang :" + opersegi.keliling(s1,s2));
                break;
            }
            case '2' : {
                System.out.println("Masukan Alas Segitiga Siku : ");
                s1 = scanner.nextInt();
                System.out.println("Masukan Tinggi Segitiga Siku : ");
                s2 = scanner.nextInt();
                System.out.println("Luas Segitiga : " + osegitiga.luas(s1,s2));
                System.out.println("Keliling Segitiga :" + osegitiga.keliling(s1,s2));
                break;
            }
            case '3' : {
                System.out.println("Masukan jari-jari lingkaran : ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran : " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran :" + olingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("Tidak ada pilihan");
                break;
            }
        }

    }

    private static void mainMenu() {
        // Pilihan Menu
        System.out.println("==============================");
        System.out.println("Hitung Luas Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkarang");
        System.out.println("Masukan Menu :");
        pilihan = scanner.next().charAt(0);
    }
}