/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkirPelabuhan;

/**
 *
 * @author newte
 */
import static java.lang.System.exit;
import java.util.Scanner;

public abstract class Kendaraan {
    private Waktu waktuDatang;
    private Waktu waktuPulang;
    private Person pemilik;
    private String noKendaraan;
    private int status;


    public Kendaraan(String noKendaraan) {
        this.pemilik = new Person();
        this.noKendaraan = noKendaraan;
    }

    public Kendaraan() {
        this.waktuDatang = new Waktu();
        this.waktuPulang = new Waktu();
        this.pemilik = new Person();
    }

    public Waktu getWaktuDatang() {
        return this.waktuDatang;
    }

    public void setWaktuDatang(Waktu waktuDatang) {
        this.waktuDatang = waktuDatang;
    }

    public Waktu getWaktuPulang() {
        return this.waktuPulang;
    }

    public void setWaktuPulang(Waktu waktuPulang) {
        this.waktuPulang = waktuPulang;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        if (status == 0 || status == 1) {
            this.status = status;
        } else {
            System.out.println("Status tidak valid.");
            exit(-1);
        }
    }

    public String getNoKendaraan() {
        return this.noKendaraan;
    }

    public Person getPemilik() {
        return this.pemilik;
    }

    public void setPemilik(Person pemilik) {
        this.pemilik = pemilik;
    }

    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }

    public String getStatusString(){ return (this.status==0)?"Reguler":"Menginap"; }

    public int lamaHari(){
        int selisihHari = waktuPulang.getDate().toHari() - waktuDatang.getDate().toHari();
        if (selisihHari < 0){
            selisihHari = 0;
        }
        return selisihHari;
    }

    public Time lamaJam(){
        int detikDatang = waktuDatang.getTime().toDetik();
        int detikPulang = waktuPulang.getTime().toDetik();
        int selisih = detikPulang - detikDatang;
        if (selisih < 0){
            selisih += 24*3600;
        }

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        return new Time(jam, menit, detik);
    }

    public String getLamaJamString(Time waktu){
        return String.format("%02d:%02d:%02d", waktu.getJam(), waktu.getMenit(), waktu.getDetik());
    }

    public int hitungBiaya(){
        return 0;
    }

    public void inputKendaraan(Scanner input){
        pemilik.inputPerson();

        System.out.print("Masukkan nomor kendaraan: ");
        setNoKendaraan(input.nextLine());

        System.out.print("Masukkan status parkir (0 = Reguler, 1 = Menginap): ");
        setStatus(Integer.parseInt(input.nextLine()));

        System.out.print("Gunakan waktu otomatis dari sistem? (y/n): ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("y")){
            getWaktuDatang().getDate().setNow();
            getWaktuDatang().getTime().setNow();
            System.out.print("Tekan 'Enter' untuk pulang dari parkir: ");
            String enter = input.nextLine();
            getWaktuPulang().getDate().setNow();
            getWaktuPulang().getTime().setNow();
        } else {
            System.out.println("=== Waktu datang ===");
            getWaktuDatang().getDate().inputDate(input);
            getWaktuDatang().getTime().inputTime(input);
            System.out.println("=== Waktu pulang ===");
            getWaktuPulang().getDate().inputDate(input);
            getWaktuPulang().getTime().inputTime(input);
        }
    }
}
