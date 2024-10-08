package utsProject.src.customer;

import java.util.ArrayList;
import utsProject.src.HotelInterface;

public class Hotel implements HotelInterface {
    private String namaCustomer;
    public String tipeKamar;
    public int nomerKamar, hargaKamar;
    public boolean penuh;

    public Hotel (String namaCustomer, String tipeKamar, int nomerKamar, int hargaKamar, boolean penuh) {
        this.namaCustomer = namaCustomer;
        this.tipeKamar = tipeKamar;
        this.nomerKamar = nomerKamar;
        this.hargaKamar = hargaKamar;
        this.penuh = penuh;
    }

    public String getNama() {
        return namaCustomer;
    }

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
            System.out.println("Status: " + status);
            System.out.println("===================================");
        }
    }
}
