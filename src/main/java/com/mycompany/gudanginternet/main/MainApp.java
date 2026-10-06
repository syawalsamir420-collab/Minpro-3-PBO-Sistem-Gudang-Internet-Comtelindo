package com.mycompany.gudanginternet.main;

import com.mycompany.gudanginternet.controller.BarangController;
import com.mycompany.gudanginternet.view.BarangView;
//  Aslab Sayang Praktikan
// Bismillah 100
// Jangan Lupa kasih bintang 5 buat abang aslab ini
// Thanks bang 
public class MainApp {
    public static void main(String[] args) {
        BarangController controller = new BarangController();

        controller.tambahBarang("Kabel UTP Cat 6", "Kabel", 5000, 200, 100.0, "UTP Cat 6");
        controller.tambahBarang("Modem ZTE F609", "Perangkat Jaringan", 350000, 25, "ZTE", 12);
        controller.tambahBarang("Router Mikrotik RB750", "Perangkat Jaringan", 620000, 10, "Mikrotik", 24);
        controller.tambahBarang("Kabel Fiber Optik Dropcore", "Kabel", 750000, 15, 100.0, "Fiber Optik");
        controller.tambahBarang("Konektor RJ45", "Aksesoris", 1500, 500);

        BarangView view = new BarangView(controller);
        view.tampilkanMenuUtama();
    }
}
