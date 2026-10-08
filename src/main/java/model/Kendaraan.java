/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public abstract class Kendaraan {
    private String idMobil;
    private String merk;
    private double hargaSewaPerHari;

    // Constructor 1
    public Kendaraan(String idMobil, String merk, double hargaSewaPerHari) {
        this.idMobil = idMobil;
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Constructor 2 (Overloading)
    public Kendaraan(String idMobil, String merk) {
        this.idMobil = idMobil;
        this.merk = merk;
        this.hargaSewaPerHari = 300000; // Default harga
    }

    // Abstract Method
    public abstract String getKategori();

    // Getter dan Setter (Encapsulation)
    public String getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(String idMobil) {
        this.idMobil = idMobil;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }
}
