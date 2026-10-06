package com.mycompany.gudanginternet.model;

public class BarangUmum extends Barang {

    public BarangUmum(int id, String namaBarang, String kategori, double harga, int stok) {
        super(id, namaBarang, kategori, harga, stok);
    }
    public void caraPenyimpanan() {
        System.out.println("Cara penyimpanan: Disimpan di rak gudang biasa.");
    }
}
