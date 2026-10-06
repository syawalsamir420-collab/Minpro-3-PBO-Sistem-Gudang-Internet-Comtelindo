package com.mycompany.gudanginternet.model;

public abstract class Barang {
    protected int id;
    protected String namaBarang;
    protected String kategori;
    protected double harga;
    protected int stok;

    public Barang(int id, String namaBarang, String kategori, double harga, int stok) {
        this.id = id;
        setNamaBarang(namaBarang);
        setKategori(kategori);
        setHarga(harga);
        setStok(stok);
    }

    public int getId() {
        return id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        if (namaBarang == null || namaBarang.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama barang tidak boleh kosong");
        }
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        if (kategori == null || kategori.trim().isEmpty()) {
            throw new IllegalArgumentException("Kategori tidak boleh kosong");
        }
        this.kategori = kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("ID Barang   : " + id);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Harga       : Rp" + String.format("%,.0f", harga));
        System.out.println("Stok        : " + stok);
    }

    public void tampilkanInfo(boolean ringkas) {
        if (ringkas) {
            System.out.println(namaBarang + " (ID: " + id + ")");
        } else {
            tampilkanInfo();
        }
    }

    public abstract void caraPenyimpanan();

    @Override
    public String toString() {
        return String.format("%-4d %-28s %-15s Rp%-13.0f %-6d",
                id, namaBarang, kategori, harga, stok);
    }
}
