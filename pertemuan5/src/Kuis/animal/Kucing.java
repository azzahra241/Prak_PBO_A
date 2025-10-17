package Kuis.animal;

public class Kucing {
    private String nama;
    private int umur;

    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void bermain() {
        System.out.println(nama + " " + umur + " tahun sedang bermain");
    }
}
