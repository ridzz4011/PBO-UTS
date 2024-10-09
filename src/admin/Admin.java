package utsProject.src.admin;

import java.util.ArrayList;
import java.util.Scanner;
import utsProject.src.customer.Hotel;

public class Admin extends Hotel {
    private String passwordWifi;
    private String jadwalStaffKebersihan;

    public Admin(int nomerKamar, String namaCustomer, int hargaKamar, String tipeKamar, boolean penuh, String passwordWifi, String jadwalStaffKebersihan) {
        super(namaCustomer, tipeKamar, nomerKamar, hargaKamar, penuh);
        this.passwordWifi = passwordWifi;
        this.jadwalStaffKebersihan = jadwalStaffKebersihan;
    }

    protected  String getPass() {
        return passwordWifi;
    }

    protected String getJadwal() {
        return jadwalStaffKebersihan;
    }

    @Override
    public void listKamar(ArrayList<Hotel> Kamar) {
        System.out.println("List Kamar: ");
        System.out.println("===================================");
        for (Hotel kamar : Kamar) {
            String status;
            if (kamar.penuh) {
                status = "Penuh";
            } else {
                status = "Kosong";
            }

            System.out.println("Nomor Kamar: " + kamar.nomerKamar);
            System.out.println("Tipe Kamar: " + kamar.tipeKamar);
            System.out.println("Harga Kamar: " + kamar.hargaKamar);
            
            if (kamar instanceof Admin) {
                Admin adminKamar = (Admin) kamar;
                System.out.println("Password Wifi: " + adminKamar.getPass());
                System.out.println("Jadwal Staff Kebersihan: " + adminKamar.getJadwal());
            }

            System.out.println("Status: " + status);
            System.out.println("===================================");
        }
    }

    public void tambahKamar(ArrayList<Hotel> Kamar) {
        Scanner input3 = new Scanner(System.in);

        System.out.print("Masukan Nomor Kamar: ");
        int nomorRuang = input3.nextInt();
        input3.nextLine();

        System.out.print("Masukan Harga Kamar: ");
        int hargaRuang = input3.nextInt();
        input3.nextLine();

        System.out.print("Masukan Tipe Kamar: ");
        String tipeRuang = input3.nextLine();

        System.out.print("Masukan Password Wifi: ");
        String passWifi = input3.nextLine();

        System.out.print("Masukan Staff Kebersihan: ");
        String staffKebersihan = input3.nextLine();

        Admin ruang = new Admin(nomorRuang, "None", hargaRuang, tipeRuang, false, passWifi, staffKebersihan);
        Kamar.add(ruang);
        System.out.println("Kamar berhasil ditambahkan!");
    }
}
