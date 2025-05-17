Judul = Aplikasi informasi para raja di dunia

Penjelasan Projek = Aplikasi ini bertujuan untuk memberikan informasi tentang raja-raja terkenal di dunia. Pengguna dapat menjelajahi profil raja, melihat prestasi mereka, dan memahami sejarah pemerintahan mereka. Aplikasi ini cocok untuk pelajar, peneliti, atau siapa saja yang tertarik dengan sejarah dan budaya.

Figma: https://www.figma.com/design/HLvBnzVIKO4ANdnVYIVTQK/Design-Mobile-King?node-id=0-1&t=t73h6pSn5QxWAogF-1

Penjelasan Tampilan dan Code:

Drawable:

disini saya mengedit logo default denga logo crown dan menambahkan beberapa gambar raja.

![image](https://github.com/user-attachments/assets/a8a07507-85f3-43c0-babc-67c224ddf7ec)


Values:

Disini saya menggunakan beberapa file values seperti, colors, strings, dimens, styles. ic_launcer_background dan logo king background.

![image](https://github.com/user-attachments/assets/5ece5a1b-8d87-4409-a57b-487d7f93722c)



logo aplikasi:

aplikasi ini bernama apps for king dengan logo crown abu abu

![image](https://github.com/user-attachments/assets/d7212997-8415-4ec2-9add-2f688ab69d19)
![image](https://github.com/user-attachments/assets/72901f9a-3f0d-4a54-a498-e5ce5f25a76f)


Halaman Depan:

penjelasan code:

untuk halaman depan yaitu file activity_main.xml, file ini menggunakan linearlayout, textview, imageview dan button.

disini juga menggunakan fungsi @string untuk menampilan data variabel dari file string
![image](https://github.com/user-attachments/assets/a2759120-ad04-4ebf-a592-2b0c485da66e)

untuk file java yang di gunakan yaitu MainActivity.java, disini ada fungsi intent untuk pergi kehalaman daftar raja
![image](https://github.com/user-attachments/assets/f045da75-49de-4428-88c2-5cc9e1eb0d68)

penjelasan ui:

Menampilakan tiitle (Selamat Datang King), gambar logo raja dan button masuk.
fungsi button masuk ini untuk pindah halaman ke halaman list raja

![image](https://github.com/user-attachments/assets/da21e3f4-6eb5-4e0b-97f9-0668982b01c0)


Halaman List Raja:

penjelasan code:

untuk halaman depan yaitu file activity_para_raja.xml. file ini menggunakan linearlayout, textview, RecyclerView dan button.

fungsi RecyclerView adalah looping view yang di hasilkan dari fungsi di file java yang menggunkan item_raja.xml sebagai template nya.

![image](https://github.com/user-attachments/assets/ad95a2d6-7de7-4801-b923-19a91e6df811)

untuk data raja yaitu file item_raja.xml. file ini menggunakan linearlayout, textview, imageview dan button.

![image](https://github.com/user-attachments/assets/6e219c3c-49bb-402b-ae3c-d724964d0846)


untuk file java yang di gunakan yaitu DaftarRajaActivity.java, disini ada fungsi intent untuk pergi kehalaman sebelumnya, dan data array object para raja yang akan di gunakan di file RajaAdapter.java dan Raja.java. untuk di looping dan di tampilkan di bagian xml nya. gambar yang dipakai itu dari drawable

![image](https://github.com/user-attachments/assets/d1f37fe7-7081-4fd4-a9d7-263008c6fcab)

![image](https://github.com/user-attachments/assets/03ab6eeb-8cd6-4d1b-86f2-b5d4fb7343b0)

![image](https://github.com/user-attachments/assets/bef99b24-714d-45a1-9566-ffaebc93df9a)


penjelasan ui:

Menampilakan tiitle (Daftar Raja), 
Description Halaman (Menampilkan Profil Raja - raja yang pernah ada di dunia),  
List raja dengan isi foto / gambar, nama dan button lihat profil
dan button kembali.

fungsi button lihat profil yaitu untuk pergi kehalaman detail informasi per raja.
fungsi button kembali untuk kehalaman sebelumnya.

![image](https://github.com/user-attachments/assets/4d663ad9-2e44-4cbf-b4b1-de91f96f4a7e)

Halaman Detail Raja:

penjelasan code:

untuk halaman depan yaitu file activity_detail_raja.xml, file ini menggunakan linearlayout, textview, imageview dan button.

dan akan secara dinamis berubah data view nya berdasarkan raja yang dipilih. data nya itu dapet dari file DetailRajaActivity

![image](https://github.com/user-attachments/assets/446dbe98-a3c7-4fe4-8d44-578a761051fc)

untuk file java yang dipakai yaitu ,diisini ada fungsi intent untuk pergi kehalaman sebelumnya, dan fungsi setDetail raja yang dimana akan disesuaikan berdasarkan nama raja untuk datanya. gambar yang dipakai itu dari drawable

![image](https://github.com/user-attachments/assets/f281e85e-4154-45c7-bc49-4ed0049c2f13)


penjelasan ui:

Menampilkan foto / gambar raja,
nama raja dan julukan,
informasi tentang peristiwa penting raja,
informasi tentang warisan raja
dan button kembali

fungsi button kembali untuk kehalaman sebelumnya.

![image](https://github.com/user-attachments/assets/e6b6aee7-e2de-4d3b-af03-0ccdbf4c3bc5)





