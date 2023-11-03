### PA_PBO_Kelompok_2
### PEMROGRAMAN BERORIENTASI OBJEK

##### Nama Anggota
##### Silva Jen Retno (2209116019)
##### Lidia Aprilia Putri (2209116041)

### SISTEM PENGELOLAAN PENJADWALAN KERETA API

#### Deskripsi Project
###### Program jadwal kereta api yang terdiri dari admin yang dapat menambah, menghapus, dan melihat jadwal kereta dan penumpang yang dapat melihat jadwal kereta adalah sistem manajemen jadwal kereta api yang memungkinkan penumpang untuk melihat informasi terkait jadwal kereta api. Program ini terdiri dari dua peran utama, yaitu admin dan penumpang, masing-masing dengan fungsionalitas yang berbeda. Berikut adalah deskripsi rinci mengenai program ini:
##### Admin:
##### Seorang admin memiliki akses penuh untuk menambah, dan menghapus jadwal kereta api. Admin dapat mengakses halaman admin khusus di mana mereka dapat melakukan tindakan pengelolaan data, seperti menambahkan kereta baru, atau menghapus jadwal yang sudah tidak relevan. Admin dapat menambah dan menghapus rincian jadwal kereta seperti nama kereta, tipe kereta, rute, jarak, stasiun, waktu kedatangan, waktu keberangkatan, dan tanggal perjalanan. Program menyediakan antarmuka yang mudah digunakan bagi admin untuk melakukan semua tindakan pengelolaan dengan aman dan efisien.

##### Penumpang:
##### Penumpang dapat melihat jadwal kereta api yang tersedia untuk perjalanan mereka. Penumpang memiliki akses hanya untuk melihat informasi jadwal kereta, termasuk nama kereta, tipe kereta, rute, jarak, stasiun, waktu kedatangan, waktu keberangkatan, dan tanggal perjalanan. Program menyediakan antarmuka yang ramah pengguna untuk penumpang agar mereka dapat dengan mudah menemukan jadwal kereta yang sesuai dengan kebutuhan perjalanan mereka.

##### Selain itu, sistem ini juga menggunakan MySQL untuk menyimpan data-data seperti data karyawan, jadwal kereta, penumpang dan data admin.

#### Flowchat
![FC PA PBO 2 drawio](https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/af970dc7-18f6-458c-9ded-b4c3de9dbe8f)


#### ERD
<img width="781" alt="erdrelational" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/802d5dc6-edac-471a-bfe0-1b0d160e22d4">
<img width="787" alt="erdlogical" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/fd6189dc-8358-41f0-a80a-0e88569fb57a">

#### Hirarki
![hirarki drawio (1)](https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/b10f44ae-8e29-4a8d-9bcd-d84f6df5ef8d)

##### Package dan Kelas
<img width="146" alt="package dan kelas" src="https://github.com/PA-PBO-KELOMPOK-2-Project-Akhir/PA-PBO-Kelompok-2/assets/121993396/9ee78a34-bec5-4260-8a3f-3dbec49897d2">

##### Import Libraries
<img width="134" alt="importfilejar" src="https://github.com/PA-PBO-KELOMPOK-2-Project-Akhir/PA-PBO-Kelompok-2/assets/121993396/9ebf5986-4c93-40db-a4cb-4debc5f9bd96">


#### Analisis Program
##### Final Variabel
<img width="960" alt="final" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/f1bb6226-5272-4905-966b-0494c3a84832">

##### Method
<img width="960" alt="method" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/786ecc12-ea08-42f5-9da7-13e36f3fec4c">

##### Class
<img width="960" alt="image" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/7f50c926-3d40-418b-b684-a32e9e94a018">


##### Encaptulation
<img width="960" alt="getter seter" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/0889662f-343d-462d-9c11-b6c0f10a636b">


#### Alur Program
##### 1. Menu Awal
<img width="376" alt="menuawal" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/e10118f5-1e0b-41c2-bfb7-4c3206bc9972">

###### Berdasarkan gambar diatas, tampilan awal program yaitu pemilihan role login, dimana admin dan juga penumpang diminta untuk memilih role.

##### 2. Login
<img width="372" alt="login" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/6de963c2-091b-438b-bb81-b7b4da35f40b">

######  Baik admin maupun penumpang diminta untuk memasukkan username dan password yang telah tersedia.

##### 3. Pesan Berhasil Login
<img width="196" alt="pesanlogin" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/73e5700f-e990-49d4-b474-33463bc946b2">

###### Jika password dan username yang dimasukkan itu benar, maka login akan berhasil lalu admin dan penumpang akan masuk ke halaman menu utama program.

##### 4. Pesan Gagal Login
###### Jika password dan username yang dimasukkan itu salah, maka login akan gagal lalu admin dan penumpang akan diminta untuk login kembali.

##### 5. Menu Admin
<img width="372" alt="menuadmin" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/78c827d9-c2c6-46f0-9b14-a5a58283a7bb">

###### Berdasarkan gambar diatas, pada tampilan halaman menu utama terdapat dua pilihan menu, yaitu kelola jadwal kereta dan iformasi karyawan. Admin akan diminta untuk memilih salah satu dari pilihan yang telah tersedia.

##### 6. Pilih Jadwal Kereta
<img width="525" alt="menujadwalkereta" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/a339cf36-9128-4f5e-bee4-28c4f9e9f4c2">

###### Berdasarkan gambar diatas, jika admin memilih pilihan pertama yaitu jadwal kereta maka program akan menampilkan list jadwal kereta yang telah terdaftar di program. Dalam jadwal kereta tersebut program akan menampilkan id kereta, nama kereta, rute, jarak, tanggal.

##### 7. Tambah
<img width="375" alt="tambahdata" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/214d22d4-2b8e-495c-a658-305c0bad0470"> 

##### 8. Pesan Berhasil ditambah
<img width="197" alt="pesanberhasiltambah" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/ad549524-27bb-4315-a184-31e8424feabe">

###### Data setelah berhasil ditambah
<img width="524" alt="berhasiltambah" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/67c13b6e-f27a-4885-98a3-40dee140fc28">

##### 9. Hapus
<img width="212" alt="pesanmasukkaniduntukhapus" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/fe48c9b1-746b-4fc4-8c9c-1157790c6119">

###### Selain itu admin juga bisa menghapus data-data tersebut sesuai dengan kebutuhan dengan memasukkan ID kereta tersebut.

###### Data setelah dihapus
<img width="525" alt="menujadwalkereta" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/78bd6595-b877-4bd3-8cac-e9743e1742c1">


##### 10. Pilih Informasi Karyawan
<img width="374" alt="menuddatakaryawan" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/33e89d1e-c1f9-4424-a70b-9e981250efa4">


##### 11. Menu Penumpang
<img width="523" alt="menupenumpang" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/1ca8874c-db72-42f3-910c-353cea3204d7">

<img width="524" alt="menujadwalkeretapenumpang" src="https://github.com/silvajenretno/PA_PBO_Kelompok_2/assets/121993396/2f357d99-15b0-4e09-8f0a-737dd2c0e26a">

