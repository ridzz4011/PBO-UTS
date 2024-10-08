package utsProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String userPelanggan = "Garid";
            String passPelanggan = "tes123";

            String userAdmin = "Admin";
            String passAdmin = "admin123";

            System.out.println("Harap masukan username dan password terlebih dahulu!");

            System.out.print("Username : ");
            String username = input.nextLine();

            System.out.print("Password : ");
            String password = input.nextLine();

            if (username.equals(userPelanggan) && password.equals(passPelanggan)) {
                System.out.println("Berhasil login!");
            }

            else if (username.equals(userAdmin) && password.equals(passAdmin)) {
                System.out.println("Berhasil login sebagai admin!");
            }

            else {
                System.out.println("Username atau password salah!");
            }
        }
    }
}
