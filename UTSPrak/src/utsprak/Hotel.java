/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsprak;

/**
 *
 * @author lenovo
 */
public class Hotel {
    Kamar kamar1 = new KamarBiasa("Kamar 1");
    Kamar kamar2 = new KamarBiasa("Kamar 2");
    Kamar kamar3 = new KamarVIP("Kamar VIP 1");
    Kamar kamar4 = new KamarVIP("Kamar VIP 2");
    
    public void cekKetersediaan(int choice) {
        if (choice == 1) {
            System.out.println(kamar1.getnomorKamar() + " tersedia. ");
            System.out.println("Harga: " + kamar1.getharga());
        } else if (choice == 2) {
            System.out.println(kamar2.getnomorKamar() + " tersedia. ");
            System.out.println("Harga: " + kamar2.getharga());
        } else if (choice == 3) {
            System.out.println(kamar3.getnomorKamar() + " tersedia.");
            System.out.println("Harga: " + kamar3.getharga());
        } else if (choice == 4) {
            System.out.println(kamar4.getnomorKamar() + " tersedia. ");
            System.out.println("Harga: " + kamar4.getharga());
        }  else {
            System.out.println("Pilihan kamar tidak valid.");
        }
    }
    
    public void pesanKamar(int choice, String user) {
        if (choice == 1) {
            kamar1.pesanKamar();
        } else if (choice == 2) {
            kamar2.pesanKamar();
        } else if (choice == 3) {
            kamar3.pesanKamar();
        } else if (choice == 4) {
            kamar4.pesanKamar();
        } else {
            System.out.println("Pilihan kamar tidak valid.");
        }
    }
    
     public void melihatDetailPemesanan(int choice, String User) {
        if (choice == 1) {
            System.out.println("Nama Pemesan: " + kamar1.getNamaPemesan());
            System.out.println("Detail Pemesanan Kamar " + kamar1.getnomorKamar() + ": " + kamar1.getdetailPemesanan());
        } else if (choice == 2) {
            System.out.println("Nama Pemesan: " + kamar2.getNamaPemesan());
            System.out.println("Detail Pemesanan Kamar " + kamar2.getnomorKamar() + ": " + kamar2.getdetailPemesanan());
        } else if (choice == 3) {
            System.out.println("Nama Pemesan: " + kamar3.getNamaPemesan());
            System.out.println("Detail Pemesanan Kamar " + kamar3.getnomorKamar() + ": " + kamar3.getdetailPemesanan());
        } else if (choice == 4) {
            System.out.println("Nama Pemesan: " + kamar4.getNamaPemesan());
            System.out.println("Detail Pemesanan Kamar " + kamar4.getnomorKamar() + ": " + kamar4.getdetailPemesanan());
        } else {
            System.out.println("Pilihan kamar tidak valid.");
        }
    }
     
     public void mengubahStatus (int choice, String status) {
        if (choice == 1) {
            kamar1.setketersediaan(status);
            System.out.println("Ketersediaan Kamar " + kamar1.getnomorKamar() + " telah diubah menjadi " + status);
        } else if (choice == 2) {
            kamar2.setketersediaan(status);
            System.out.println("Ketersediaan Kamar " + kamar2.getnomorKamar() + " telah diubah menjadi " + status);
        } else if (choice == 3) {
            kamar3.setketersediaan(status);
            System.out.println("Ketersediaan Kamar " + kamar3.getnomorKamar() + " telah diubah menjadi " + status);
        } else if (choice == 4) {
            kamar4.setketersediaan(status);
            System.out.println("Ketersediaan Kamar " + kamar4.getnomorKamar() + " telah diubah menjadi " + status);
        }else {
            System.out.println("Pilihan kamar tidak valid.");
        }
    }
     
    public void melihatPesanan(String admin, int idAdmin) {
        System.out.println("Daftar Pesanan Kamar:");
        System.out.println("Kamar " + kamar1.getnomorKamar() + ": " + kamar1.getdetailPemesanan());
        System.out.println("Kamar " + kamar2.getnomorKamar() + ": " + kamar2.getdetailPemesanan());
        System.out.println("Kamar " + kamar3.getnomorKamar() + ": " + kamar3.getdetailPemesanan());
        System.out.println("Kamar " + kamar4.getnomorKamar() + ": " + kamar4.getdetailPemesanan());
    }
}
