package utsProject.src.customer;

import java.util.ArrayList;
import java.util.Scanner;

public class menuCustomer {
    public void menu() {
        Scanner input1 = new Scanner(System.in);
        ArrayList<Hotel> hotel = new ArrayList<>();

        hotel.add(new Hotel(null, "Mewah", 2, 10000, false));

        boolean program = true;

        Hotel hotel1 = new Hotel(null, null, 0, 0, false);

        while (program) {
            System.out.println("========= Hotel Baru Jalan =========");
            System.out.println("1. List Kamar");
            System.out.println("2. Book Kamar");
            System.out.println("3. Lihat Struk");
            System.out.println("4. Exit");

            System.out.print("Masukan pilihan: ");
            int pilihan = input1.nextInt();

            switch (pilihan) {
                case 1 -> {
                    hotel1.listKamar(hotel);
                }
                
                case 2 -> {
                    hotel1.bookingKamar(hotel);
                }

                case 3 -> {
                    hotel1.detailPesanan(hotel);
                }

                case 4 -> {
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
