package utsProject.src.admin;

import java.util.ArrayList;
import java.util.Scanner;

import utsProject.src.customer.Hotel;

public class menuAdmin {
    public void menu2(ArrayList<Hotel> hotel) {
        Scanner input1 = new Scanner(System.in);

        boolean program = true;

        Admin admin = new Admin(0, null, 0, null, false, null, null);

        while (program) {
            System.out.println("\n\n/=========/ Hotel Baru Jalan /=========/");
            System.out.println("1. List Kamar");
            System.out.println("2. Tambah Ruangan");
            System.out.println("3. Exit");

            System.out.print("Masukan pilihan: ");
            int pilihan = input1.nextInt();

            switch (pilihan) {
                case 1 -> {
                    admin.listKamar(hotel);
                }
                
                case 2 -> {
                    admin.tambahKamar(hotel);
                }

                case 3 -> {
                    System.out.println("Terimakasih telah menggunakan layanan hotel kami!");
                    program = false;
                }
            
                default -> {
                    System.err.println("Mohon masukan pilihan yang benar!");
                }
            }
        }
    }
}
