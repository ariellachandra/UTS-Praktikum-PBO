/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsprak;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kamu masuk sebagai?");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.print("Masukkan pilihan: ");
        int akses = scanner.nextInt();
        scanner.nextLine();
        
        if (akses == 1) {
            userMenu(scanner, hotel);
        } else if (akses == 2) {
            adminMenu(scanner, hotel);
        } else {
            System.out.println("Pilihan akses tidak valid.");
        }
        
        scanner.close();
    }

    public static void userMenu(Scanner scanner, Hotel hotel) {
        System.out.println("-----Selamat Datang-----");
        System.out.print("Nama: ");
        String namaUser = scanner.nextLine();

        System.out.println("-----MENU-----");
        System.out.println("1. cek ketersediaan kamar");
        System.out.println("2. booking kamar");
        System.out.println("3. lihat detail pemesanan");
        System.out.println("4. keluar");
        System.out.print("Masukkan pilihan: ");
        int userChoice = scanner.nextInt();
        
        if (userChoice == 1) {
            System.out.println("Nomor kamar yang ingin dicek");
            System.out.println("1. Kamar 1");
            System.out.println("2. Kamar 2");
            System.out.println("3. Kamar VIP 1");
            System.out.println("4. Kamar VIP 2");
            System.out.print("Masukkan pilihan: ");
            int roomChoice = scanner.nextInt();
            hotel.cekKetersediaan(roomChoice);
        } else if (userChoice == 2) {
            System.out.println("Pilih kamar yang ingin dibooking");
            System.out.println("1. Kamar 1");
            System.out.println("2. Kamar 2");
            System.out.println("3. Kamar VIP 1");
            System.out.println("4. Kamar VIP 2");
            System.out.print("Masukkan pilihan: ");
            int roomChoice = scanner.nextInt();
            hotel.pesanKamar(roomChoice, namaUser);
        } else if (userChoice == 3) {
            System.out.println("Pilih nomor kamar untuk melihat detail pemesanan");
            System.out.println("1. Kamar 1");
            System.out.println("2. Kamar 2");
            System.out.println("3. Kamar VIP 1");
            System.out.println("4. Kamar VIP 2");
            System.out.print("Masukkan pilihan: ");
            int roomChoice = scanner.nextInt();
            hotel.melihatDetailPemesanan(roomChoice, namaUser);
        } else if (userChoice == 4) {
            System.out.println("Terima kasih " + namaUser + " sudah memesan kamar di hotel ini!");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public static void adminMenu(Scanner scanner, Hotel hotel) {
        System.out.println("Halo Admin!");
        System.out.print("Nama: ");
        String namaAdmin = scanner.nextLine();
        System.out.print("Id Admin: ");
        int idAdmin = scanner.nextInt();

        System.out.println("Pilih Menu khusus Admin");
        System.out.println("1. mengubah status kamar");
        System.out.println("2. melihat semua pemesanan");
        System.out.println("3. keluar");
        System.out.print("Pilih Menu: ");
        int adminChoice = scanner.nextInt();
        
        if (adminChoice == 1) {
            System.out.println("Pilih nomor untuk mengubah status ketersediaan Kamar");
            System.out.println("1. Kamar 1");
            System.out.println("2. Kamar 2");
            System.out.println("3. Kamar VIP 1");
            System.out.println("4. Kamar VIP 2");
            System.out.print("Masukkan pilihan: ");
            int roomChoice = scanner.nextInt();
            System.out.println("Masukkan status baru (Tersedia/Tidak Tersedia): ");
            String status = scanner.next();
            hotel.mengubahStatus(roomChoice, status);
        } else if (adminChoice == 2) {
            hotel.melihatPesanan(namaAdmin, idAdmin);
        } else if (adminChoice == 3) {
            System.out.println("Sampai jumpa kembali " + namaAdmin + " !");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}