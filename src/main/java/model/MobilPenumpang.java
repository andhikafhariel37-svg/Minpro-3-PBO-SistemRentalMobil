/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class MobilPenumpang extends Kendaraan {
    private int kapasitasPenumpang;

    public MobilPenumpang(String idMobil, String merk, double hargaSewaPerHari, int kapasitasPenumpang) {
        super(idMobil, merk, hargaSewaPerHari);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Polymorphism Overriding
    @Override
    public String getKategori() {
        return "Mobil Penumpang";
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
}
