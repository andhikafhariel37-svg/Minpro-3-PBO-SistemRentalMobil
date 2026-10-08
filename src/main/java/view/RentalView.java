/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.RentalController;
import java.util.Scanner;
import model.Kendaraan;
import model.MobilAngkutan;
import model.MobilPenumpang;
import model.TransaksiSewa;

/**
 *
 * @author User
 */


public class RentalView {
    private RentalController controller;
    private Scanner scanner;

    public RentalView(RentalController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void jalankanMenu() {
        boolean berjalan = true;

        // Perulangan program utama
        while (berjalan) {
            System.out.println("\n=== SISTEM RENTAL MOBIL ===");
            System.out.println("1. Tampilkan Daftar Mobil");
            System.out.println("2. Tampilkan Riwayat Transaksi Sewa");
            System.out.println("3. Tambah Transaksi Sewa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = bacaInputAngka();

            // Percabangan pilihan menu
            switch (pilihan) {
                case 1:
                    tampilkanMobil();
                    break;
                case 2:
                    tampilkanTransaksi();
                    break;
                case 3:
                    tambahTransaksiMenu();
                    break;
                case 4:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem rental.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka 1-4.");
            }
        }
    }

    // Perulangan untuk menampilkan data mobil
    private void tampilkanMobil() {
        System.out.println("\n--- DAFTAR MOBIL TERSEDIA ---");
        for (Kendaraan k : controller.getDaftarMobil()) {
            System.out.print("ID: " + k.getIdMobil() + " | Merk: " + k.getMerk() + 
                             " | Kategori: " + k.getKategori() + 
                             " | Harga/Hari: Rp" + k.getHargaSewaPerHari());
            
            if (k instanceof MobilPenumpang) {
                System.out.println(" | Kapasitas: " + ((MobilPenumpang) k).getKapasitasPenumpang() + " orang");
            } else if (k instanceof MobilAngkutan) {
                System.out.println(" | Max Muatan: " + ((MobilAngkutan) k).getKapasitasBebanTon() + " ton");
            }
        }
    }

    // Perulangan untuk menampilkan data transaksi
    private void tampilkanTransaksi() {
        System.out.println("\n--- RIWAYAT TRANSAKSI SEWA ---");
        if (controller.getDaftarTransaksi().isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        for (TransaksiSewa t : controller.getDaftarTransaksi()) {
            System.out.println("Penyewa: " + t.getNamaPenyewa() + 
                               " | Mobil: " + t.getKendaraan().getMerk() + 
                               " (" + t.getKendaraan().getKategori() + ")" +
                               " | Lama Sewa: " + t.getLamaSewaHari() + " Hari" +
                               " | Total Biaya: Rp" + t.hitungTotalBiaya());
        }
    }

    private void tambahTransaksiMenu() {
        tampilkanMobil();
        System.out.print("\nMasukkan Nama Penyewa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan ID Mobil yang ingin disewa: ");
        String idMobil = scanner.nextLine();

        System.out.print("Masukkan Lama Sewa (Hari): ");
        int lamaSewa = bacaInputAngka();

        if (lamaSewa <= 0) {
            System.out.println("Lama sewa harus lebih dari 0 hari!");
            return;
        }

        boolean berhasil = controller.tambahTransaksi(nama, idMobil, lamaSewa);
        if (berhasil) {
            System.out.println("Transaksi berhasil ditambahkan!");
        } else {
            System.out.println("ID Mobil tidak ditemukan!");
        }
    }

    // Validasi Input Angka
    private int bacaInputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.print("Input harus berupa angka! Masukkan ulang: ");
            scanner.next();
        }
        int angka = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return angka;
    }
}
