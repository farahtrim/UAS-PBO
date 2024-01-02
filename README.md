**Sewa Kamar Kos Mami Rohimah**

saya memiliki kenalan ibu kos (mami rohimah) yang masih menggunakan metode jadul atau manual, saya ingin membantu dengan membuatkan sebuah program untuk memudahkan proses penyewaan kamar kos. Jadi program ini diharapkan dapat membantu pemilik kos untuk mengelola data penyewa dan kamar kos, serta mempermudah penyewa untuk melakukan kamar kos agar lebih mudah dan efisien.

Aktor / yang terlibat dan use case nya:
Penyewa Kost (Mami Rohimah/ aktor yang mengelola kost)
- Mendaftar : Penyewa memasukkan data diri dan pilihan kamar yang diinginkan
- Menyewa kamar: Penyewa melakukan pembayaran untuk menyewa kamar
- Membayar sewa: Penyewa melakukan pembayaran sewa kamar secara berkala
Pemilik Kost (aktor yang ingin menyewa kamar)
- Mengelola data kamar: Pemilik kost dapat melihat dan mengelola data kamar yang tersedia
- Mengelola data penyewa: Pemilik kost dapat melihat dan mengelola data penyewa yang telah menyewa kamar
- Menerima pembayaran sewa: Pemilik kost dapat menerima pembayaran sewa kamar dari penyewa

Data Penyewa :
- Nama
- Alamat
- No Telpon
- Pilihan Kamar
- Tanggal masuk kamar
- Tanggal Jatoh tempo pembayaran

Data Kamar : 
- Tipe Kamar 
- Harga Kamar

Turunan/Relasi/interface.
Turunan : Kamar dapat diturunkan menjadi Kamar Ac dan Kamar Kipas.
Relasi : Kamar memiliki relasi 1 to many dengan penyewa dan penyewa memiliki relasi 1 to 1 dengan kamar.
Interface : Kelas Penyewa dapat di implementasikan Interface Pembayaran yang miliki Metode Pembayaran()

Library yang saya gunakan pada project ini:
- Scanner untuk membaca input dari pengguna.
- System.out untuk menampilkan output ke layar
- QName untuk membuat nama qualified

Skenario 
Langkah 1 : penyewa mendaftar 
si penyewa datang ke kost dan bertemu dengan pemilik kost, apabila cocok si penyewa mengisi formulir pendaftaran yang berisi data diri dan pilihan kamar. Otomatis  masuk ke dalam sistem pemilik kost.
Langkah 2 : penyewa menyewa kamar
Sesuai yang sudah di tentukan di formulir pendaftaran menggunakan metode apa pembayaran nnya jika menggunakan transfer/uang elektronik maka hanya mengirim bukti pembayaran dan jika menggunakan metode Tunai si Penyewa datang ke kost dan membayar sewa kamar. Pemilik kost membuat bukti sewa kamar dan memberikannya kepada penyewa.
Langkah 3: penyewa membayar sewa kamar
Penyewa wajib membayarkan uang sewa tepat tanggal sebelum jatuh tempo. Menggunakan metode transfer/uang elektronik (mengirim bukti pembayaran) atau tunai (dibuatkan bukti  pembayaran) selanjutkan si pemilik mencatat pembayaran sewa kamar kedalam sistem.
