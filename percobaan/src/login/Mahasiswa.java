package login;

import java.io.Serializable;
import java.util.ArrayList;

public class Mahasiswa implements Serializable{
    private String nim, nama, jenisKelamin;
    private int umur;
    private String alamat, provinsi;
    private ArrayList<String> hobi;
    
    /* Return NIM */
    public String getNim() {
        return nim;
    }
    
    /* Return Nama */
    public String getNama() {
        return nama;
    }

    /* Return Jenis Kelamin */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /* Return umur */
    public int getUmur() {
        return umur;
    }

    /* Return Alamat */
    public String getAlamat() {
        return alamat;
    }

    /* Return Provinsi */
    public String getProvinsi() {
        return provinsi;
    }

    /* Return Hobi */
    public ArrayList<String> getHobi() {
        return hobi;
    }
    
    /* Set NIM */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /* Set Nama */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Set Jenis Kelamin */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /* Set Umur */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /* Set Alamat */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /* Set Provinsi */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /* Set Hobi */
    public void setHobi(ArrayList<String> hobi) {
        this.hobi = hobi;
    }

   

    
}
