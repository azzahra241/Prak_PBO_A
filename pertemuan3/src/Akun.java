// File: Akun.java
public class Akun {
    public String username;   // bisa diakses dari luar
    private String password;  // hanya bisa diakses di dalam class Akun

    // Constructor
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method public untuk login
    public boolean login(String inputPassword) {
        return password.equals(inputPassword);
    }

    // Method public untuk ganti password
    public void gantiPassword(String oldPass, String newPass) {
        if (password.equals(oldPass)) {
            password = newPass;
            System.out.println("Password berhasil diganti!");
        } else {
            System.out.println("Password lama salah, tidak bisa diganti!");
        }
    }
}
