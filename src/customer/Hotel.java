package utsProject.src.customer;

import java.util.ArrayList;
import java.util.Scanner;
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
            System.out.println("Status: " + status);
            System.out.println("===================================");
        }
    }

    public void detailPesanan(ArrayList<Hotel> Kamar) {
        System.out.println("\n------- Struk Pembayaran -------");
        for (Hotel kamar : Kamar) {
            System.out.println("Nomor Kamar: " + kamar.nomerKamar);
            System.out.println("Atas Nama: " + kamar.getNama());
            System.out.println("Tipe Kamar: " + kamar.tipeKamar);
            System.out.println("Harga Kamar: " + kamar.hargaKamar);
            System.out.println("===================================");
        }
    }

    public void bookingKamar(ArrayList<Hotel> Kamar) {
        Scanner input2 = new Scanner(System.in);

        System.out.print("Masukan ruangan yang mau dibook: ");
        int nomorkamar = input2.nextInt();

        for (Hotel kamar : Kamar) {
            if (kamar.nomerKamar == nomorkamar) {
                if (!kamar.penuh) {
                    System.out.print("\nMasukan nama anda: ");
                    input2.nextLine();
                    String namaPelanggan = input2.nextLine();

                    kamar.namaCustomer = namaPelanggan;
                    kamar.penuh = true;

                    System.out.println("Kamar nomor " + nomorkamar + " berhasil di book atas nama " + namaPelanggan);
                } else {
                    System.out.println("Kamar nomor " + nomorkamar + " sudah penuh. Silahkan pilih kembali!");
                }
                break;
            } else {
                System.out.println("Kamar nomor " + nomorkamar + " tidak ditemukan!");
            }
        }
    }
}
