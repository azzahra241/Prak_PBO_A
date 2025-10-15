package com.pertemuan4.Nilai;

import java.util.Scanner;

public class Nilai { 
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("===== Program Nilai ====="); 
        System.out.print("Masukkan Jumlah Mahasiswa:");
        int jumlah = scanner.nextInt();

        double[] nilai = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i +1) + ": ");
            nilai[i] = scanner.nextInt();
              
        }

        double totalNilai = 0;
        for (int i = 0; i < jumlah; i++) {
            totalNilai+=nilai[i];
        }
        double average = totalNilai / jumlah;
        
         System.out.println("===== NILAI MAHASISWA =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilai[i]);
            
        }

        System.out.println("Rata-rata: " + average);
    }
}