/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsprak;

/**
 *
 * @author lenovo
 */
public class Kamar {
    private String nomorKamar;
    private String ketersediaan;
    private String namaPemesan;
    private String detailPemesanan;
    private double harga;
    
    public Kamar(){
        this.ketersediaan = "Tersedia";
        this.detailPemesanan = "Belum ada pemesanan";
    }
    
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
    public void setnomorKamar(String nomorKamar){
        this.nomorKamar = nomorKamar;
    }
    
    public String getnomorKamar(){
        return nomorKamar;
    }
    
    public void setharga(double harga){
        this.harga = harga;
    }
    
    public double getharga(){
        return harga;
    }
    
    public String getketersediaan(){
        return ketersediaan;
    }
    
    public void setketersediaan (String ketersediaan){
        this.ketersediaan = ketersediaan;
    }
    
    
    public String getdetailPemesanan(){
        return detailPemesanan;
    }
    
    public void setdetailPemesanan (String detailPemesanan){
        this.detailPemesanan = detailPemesanan;
    }
    
    public void pesanKamar(){
        if (ketersediaan == "Tersedia"){
            setketersediaan ("Tidak Tersedia");
            setNamaPemesan(namaPemesan);
            setdetailPemesanan ("Kamar " + nomorKamar + " berhasil dipesan oleh: " + namaPemesan + ". Harga: " + harga);
            System.out.println ("Kamar " + nomorKamar + " berhasil dipesan oleh: " + namaPemesan + ". Harga: " + harga);
        } else {
            System.out.println ("Maaf, kamar " + nomorKamar + " sudah tidak tersedia.");
        }
    }
}
