**Penyewaan Kamar Kos Mami Rohimah **

Saya memiliki kenalan ibu kos (mami rohimah) yang masih menggunakan metode jadul atau manual, saya ingin membantu dengan membuatkan sebuah program untuk memudahkan proses penyewaan kamar kos. Jadi program ini diharapkan dapat membantu pemilik kos untuk mengelola data penyewa dan kamar kos, serta mempermudah penyewa untuk melakukan kamar kos agar lebih mudah dan efisien.

1.	Aktor / yang terlibat dan use case nya: Penyewa Kost (Mami Rohimah/ aktor yang mengelola kost)
•	Mendaftar : Penyewa memasukkan data diri dan pilihan kamar yang diinginkan
•	Menyewa kamar: Penyewa melakukan pembayaran untuk menyewa kamar
•	Membayar sewa: Penyewa melakukan pembayaran sewa kamar secara berkala Pemilik Kost (aktor yang ingin menyewa kamar)
•	Mengelola data kamar: Pemilik kost dapat melihat dan mengelola data kamar yang tersedia
•	Mengelola data penyewa: Pemilik kost dapat melihat dan mengelola data penyewa yang telah menyewa kamar
•	Menerima pembayaran sewa: Pemilik kost dapat menerima pembayaran sewa kamar dari penyewa

2.	Class Diagram
 (gambar ada di laporan)

3.	Relasi AntarClass
•	ListHarga (dari package first) dan AwalData (dari package second) memiliki relasi asosiasi melalui implementasi interface daftar.
•	ListHarga memiliki objek dari AwalData dalam metode main di kelas Main.
•	ListHarga juga memiliki objek dari Data dalam metode main di kelas Main.

4.	Turunan/Relasi/interface. 
•	Turunan : Kamar dapat diturunkan menjadi Kamar Ac dan Kamar Kipas. 
•	Relasi : Kamar memiliki relasi 1 to many dengan penyewa dan penyewa memiliki relasi 1 to 1 dengan kamar. 
•	Interface : Kelas Penyewa dapat di implementasikan Interface Pembayaran yang miliki Metode Pembayaran()

5.	Library yang saya gunakan pada project ini:
•	Scanner untuk membaca input dari pengguna.
•	System.out untuk menampilkan output ke layar
•	QName untuk membuat nama qualified

6. Skenario
 1)	Menampilkan menu List Tipe Kamar dan Harga 
Langkah pertama apabila  kita mengakses project ini yaitu langsung menampilkan menu menu pilihan kamar yang tersedia dengan jenis fasilitasnya.
 2)	Input data Pribadi 
Masukkan nama, alamat, No. hp , pilihan kamar dan tanggal masuk pertama yang akan menjadi tanggal jatuh tempo pembayaran setiap bulan.
 3) Pilih Metode Pembayaran
Memilih akan menggunakan metode pembayaran apa Tunai,Transfer atau Dana yang nanti akan di arahkan secara otomatis di Bukti Sewa Kamar.
 4) Menampilkan Output
Menampilkan hasil dari yang sudah kita inputkan tadi menjadi satu dan untuk metode pembayaran akan menampilkan No. VA apabila tunai akan langsung membuat janji temu dengan Mami Rohimah sendiri.
