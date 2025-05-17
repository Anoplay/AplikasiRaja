package com.example.aplikasiraja;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailRajaActivity extends AppCompatActivity {

    private ImageView imageViewDetailRaja;
    private TextView textViewNamaDetailRaja;
    private TextView textViewReignDetailRaja;
    private TextView textViewNicknameDetailRaja;
    private TextView textViewKeyEventsDetailRaja;
    private TextView textViewKeyEventsContentDetailRaja;
    private TextView textViewLegacyDetailRaja;
    private TextView textViewLegacyContentDetailRaja;
    private Button buttonKembaliDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_raja);

        imageViewDetailRaja = findViewById(R.id.imageViewDetailRaja);
        textViewNamaDetailRaja = findViewById(R.id.textViewNamaDetailRaja);
        textViewReignDetailRaja = findViewById(R.id.textViewReignDetailRaja);
        textViewNicknameDetailRaja = findViewById(R.id.textViewNicknameDetailRaja);
        textViewKeyEventsDetailRaja = findViewById(R.id.textViewKeyEventsDetailRaja);
        textViewKeyEventsContentDetailRaja = findViewById(R.id.textViewKeyEventsContentDetailRaja);
        textViewLegacyDetailRaja = findViewById(R.id.textViewLegacyDetailRaja);
        textViewLegacyContentDetailRaja = findViewById(R.id.textViewLegacyContentDetailRaja);
        buttonKembaliDetail = findViewById(R.id.buttonKembaliDetail);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namaRaja = extras.getString("nama");
            int fotoResId = extras.getInt("fotoResId");

            textViewNamaDetailRaja.setText(namaRaja);
            imageViewDetailRaja.setImageResource(fotoResId);
            setDetailRaja(namaRaja);
        }

        buttonKembaliDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setDetailRaja(String namaRaja) {
        if(namaRaja.equals("King Baldwin")){
            textViewReignDetailRaja.setText("Masa Pemerintahan: 1174-1185 (dinobatkan pada usia 13 tahun)");
            textViewNicknameDetailRaja.setText("Julukan: \"Raja Lepra\" karena perjuangannya seumur hidup dengan penyakit lepra, yang diderita sejak kecil.");
            textViewKeyEventsContentDetailRaja.setText("•\tMemimpin Kerajaan Yerusalem selama Perang Salib.\n" +
                    "•\tMemenangkan Pertempuran Montgisard (1177) pada usia 16 tahun, mengalahkan pasukan Saladin yang lebih besar.\n" +
                    "•\tMenganjurkan diplomasi dengan para pemimpin Muslim untuk menjaga perdamaian yang rapuh.\n" +
                    "•\tPenyakitnya secara bertahap melemahkan dirinya, mengharuskannya untuk memerintah melalui bupati.");
            textViewLegacyContentDetailRaja.setText("Dikenang karena ketahanan dan kepemimpinannya meskipun memiliki keterbatasan fisik. Kematiannya pada tahun 1185 membuat Yerusalem rentan, yang menyebabkan kejatuhannya ke tangan Saladin pada tahun 1187.");
        } else if (namaRaja.equals("Salahuddin Ayyubi")) {
            textViewReignDetailRaja.setText("Masa Pemerintahan: 1174-1193");
            textViewNicknameDetailRaja.setText("Julukan: Al-Malik An-Nasir");
            textViewKeyEventsContentDetailRaja.setText("•\tMenyatukan dinasti Ayyubiyah, memperluas wilayahnya di Mesir, Suriah, dan Mesopotamia.\n" +
                    "•\tMemimpin pasukan Muslim selama Perang Salib, merebut Yerusalem pada tahun 1187 setelah Pertempuran Hattin.\n" +
                    "•\tBerperang melawan Richard the Lionheart dalam Perang Salib Ketiga, yang akhirnya menandatangani gencatan senjata.\n" +
                    "•\tDikenal karena kesopanan dan perilaku terhormatnya bahkan terhadap musuh-musuhnya.");
            textViewLegacyContentDetailRaja.setText("Tokoh yang dihormati dalam sejarah Islam, dirayakan karena kepemimpinan militernya, kesalehannya, dan pemerintahannya yang adil. Warisannya terus memengaruhi politik dan budaya Timur Tengah.");
        } else if (namaRaja.equals("Napoleon Bonaparte")) {
            textViewReignDetailRaja.setText("Masa Pemerintahan: 1799-1814, 1815 (Seratus Hari)");
            textViewNicknameDetailRaja.setText("Julukan: Kopral Kecil, Boney");
            textViewKeyEventsContentDetailRaja.setText("•\tNaik ke tampuk kekuasaan selama Revolusi Prancis, menjadi Konsul Pertama pada tahun 1799 dan Kaisar pada tahun 1804.\n" +
                    "•\tMemimpin Prancis dalam serangkaian Perang Napoleon, menaklukkan sebagian besar Eropa.\n" +
                    "•\tMemperkenalkan reformasi hukum dan administrasi yang signifikan, termasuk Kode Napoleon.\n" +
                    "•\tDikalahkan dalam Pertempuran Waterloo pada tahun 1815 dan diasingkan ke Saint Helena.");
            textViewLegacyContentDetailRaja.setText("Tokoh yang kompleks, dikagumi karena kejeniusan militer dan reformasinya, tetapi juga dikritik karena pemerintahan otoriternya dan perang penaklukannya. Dampaknya pada sejarah dan hukum Eropa tidak dapat disangkal.");
        } else if (namaRaja.equals("Qin Shi Huang")) {
            textViewReignDetailRaja.setText("Masa Pemerintahan: 246-210 SM");
            textViewNicknameDetailRaja.setText("Julukan: Kaisar Pertama China");
            textViewKeyEventsContentDetailRaja.setText("•\tKaisar pertama dari China yang bersatu, mengakhiri periode Negara-Negara Berperang.\n" +
                    "•\tMembakukan tulisan, mata uang, berat, dan ukuran.\n" +
                    "•\tMemulai pembangunan Tembok Besar China.\n" +
                    "•\tDikenal karena pemerintahan otoriternya dan Tentara Terracotta.");
            textViewLegacyContentDetailRaja.setText("Tokoh kontroversial, dipuji karena menyatukan China tetapi juga dikritik karena metode kerasnya. Warisannya membentuk jalannya sejarah China.");
        } else if (namaRaja.equals("King Solomon")) {
            textViewReignDetailRaja.setText("Masa Pemerintahan: c. 970-931 SM");
            textViewNicknameDetailRaja.setText("Julukan: Yang Bijaksana");
            textViewKeyEventsContentDetailRaja.setText("•\tMembangun Kuil Pertama di Yerusalem.\n" +
                    "•\tMemperluas Kerajaan Israel melalui diplomasi dan perdagangan.\n" +
                    "•\tDikenal karena kebijaksanaan, kekayaan, dan banyak istrinya.\n" +
                    "•\tMenulis Kitab Amsal, Kidung Agung, dan sebagian dari Kitab Pengkhotbah (menurut tradisi).");
            textViewLegacyContentDetailRaja.setText("Raja yang legendaris, dihormati dalam Yudaisme, Kristen, dan Islam. Dianggap sebagai simbol kebijaksanaan dan keadilan.");
        } else if (namaRaja.equals("Gajah Mada")) {
            textViewReignDetailRaja.setText("Masa Jabatan: 1331-1364");
            textViewNicknameDetailRaja.setText("Julukan: Mahapatih");
            textViewKeyEventsContentDetailRaja.setText("•\tMahapatih Majapahit yang terkenal.\n" +
                    "•\tMencetuskan Sumpah Palapa untuk menyatukan Nusantara.\n" +
                    "•\tMemimpin penaklukan yang luas, memperluas pengaruh Majapahit ke sebagian besar Asia Tenggara Maritim.\n" +
                    "•\tDianggap sebagai salah satu tokoh paling penting dalam sejarah Indonesia.");
            textViewLegacyContentDetailRaja.setText("Pahlawan nasional Indonesia, dihormati karena kesetiaan, kepemimpinan, dan perannya dalam mencapai Zaman Keemasan Majapahit.");
        }
        else {
            textViewReignDetailRaja.setText("Masa Pemerintahan: ");
            textViewNicknameDetailRaja.setText("Julukan: ");
            textViewKeyEventsContentDetailRaja.setText("•\t \n" +
                    "•\t \n" +
                    "•\t \n" +
                    "•\t ");
            textViewLegacyContentDetailRaja.setText("");
        }
    }
}
