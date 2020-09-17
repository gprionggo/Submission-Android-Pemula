package com.dicoding.gprionggo.transportasi;

import java.util.ArrayList;

public class TransportasiData {
    public static String[] transportasiNama = {
            "Bajaj",
            "Becak",
            "Bus",
            "Delman",
            "Helikopter",
            "Kapal Laut",
            "Kereta Api",
            "Mobil",
            "Motor",
            "Pesawat Terbang",
            "Sepeda",
            "Truk"
    };

    public static String[] transportasiDetail = {
            "Bajaj adalah alat transportasi beroda tiga, dengan bentuk mirip becak tapi ada tutupnya dengan bagian depan sopir dan belakang penumpang berjumlah dua. Untuk daerah Jakarta dan sekitarnya bajaj masih diizinkan untuk beroperasi namun di wilayah tertentu saja.",
            "Becak adalah alat transportasi beroda tiga dengan sopir di belakang dan penumpang di depan, jumlah penumpang maksimal dua orang, dikayuh dengan kaki. Jika becak digerakkan dengan mesin disebut dengan becak bermotor.",
            "Bus adalah alat transportasi beroda 8, bergerak dengan mesin, ukurannya besar, mampu menampung hingga 60 orang maksimal. Syarat untuk bisa mengendarai bus hampir sama dengan syarat untuk mengendarai Truk.",
            "Delman adalah alat transportasi beroda dua dengan hewan kuda yang bisa menarik kereta, jumlah penumpang di belakang maksimal 4-6 orang. Delman termasuk alat transportasi tradisional yang hanya ada di daerah tertentu seperti solo, yogyakarta, magelang, semarang dan sekitarnya. Untuk mengendarai delman, anda tidak perlu aturan khusus.",
            "Helikopter adalah alat transportasi udara yang memakai baling-baling bermesin, jumlah maksimal penumpangnya adalah 4 orang, bentuknya lebih mungil dari pesawat terbang, dan tidak bersayap. Helikopter pertama yang menerbangkan manusia adalah Helikopter Breguet-Richet, pada tahun 1907.",
            "Kapal dibuat dari bahan besi, baja dengan mesin penggerak dan bahan bakar tertentu tergantung dari jenis kapalnya. Jumlah penumpang kapal minimal 5 orang jika kapalnya kecil, akan tetapi jika kapal pesiar bisa mampu menampung ratusan hingga ribuan orang.",
            "Kereta api adalah alat transportasi yang bergerak menggunakan mesin diesel, dengan roda yang banyak dan menempel pada rel. Kereta api bergerak menggunakan bahan bakar alami, atau listrik. Daya tampung kereta api sangat banyak bisa hingga ratusan orang. Ada pula kereta api yang khusus mengangkut barang.",
            "Mobil adalah alat transportasi beroda empat yang bergerak menggunakan mesin, bahan bakar bensin, mampu menampung 4-8 orang dengan penutup agar tidak kepanasan atau kehujanan. Untuk bisa mengendarai mobil ada peraturan yang harus ditaati oleh pengemudinya, antara lain harus mampu menguasai kondisi jalanan dan teknik mengendarai, memiliki SIM A, STNK, BPKB, usia pengendara minimal 17 tahun.",
            "Motor adalah alat transportasi beroda dua yang bergerak menggunakan mesin, bahan bakar bensin, ukurannya lebih langsing, hanya bisa dinaiki 2 orang. Untuk mengendarai motor ada syarat yang harus dipenuhi antara lain pengemudi memiliki SIM C, STNK, BPKB, keahlian mengendara yang baik dan tidak ugal-ugalan.",
            "Pesawat terbang adalah sebuah benda yang mampu bergerak di udara, memiliki sayap, berbahan bakar avtur. Penemu pertama kali pesawat terbang adalah Orville Wright dan Wilbur Wright dengan percobaan sebuah alat terbang sederhana flyer, kemudian disempurnakan lagi menjadi pesawat pada tahun 1903. ",
            "Sepeda adalah alat transportasi beroda dua yang digerakkan dengan cara dikayuh kaki, tanpa mesin. Sepeda harganya cukup terjangkau dan sangat disarankan sekali untuk olahraga.",
            "Truk adalah alat transportasi beroda 8 yang digerakkan dengan mesin, di bagian depan hanya bisa muat 2 – 3 orang sedangkan bagian belakang terdapat kotak kayu besar yang berfungsi untuk menampung barang. Ada syarat yang harus anda ketahui untuk mengendarai truk antara lain bisa lulus uji kendaraan ini, memiliki SIM B, STNK, BPKB, ada izin operasi, Kartu KIR."
    };

    public static int[] transportasiFoto = {
            R.drawable.bajaj,
            R.drawable.becak,
            R.drawable.bus,
            R.drawable.delman,
            R.drawable.helikopter,
            R.drawable.kapal_laut,
            R.drawable.kereta_api,
            R.drawable.mobil,
            R.drawable.motor,
            R.drawable.pesawat_terbang,
            R.drawable.sepeda,
            R.drawable.truk
    };

    static ArrayList<Transportasi> getListData(){
        ArrayList<Transportasi> list = new ArrayList<>();
        for (int position = 0; position < transportasiNama.length; position++) {
            Transportasi transportasi = new Transportasi();
            transportasi.setNama_transportasi(transportasiNama[position]);
            transportasi.setDetail(transportasiDetail[position]);
            transportasi.setFoto_transportasi(transportasiFoto[position]);
            list.add(transportasi);
        }
        return list;
    }
}
