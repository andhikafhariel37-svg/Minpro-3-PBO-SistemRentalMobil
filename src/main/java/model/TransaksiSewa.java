/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class TransaksiSewa {
    private String namaPenyewa;
    private Kendaraan kendaraan;
    private int lamaSewaHari;

    public TransaksiSewa(String namaPenyewa, Kendaraan kendaraan, int lamaSewaHari) {
        this.namaPenyewa = namaPenyewa;
        this.kendaraan = kendaraan;
        this.lamaSewaHari = lamaSewaHari;
    }

    public double hitungTotalBiaya() {
        return kendaraan.getHargaSewaPerHari() * lamaSewaHari;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getLamaSewaHari() {
        return lamaSewaHari;
    }

    public void setLamaSewaHari(int lamaSewaHari) {
        this.lamaSewaHari = lamaSewaHari;
    }
}
