package com.mycompany.gudanginternet.model;

public class KabelJaringan extends Barang implements Diskon {
    private double panjangMeter;
    private String jenisKabel;

    public KabelJaringan(int id, String namaBarang, String kategori, double harga, int stok,
            double panjangMeter, String jenisKabel) {
        super(id, namaBarang, kategori, harga, stok);
        setPanjangMeter(panjangMeter);
        setJenisKabel(jenisKabel);
    }

    public double getPanjangMeter() {
        return panjangMeter;
    }

    public void setPanjangMeter(double panjangMeter) {
        if (panjangMeter <= 0) {
            throw new IllegalArgumentException("Panjang kabel harus lebih dari 0");
        }
        this.panjangMeter = panjangMeter;
    }

    public String getJenisKabel() {
        return jenisKabel;
    }

    public void setJenisKabel(String jenisKabel) {
        if (jenisKabel == null || jenisKabel.trim().isEmpty()) {
            throw new IllegalArgumentException("Jenis kabel tidak boleh kosong");
        }
        this.jenisKabel = jenisKabel;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- [KABEL JARINGAN] ---");
        super.tampilkanInfo();
        System.out.println("Panjang     : " + panjangMeter + " meter");
        System.out.println("Jenis Kabel : " + jenisKabel);
    }

    @Override
    public void caraPenyimpanan() {
        System.out.println("Cara penyimpanan: Digulung rapi dan disimpan di drum kabel.");
    }

    @Override
    public double hitungHargaSetelahDiskon(double persenDiskon) {
        if (persenDiskon < 0 || persenDiskon > 100) {
            throw new IllegalArgumentException("Persen diskon harus 0-100");
        }
        return harga - (harga * persenDiskon / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %.1fm | %-10s", panjangMeter, jenisKabel);
    }
}
