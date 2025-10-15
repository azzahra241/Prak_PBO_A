package com.pertemuan4.Belanja;

import java.util.ArrayList;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarBelanja = new ArrayList<String>();

        System.out.println("===== Program Belanja =====");
        System.out.println("Ketik nama barangnya, kalau sudah selesai ketik 'selesai'");

        while (true) {
            System.out.print("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            daftarBelanja.add(namaBarang);            
        }
        System.out.println("\n=== Daftar Belanja ===");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBelanja.get(i));
        }
    }
}