/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class MobilAngkutan extends Kendaraan {
    private double kapasitasBebanTon;

    public MobilAngkutan(String idMobil, String merk, double hargaSewaPerHari, double kapasitasBebanTon) {
        super(idMobil, merk, hargaSewaPerHari);
        this.kapasitasBebanTon = kapasitasBebanTon;
    }

    // Polymorphism Overriding
    @Override
    public String getKategori() {
        return "Mobil Angkutan/Muat";
    }

    public double getKapasitasBebanTon() {
        return kapasitasBebanTon;
    }

    public void setKapasitasBebanTon(double kapasitasBebanTon) {
        this.kapasitasBebanTon = kapasitasBebanTon;
    }
}
