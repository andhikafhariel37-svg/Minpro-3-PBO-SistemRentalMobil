/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import model.Kendaraan;
import model.MobilAngkutan;
import model.MobilPenumpang;
import model.TransaksiSewa;

public class RentalController {
    private ArrayList<Kendaraan> daftarMobil;
    private ArrayList<TransaksiSewa> daftarTransaksi;

    public RentalController() {
        daftarMobil = new ArrayList<>();
        daftarTransaksi = new ArrayList<>();
        isiDummyData();
    }

    // Minimal 1 Dummy Data Awal
    private void isiDummyData() {
        Kendaraan m1 = new MobilPenumpang("M01", "Avanza", 350000, 7);
        Kendaraan m2 = new MobilAngkutan("M02", "Pick Up L300", 400000, 1.5);
        
        daftarMobil.add(m1);
        daftarMobil.add(m2);

        // Dummy transaksi awal
        daftarTransaksi.add(new TransaksiSewa("Budi", m1, 3));
    }

    public ArrayList<Kendaraan> getDaftarMobil() {
        return daftarMobil;
    }

    public ArrayList<TransaksiSewa> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public Kendaraan cariMobilById(String id) {
        for (Kendaraan k : daftarMobil) {
            if (k.getIdMobil().equalsIgnoreCase(id)) {
                return k;
            }
        }
        return null;
    }

    public boolean tambahTransaksi(String nama, String idMobil, int lamaSewa) {
        Kendaraan mobil = cariMobilById(idMobil);
        if (mobil != null) {
            daftarTransaksi.add(new TransaksiSewa(nama, mobil, lamaSewa));
            return true;
        }
        return false;
    }
}