package com.pertemuan4.Kasir;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("===== KASIR ====="); 

        System.out.print("Masukan nama pembeli: ");
        String nama = scanner.nextLine(); 
        
        System.out.print("Masukkan nama produk: ");
        String produk = scanner.nextLine();
        
        System.out.print("Masukkan harga: ");
        Float harga = scanner.nextFloat();
        
        System.out.print("Masukkan Jumlah: ");
        int Jumlah = scanner.nextInt();

        Float total = harga * Jumlah;

        System.out.println("Nama: " + nama);
        System.out.println("Nama produk: " + produk);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + Jumlah);
        System.out.println("Total: " + total);
    }
}