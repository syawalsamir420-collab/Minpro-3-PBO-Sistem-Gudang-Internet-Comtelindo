/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gudanginternet;

/**
 *
 * @author ASUS
 */
public class PerangkatJaringan extends Barang {
    private String merek;
    private int garansiBulan;

    public PerangkatJaringan(int id, String namaBarang, String kategori, double harga, int stok,
            String merek, int garansiBulan) {
        super(id, namaBarang, kategori, harga, stok); // keyword 'super' -> panggil constructor superclass
        setMerek(merek);
        setGaransiBulan(garansiBulan);
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        this.merek = merek;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    public void setGaransiBulan(int garansiBulan) {
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi tidak boleh negatif");
        }
        this.garansiBulan = garansiBulan;
    }
    public void tampilkanInfo() {
        System.out.println("--- [PERANGKAT JARINGAN] ---");
        super.tampilkanInfo();
        System.out.println("Merek       : " + merek);
        System.out.println("Garansi     : " + garansiBulan + " bulan");
    }
    public String toString() {
        return super.toString() + String.format(" | %-10s | %2d bln", merek, garansiBulan);
    }
}
