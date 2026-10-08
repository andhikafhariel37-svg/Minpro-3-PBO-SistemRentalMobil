# Mini Project 3 | Praktikum Pemrograman Berbasis Objek

## Andhika Fhariel Fadhlurrohman
## 2509116083

Sistem Manajemen Rental Mobil berbasis CLI (Command Line Interface) yang dikembangkan menggunakan bahasa pemrograman Java. Program ini dirancang untuk mengelola data armada kendaraan, jenis mobil (baik kategori Penumpang maupun Angkutan), serta transaksi penyewaan dengan mengintegrasikan arsitektur Model-View-Controller (MVC), prinsip Abstraction, Polymorphism, Encapsulation, Inheritance, serta Interface.

---

## Deskripsi Singkat Program

Sistem Rental Mobil berbasis Java CLI yang berfungsi mencatat armada kendaraan, mengelola transaksi sewa, dan menghitung total biaya secara otomatis menggunakan pola desain MVC.

---

## Penjelasan Struktur Package (MVC)
<img width="224" height="177" alt="image" src="https://github.com/user-attachments/assets/00094cfe-302f-41fa-8c13-3b35d895d044" />

Struktur proyek MVC (Model-View-Controller) membagi kode program menjadi tiga lapisan utama agar rapi, terorganisir, dan mudah dikembangkan.

1. Package model (Data & Entitas)

Peran: Menyimpan data dan aturan bisnis dasar.

Isi: Class entitas (Kendaraan, MobilPenumpang, MobilAngkutan, TransaksiSewa).

Fungsi: Menyediakan atribut, constructor, getter/setter, serta metode perhitungan (misalnya menghitung total biaya sewa).

2. Package controller (Logika Bisnis)

Peran: Menghubungkan lapisan model dan view.

Isi: Class pengelola (RentalController).

Fungsi: Menyimpan daftar data (misalnya ArrayList), memproses penambahan transaksi, pencarian data, dan penyediaan dummy data.

3. Package view (Antarmuka Pengguna)

Peran: Menangani tampilan interaksi dengan pengguna.

Isi: Class tampilan konsol (RentalView).

Fungsi: Menampilkan menu CLI, membaca input keyboard, menjalankan validasi input, dan mencetak hasil output ke layar.

4. Package main (Entry Point)

Peran: Titik awal jalannya aplikasi.

Isi: Class eksekusi (Main).

Fungsi: Memunculkan objek RentalController dan RentalView, lalu menjalankan program utama.

---

## Penjelesan Alur Program
<img width="327" height="74" alt="image" src="https://github.com/user-attachments/assets/07636a03-2c2d-4d66-bc7f-0f83d4cb57f2" />

Saat pertama kali aplikasi dijalankan, RentalController secara otomatis memuat data sampel awal ke dalam ArrayList sehingga pengguna dapat langsung melihat contoh daftar mobil dan riwayat transaksi.

Pengguna akan ditampilkan 4 Menu

<img width="529" height="116" alt="image" src="https://github.com/user-attachments/assets/70fa7d69-54db-4f3b-8b3b-1fd88a9909ba" />
Menu 1 memperlihatkan tampilan menu utama saat kita memilih opsi 1 untuk melihat daftar mobil yang tersedia. Sistem langsung menampilkan data armada awal lengkap dengan detail seperti ID, merk, kategori, tarif harian, hingga spesifikasi khusus dari tiap unit kendaraan.



