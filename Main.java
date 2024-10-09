package utsProject;

import utsProject.src.customer.Hotel;
import utsProject.src.customer.menuCustomer;
import utsProject.src.admin.menuAdmin;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hotel> hotel = new ArrayList<>(); 
        menuCustomer menu1 = new menuCustomer();
        menuAdmin menu2 = new menuAdmin();
        Scanner input = new Scanner(System.in);

        boolean programMain = true;

        while (programMain) {
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
                menu1.menu(hotel);
            }
    
            else if (username.equals(userAdmin) && password.equals(passAdmin)) {
                System.out.println("Berhasil login sebagai admin!");
                menu2.menu2(hotel);
            }
    
            else {
                System.out.println("Username atau password salah!");
            }
        }
    }
}
