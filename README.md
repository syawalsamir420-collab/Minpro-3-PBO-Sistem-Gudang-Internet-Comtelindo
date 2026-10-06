<img width="517" height="96" alt="image" src="https://github.com/user-attachments/assets/50486d9e-5385-4d57-9c47-3bac968268b5" /><div align="justify">

# Gudang Internet Comtelindo
# MINPRO 3 PBO

## 👤 Identitas

| | |
|---|---|
| **Nama** | Muhammad Syawal Samir |
| **NIM** | 2509116079 |
| **Kelas** | Sistem Informasi 25'B |
| **Tema** | Gudang Internet |
| **Minpro PBO** | 3 |

### 1. Deskripsi Singkat Program

Sistem Gudang Internet Comtelindo adalah program Java sederhana berbasis *console* yang digunakan untuk mengelola data barang atau perangkat di gudang, seperti modem, kabel, router, dan sejenisnya. Program ini menggunakan `ArrayList` untuk menyimpan data selama aplikasi berjalan, sehingga data akan hilang begitu program ditutup (belum tersimpan permanen ke database atau file).

Lewat program ini, pengguna dapat menambahkan barang baru, melihat seluruh data barang yang ada, mencari barang tertentu menggunakan ID, memperbarui data barang jika ada perubahan, hingga menghapus data barang yang sudah tidak digunakan lagi. Semua fitur tersebut dikemas secara praktis dalam satu menu utama yang dapat dipilih menggunakan opsi angka.

Program ini mengimplementasikan fitur CRUD (*Create, Read, Update, Delete*) serta beberapa fitur tambahan yang terdiri dari menu utama sebagai berikut:

* **Tambah Barang:** Digunakan untuk menambahkan data barang baru ke dalam sistem gudang.
* **Tampilkan Semua Barang:** Digunakan untuk melihat seluruh daftar data barang yang tersimpan.
* **Cari Barang berdasarkan ID:** Digunakan untuk mencari data barang tertentu secara spesifik melalui ID-nya.
* **Update Barang:** Digunakan untuk mengubah informasi atau data barang yang sudah ada sebelumnya.
* **Hapus Barang:** Digunakan untuk menghapus data barang dari sistem gudang.
* **Klaim Garansi:** Digunakan untuk memproses klaim garansi pada barang tertentu, di mana masa garansi secara otomatis diatur menjadi 12 bulan.
* **Hitung Harga Diskon:** Digunakan untuk menghitung penawaran harga diskon pada barang tertentu (sebagai contoh, modem dengan harga asli Rp350.000 mendapatkan potongan harga khusus menjadi Rp4.750, di mana besaran harga diskon dapat ditentukan sesuai kebutuhan).
* **Keluar:** Digunakan untuk mengakhiri jalannya program.

<h3>2.Encapsulation</h3>

semua atribut seperti id, namaBarang, kategori, harga, dan stok dibuat dengan modifier protected, bukan public. Artinya, atribut-atribut ini tidak bisa diakses atau diubah sembarangan dari luar class  harus lewat method getter dan setter yang sudah disediakan.

- Dibawah Ini ialah kodenya Di Class Barang Java

<p align="center">
<img width="388" height="140" alt="image" src="https://github.com/user-attachments/assets/fe837fa3-a9ad-427e-af5c-3cf2ee439099" />
</p>

<p align="center">
<img width="425" height="93" alt="image" src="https://github.com/user-attachments/assets/9f8ffa82-04d4-46b7-b883-5bec63526305" />
</p>

<p align="center">
<img width="907" height="133" alt="image" src="https://github.com/user-attachments/assets/490e9a34-4872-448f-a74b-53151a71ee77" />
</p>

<p align="center">
<img width="877" height="140" alt="image" src="https://github.com/user-attachments/assets/941652be-4893-426a-9143-a5cf861fd0eb" />
</p>

<p align="center">
<img width="850" height="127" alt="image" src="https://github.com/user-attachments/assets/9d39b308-4b92-4c01-ba8c-4820b89390b4" />
</p>

- Dibawah Ini ialah kodenya Di Class Kabel Jaringan

<p align="center">
<img width="967" height="130" alt="image" src="https://github.com/user-attachments/assets/53c58dc5-7250-4143-80c9-7b7b562a2f41" />
</p>

- Dibawah Ini ialah kodenya Di Class Perangkat Jaringan

<p align="center">
<img width="851" height="137" alt="image" src="https://github.com/user-attachments/assets/b965f6cc-2e14-40a7-ac9e-4ba63f94282f" />
</p>


<h3>3.Inheritance</h3>

Kabel Jaringan extends Barang dan PerangkatJaringan extends Barang. Kedua class anak ini otomatis "mewarisi" semua atribut dan method dari Barang  jadi mereka tidak perlu menulis ulang id, namaBarang, harga, stok, dll, cukup tinggal pakai. Yang mereka lakukan hanyalah menambahkan atribut khusus sesuai kebutuhan masing-masing: KabelJaringan menambahkan panjangMeter dan jenisKabel, sedangkan PerangkatJaringan menambahkan merek dan garansiBulan.

- Dibawah Ini ialah kodenya Di Class Kabel Jaringan

<p align="center">
<img width="566" height="22" alt="image" src="https://github.com/user-attachments/assets/2f4dab13-f3f0-4342-8f5c-3581a4fbbc8f" />
</p>

<p align="center">
<img width="645" height="20" alt="image" src="https://github.com/user-attachments/assets/05f7329d-2c1a-4851-9ca9-d8fe2dd7e913" />
</p>

- Dibawah Ini ialah kodenya Di Class Perangkat Jaringan

<p align="center">
<img width="563" height="22" alt="image" src="https://github.com/user-attachments/assets/3e14d846-5b56-4a7e-a7d7-18978fe4c7f2" />
</p>

<p align="center">
<img width="596" height="18" alt="image" src="https://github.com/user-attachments/assets/1e6f4185-02b7-4c2b-954d-9668f406b436" />
</p>

<h3>4.Polymorphism</h3>

yaitu overloading dan overriding. Bentuk pertama, overloading, terlihat pada method tambahBarang() di class BarangService, yang ditulis tiga kali dengan nama yang sama namun jumlah dan tipe parameter yang berbeda. Java secara otomatis akan memilih versi method mana yang dijalankan berdasarkan data yang dikirim jika hanya diberikan data dasar (nama, kategori, harga, stok), maka akan dibuat objek Barang biasa; namun jika disertakan merek dan garansiBulan, method akan otomatis membuat objek PerangkatJaringan, begitu juga jika disertakan panjangMeter dan jenisKabel, maka yang dibuat adalah KabelJaringan. Dengan begitu, satu nama method dapat memiliki beberapa perilaku berbeda tergantung konteks pemanggilannya.

<h3>Method Overloading</h3> 

- Dibawah Ini ialah kodenya Di Class Barang service

<p align="center">
<img width="1040" height="25" alt="image" src="https://github.com/user-attachments/assets/0ea479ab-d8b8-40ea-9897-52d7f0a56326" />
</p>

<p align="center">
<img width="1196" height="46" alt="image" src="https://github.com/user-attachments/assets/a07568d6-9cf7-45aa-b5b6-9cb2dd74b0df" />
</p>

<p align="center">
<img width="1022" height="47" alt="image" src="https://github.com/user-attachments/assets/7ba289e7-fff6-4238-bb70-65cce7706b6e" />
</p>

           
<h3>Method Overriding</h3> 

- Dibawah Ini ialah kodenya Di Class Barang

<p align="center">
<img width="935" height="160" alt="image" src="https://github.com/user-attachments/assets/4f9702a7-cd9c-4bad-be4e-6885c8c46fc9" />
</p>

<p align="center">
<img width="782" height="107" alt="image" src="https://github.com/user-attachments/assets/4d9ea3e8-6c16-43cc-8025-62f685f6d2f7" />
</p>

- Dibawah Ini ialah kodenya Di Class Kabel Jaringan

<p align="center">
<img width="837" height="155" alt="image" src="https://github.com/user-attachments/assets/c1a1152d-9dbc-4c3c-9c1c-fdf5f1b956d4" />
</p>

<p align="center">
<img width="1027" height="85" alt="image" src="https://github.com/user-attachments/assets/cab5ea3b-7701-46cd-91ba-a68a4c3c48b5" />
</p>

- Dibawah Ini ialah kodenya Di Class Perangkat Jaringan

<p align="center">
<img width="887" height="142" alt="image" src="https://github.com/user-attachments/assets/bc997ebf-0113-4b87-8082-ac49dbe8e946" />
</p>

<p align="center">
<img width="1062" height="72" alt="image" src="https://github.com/user-attachments/assets/876241bc-7276-4901-911e-5ac87b516fed" />
</p>

<h3>abstraction</h3> 

Abstraksi adalah teknik dalam Pemrograman Berorientasi Objek untuk menyembunyikan detail implementasi yang rumit dan hanya menampilkan fungsionalitas esensial kepada pengguna. Teknik ini digunakan untuk memisahkan antara rancangan aturan (WHAT TO DO) dengan detail pengerjaannya (HOW TO DO).Abstract class merupakan kelas abstrak yang digunakan untuk menentukan karakteristik dari sebuah kelas, yaitu kelas yang sengaja dibuat tidak lengkap agar strukturnya bisa diikuti oleh subclass-nya. Abstract class tidak bisa dibuat menjadi objek secara langsung, melainkan harus diturunkan (extends) terlebih dahulu ke subclass baru bisa digunakan. Abstract class dapat memiliki property, method yang belum berisi (abstract method), dan method yang sudah berisi, di mana method yang belum berisi tersebut nantinya wajib dilengkapi oleh subclass yang menurunkannya.

- Dibawah Ini ialah kodenya Di Class Barang

<p align="center">
<img width="482" height="167" alt="image" src="https://github.com/user-attachments/assets/d05d8193-8f10-477e-b65a-a84320025b0c" />
</p>

<h3>Interface</h3> 

Interface merupakan tipe abstrak yang digunakan untuk menentukan karakteristik dari sebuah kelas, dan merupakan bentuk abstraksi paling murni karena bukan kelas, melainkan sebuah kontrak perjanjian. Interface hanya berisi kontrak berupa method tanpa isi, sehingga kelas yang meng-implement wajib mengisi seluruh method tersebut. Berbeda dengan abstract class yang hanya boleh diturunkan dari satu induk, sebuah class bisa meng-implement lebih dari satu interface sekaligus.

- Dibawah Ini ialah kodenya Di Class Bergarasi

<p align="center">
<img width="517" height="96" alt="image" src="https://github.com/user-attachments/assets/7e6839fe-5c48-4a3d-b4fa-3c027a78174c" />
</p>

- Dibawah Ini ialah kodenya Di Class Diskon

<p align="center">
<img width="660" height="87" alt="image" src="https://github.com/user-attachments/assets/06fd8e72-41f2-4c74-a26d-9b10a664691f" />
</p>

<h3>5.Penjelasan alur program</h3>

- Saat program dijalankan, sistem langsung menampilkan Menu Utama yang berisi 6 pilihan: Tambah Barang, Tampilkan Semua Barang, Cari Barang berdasarkan ID, Update Barang, Hapus Barang, dan Keluar. Pengguna tinggal mengetik angka 1 sampai 6 sesuai menu yang mau dipilih.

- Kalau  memilih 1 (Tambah Barang), sistem akan minta input 3 Kategori Barang yaitu  Barang biasa,Barang Merek Dan Garansi, Dan Barang Panjang & merek kabel. nama barang, kategori, harga, dan stok. Setelah semua diisi, data langsung disimpan ke dalam ArrayList dan sistem otomatis kasih ID baru untuk barang tersebut, lalu menampilkan pesan konfirmasi kalau barang berhasil ditambahkan.

- Kalau memilih 2 (Tampilkan Semua Barang), sistem akan menampilkan seluruh data barang yang sudah tersimpan dalam bentuk tabel, lengkap dengan ID, nama, kategori, harga, dan stoknya.

- Kalau memilih 3 (Cari Barang berdasarkan ID), pengguna diminta memasukkan ID barang yang dicari. Sistem akan mencari data dengan ID tersebut di ArrayList, lalu menampilkan detail barang itu saja kalau ditemukan.

- Kalau memilih 4 (Update Barang), sistem dulu menampilkan daftar semua barang supaya pengguna tahu ID mana yang mau diubah. Setelah ID dimasukkan, sistem menampilkan data lama barang tersebut, lalu meminta input data baru (nama, kategori, harga, stok). Data lama kemudian ditimpa dengan data baru itu.

- Kalau memilih 5 (Hapus Barang), sistem juga menampilkan daftar barang dulu, lalu meminta ID barang yang mau dihapus. Sebelum benar-benar dihapus, ada pertanyaan konfirmasi (y/n) supaya tidak salah hapus data. Kalau dijawab "y", barang langsung dihapus dari ArrayList yang ada di kode

Kalau memilih 6 (Keluar), sistem menampilkan pesan penutup lalu program berhenti berjalan.

Proses ini terus berulang (looping) kembali ke Menu Utama setiap selesai menjalankan satu menu, sampai pengguna memilih untuk keluar.

<h3>6. DOKUMENTASI PROGRAM</h3>

<h3>A.Menu Gudang Internet Comtelindo</h3>

Sistem Gudang Internet Comtelindo adalah aplikasi command-line interface (CLI) sederhana yang digunakan untuk mengelola data inventaris barang di gudang internet Comtelindo. Aplikasi ini menyediakan menu interaktif dengan enam pilihan utama: menambahkan barang baru ke dalam sistem, menampilkan seluruh daftar barang yang tersedia, mencari barang berdasarkan ID tertentu, memperbarui data barang yang sudah ada, menghapus barang dari daftar, serta keluar dari program. Dengan antarmuka berbasis teks yang ringan dan mudah digunakan, sistem ini cocok untuk membantu pengelolaan stok barang secara cepat tanpa memerlukan tampilan grafis yang kompleks.

<p align="center">
  <img width="510" height="285" alt="Cuplikan layar 2026-09-23 180721" src="https://github.com/user-attachments/assets/6d61cb86-d863-42ad-b3fb-5a84ed91bdb7" />
</p>


<h3>B.Menampilkan Menu Tambah Barang Biasa</h3>

Fitur Tambah Barang memungkinkan pengguna menambahkan data barang baru ke dalam sistem gudang. Saat memilih menu ini, pengguna akan diminta menentukan jenis barang terlebih dahulu, yaitu Barang Biasa, Perangkat Jaringan (yang memiliki atribut merek dan garansi), atau Kabel Jaringan (yang memiliki atribut panjang dan jenis kabel). Setelah jenis dipilih, sistem akan meminta input berupa nama barang, kategori, harga, dan jumlah stok. Setiap barang yang berhasil ditambahkan akan otomatis diberikan ID unik oleh sistem sebagai penanda identitas barang tersebut di dalam gudang.

<p align="center">
 <img width="543" height="548" alt="Cuplikan layar 2026-09-23 191503" src="https://github.com/user-attachments/assets/6edf203c-172a-4e30-944f-a64e5da44e88" />
</p>

<h3>C.Menampilkan Menu Tambah Barang punya merek & garansi</h3>

Untuk jenis Perangkat Jaringan, sistem akan meminta dua informasi tambahan di luar data barang standar, yaitu merek dan masa garansi (dalam bulan). Contohnya, barang bernama "Splicer" dengan kategori Elektronik, harga Rp100.000.000, stok 20 unit, merek "Signal Fire Original", dan garansi 12 bulan berhasil ditambahkan dengan ID 7. Atribut khusus ini membedakan Perangkat Jaringan dari Barang Biasa, karena informasi merek dan garansi penting untuk keperluan klaim atau pelacakan kualitas perangkat jaringan yang digunakan.

<p align="center">
<img width="571" height="582" alt="image" src="https://github.com/user-attachments/assets/5fb6797d-19c6-4b8a-a955-1ff77090e745" />
</p>

<h3>D.Menampilkan Menu Tambah Barang punya panjang & jenis kabeli</h3>

Untuk jenis Kabel Jaringan, sistem meminta dua informasi tambahan berupa panjang kabel (dalam meter) dan jenis kabel. Contohnya, barang "Kabel 96 core" dengan kategori Kabel, harga Rp1.000.000, stok 10, panjang 150 meter, dan jenis kabel FO (Fiber Optik) berhasil ditambahkan dengan ID 8. Atribut ini penting untuk membedakan spesifikasi teknis antar jenis kabel, seperti UTP, Fiber Optik, atau jenis lainnya, sehingga memudahkan pencarian kabel sesuai kebutuhan instalasi jaringan.

<p align="center">
<img width="537" height="597" alt="Cuplikan layar 2026-09-23 192104" src="https://github.com/user-attachments/assets/83610f30-fe9d-4b90-8177-a75bb05aa625" />
</p>

<h3>E.Tampilkan Semua Barang</h3>

Fitur Tampilkan Semua Barang digunakan untuk menampilkan seluruh daftar barang yang tersimpan di gudang secara lengkap dan terperinci. Setiap barang ditampilkan beserta ID, nama, kategori, harga, dan stoknya, ditambah atribut khusus sesuai jenisnya masing-masing — misalnya barang jenis Kabel Jaringan akan menampilkan informasi panjang dan jenis kabel, sedangkan Perangkat Jaringan menampilkan informasi merek dan lama garansi. Fitur ini memudahkan pengguna untuk melihat kondisi gudang secara menyeluruh dalam satu tampilan, termasuk barang biasa yang hanya menampilkan data standar tanpa atribut tambahan.

<p align="center">
<img width="571" height="945" alt="Cuplikan layar 2026-09-23 192422" src="https://github.com/user-attachments/assets/5a2e363b-475a-4a1d-85ce-6ed898471ffc" />
</p>

<h3>F.Cari Barang berdasarkan ID</h3>

Fitur Cari Barang berdasarkan ID memungkinkan pengguna menemukan data barang tertentu dengan cepat cukup dengan memasukkan ID barang yang dicari. Jika barang dengan ID tersebut ditemukan, sistem akan menampilkan seluruh detail informasinya, mulai dari nama, kategori, harga, dan stok, hingga atribut khusus sesuai jenis barangnya. Sebagai contoh, pencarian dengan ID 2 menampilkan data lengkap "Modem ZTE F609" yang termasuk kategori Perangkat Jaringan, lengkap dengan informasi merek dan garansinya. Fitur ini sangat berguna untuk mempercepat proses pengecekan barang tanpa harus menelusuri seluruh daftar barang di gudang.

<p align="center">
<img width="548" height="600" alt="Cuplikan layar 2026-09-23 192705" src="https://github.com/user-attachments/assets/75afef52-a23d-4175-ba4b-39d7d1f96132" />
</p>

<h3>G.Update Barang</h3>

Fitur Update Barang digunakan untuk memperbarui data barang yang sudah ada di dalam gudang. Sistem terlebih dahulu menampilkan seluruh daftar barang sebagai referensi, kemudian pengguna diminta memasukkan ID barang yang ingin diperbarui. Setelah itu, sistem menampilkan data barang tersebut saat ini sebagai pembanding, lalu meminta input data baru berupa nama barang, kategori, harga, dan stok. Sebagai contoh, barang dengan ID 3 ("Router Mikrotik RB750") berhasil diperbarui menjadi "Cisco Pocket Tracer" dengan kategori Elektronik, harga Rp1.000.000.000, dan stok 20. Fitur ini memastikan data barang di gudang tetap akurat dan sesuai dengan kondisi terkini.

<p align="center">
<img width="563" height="848" alt="Cuplikan layar 2026-09-23 193159" src="https://github.com/user-attachments/assets/5431ac13-6135-4a0e-a8c5-d0008f08c9a1" />
</p>

<h3>G.Update Barang</h3>

Fitur Hapus Barang digunakan untuk menghapus data barang dari gudang yang sudah tidak diperlukan lagi. Sistem terlebih dahulu menampilkan seluruh daftar barang, kemudian pengguna diminta memasukkan ID barang yang ingin dihapus. Sebelum benar-benar menghapus data, sistem akan menampilkan konfirmasi berupa nama barang yang akan dihapus dan meminta persetujuan pengguna (y/n) untuk mencegah penghapusan yang tidak disengaja. Sebagai contoh, barang dengan ID 3 ("Cisco Pocket Tracer") berhasil dihapus setelah pengguna mengonfirmasi dengan menekan "y". Fitur ini memastikan proses penghapusan data dilakukan dengan aman dan terkendali.

<p align="center">
<img width="660" height="946" alt="Cuplikan layar 2026-09-23 193321" src="https://github.com/user-attachments/assets/39c74a99-9a97-474c-85e4-25981544319f" />
</p>

<h3>H.Klaim Garansi</h3>

Fitur Klaim Garansi digunakan untuk memeriksa apakah suatu barang di gudang masih berada dalam masa garansi. Pada fitur ini, saya memilih menu nomor 6 dari menu utama, kemudian sistem meminta saya memasukkan ID barang yang ingin diklaim garansinya. Setelah ID dimasukkan, sistem mencari data barang tersebut dan menampilkan informasi masa garansinya. Sebagai contoh, saya memasukkan ID 2, lalu sistem menampilkan pesan bahwa Modem ZTE F609 masih bergaransi 12 bulan. Fitur ini membantu saya mengetahui status garansi suatu barang dengan cepat tanpa harus memeriksa data barang satu per satu.

<p align="center">
<img width="470" height="377" alt="image" src="https://github.com/user-attachments/assets/d6fa48ae-0e7d-4b83-aaf5-ce6b90b743e4" />
</p>

<h3>I.Hitung Harga Diskon</h3>

Fitur Cari Barang berdasarkan ID digunakan untuk menampilkan detail satu barang tertentu di gudang. Saya memilih menu nomor 3, lalu memasukkan ID barang yang ingin dicari, yaitu ID 1. Sistem kemudian menampilkan data lengkap barang tersebut, yaitu Kabel UTP Cat 6 dengan kategori Kabel, harga asli Rp5.000, stok 200, panjang 100.0 meter, dan jenis kabel UTP Cat 6. Fitur ini membantu saya melihat informasi barang dengan cepat, termasuk harga aslinya sebelum diberi diskon.

Fitur Hitung Harga Diskon digunakan untuk menghitung harga barang setelah dipotong diskon. Saya memilih menu nomor 7, memasukkan ID barang yang sama (ID 1), lalu memasukkan persen diskon sebesar 50. Sistem mengambil harga asli Rp5.000 dan menghitung potongannya, sehingga harga setelah diskon 50.0% menjadi Rp2.500. Fitur ini memudahkan saya mengetahui harga akhir barang tanpa harus menghitung secara manual.

<p align="center">
<img width="463" height="850" alt="image" src="https://github.com/user-attachments/assets/4aeb472a-2979-4606-9a46-42bc79207efc" />
</p>

<h3>J.Keluar</h3>

Fitur Keluar digunakan untuk mengakhiri program dengan aman. Saat pengguna memilih menu ini, sistem akan menampilkan pesan terima kasih sebagai penutup sebelum program berhenti berjalan. Ini menandakan seluruh siklus penggunaan aplikasi, mulai dari menambah, menampilkan, mencari, memperbarui, hingga menghapus data barang, telah selesai dan pengguna dapat keluar dari sistem kapan saja tanpa kehilangan data yang sudah tersimpan.

<p align="center">
<img width="690" height="433" alt="Cuplikan layar 2026-09-23 193531" src="https://github.com/user-attachments/assets/5971324b-169c-4112-9c30-634dfcd2a738" />
</p>

</div>
