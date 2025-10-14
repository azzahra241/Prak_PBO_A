package com.pertemuan4.Belanja;

import java.util.ArrayList;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarBarang = new ArrayList<>();
        ArrayList<Double> daftarHarga = new ArrayList<>();

        System.out.println("=========== PROGRAM BELANJA ===========");
        System.out.println("Ketik 'selesai' untuk mengakhiri input.");

        while (true) {
            System.out.print("\nMasukkan Nama Barang: ");
            String barang = scanner.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan Harga Barang: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();

            daftarBarang.add(barang);
            daftarHarga.add(harga);
        }

        System.out.println("\n====== DAFTAR BELANJA ======");
        double total = 0;

        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBarang.get(i) + " - Rp. " + daftarHarga.get(i));
            total += daftarHarga.get(i);
        }

        System.out.println("===========================");
        System.out.println("Total Belanja: Rp. " + total);

        scanner.close();
    }
}
