package Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {
        Person orang1 = new Person();

        orang1.setNama("Az-Zahra Putri");
        orang1.setUmur(18);
        orang1.setAlamat("Griya Pamulang 2");

        System.out.println(orang1.getNama());
        System.out.println(orang1.getUmur());
        System.out.println(orang1.getAlamat());
    }
}
