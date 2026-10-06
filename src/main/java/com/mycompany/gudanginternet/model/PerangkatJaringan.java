package com.mycompany.gudanginternet.model;

public class PerangkatJaringan extends Barang implements Bergaransi {
    private String merek;
    private int garansiBulan;

    public PerangkatJaringan(int id, String namaBarang, String kategori, double harga, int stok,
            String merek, int garansiBulan) {
        super(id, namaBarang, kategori, harga, stok);
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

    @Override
    public void tampilkanInfo() {
        System.out.println("--- [PERANGKAT JARINGAN] ---");
        super.tampilkanInfo();
        System.out.println("Merek       : " + merek);
        System.out.println("Garansi     : " + garansiBulan + " bulan");
    }

    @Override
    public void caraPenyimpanan() {
        System.out.println("Cara penyimpanan: Simpan di rak elektronik, hindari suhu lembap.");
    }

    @Override
    public void klaimGaransi() {
        if (garansiBulan > 0) {
            System.out.println(namaBarang + " masih bergaransi " + garansiBulan + " bulan.");
        } else {
            System.out.println(namaBarang + " sudah tidak bergaransi.");
        }
    }

    @Override
    public int getSisaGaransiBulan() {
        return garansiBulan;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %-10s | %2d bln", merek, garansiBulan);
    }
}
