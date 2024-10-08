/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsprak;

/**
 *
 * @author lenovo
 */
class KamarVIP extends Kamar {
    public KamarVIP (String nomorKamar){
        setnomorKamar (nomorKamar);
        setharga (5000000);
    }
    
    public void pesanKamar(){
        if (getketersediaan() == "Tersedia"){
            setketersediaan ("Tidak Tersedia");
            setdetailPemesanan (getnomorKamar() + " berhasil dipesan! Harga: " + getharga());
            System.out.println (getnomorKamar() + " berhasil dipesan! Harga: " + getharga());
        } else {
            System.out.println ("Maaf, kamar " + getnomorKamar() + " sudah tidak tersedia.");
        }
    }
}
