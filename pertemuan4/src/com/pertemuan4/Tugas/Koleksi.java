package com.pertemuan4.Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Koleksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarFilm = new ArrayList<>();

        System.out.println("===== KOLEKSI FILM =====");
        System.out.println("Ketik 'selesai' jika sudah selesai menambah film\n");

        while (true) {
            System.out.print("Masukkan judul film: ");
            String film = scanner.nextLine();

            if (film.equalsIgnoreCase("selesai")) {
                break;
            }
            daftarFilm.add(film);
        }

        System.out.println("\n===== DAFTAR FILM =====");
        for (int i = 0; i < daftarFilm.size(); i++) {
            System.out.println((i + 1) + ". " + daftarFilm.get(i));
        }

        System.out.println("========================");
        System.out.println("Total film yang kamu miliki: " + daftarFilm.size());
    }
}
