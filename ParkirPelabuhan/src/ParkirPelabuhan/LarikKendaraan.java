/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParkirPelabuhan;

/**
 *
 * @author newte
 */
public class LarikKendaraan {
    private int n;
    private Kendaraan[] larikKendaraan;

    public LarikKendaraan (){};

    public LarikKendaraan (int maxKendaraan){
        this.larikKendaraan = new Kendaraan[maxKendaraan];
        this.n = 0;
    }

    public Kendaraan[] getKendaraan() {
        return this.larikKendaraan;
    }

    public void setKendaraan(Kendaraan[] larikKendaraan) {
        this.larikKendaraan = larikKendaraan;
    }

    public int getIndex() {
        return this.n;
    }

    public void setIndex(int n) {
        this.n = n;
    }


    public void tambahKendaraan(Kendaraan kendaraan){
        this.larikKendaraan[this.n] = kendaraan;
        this.n++;
    }

    public void output(){
        System.out.println("\n\t\t\tDaftar Kendaraan Parkir");
        // Hapus kolom TglPulang, JamPulang, Biaya
        System.out.println("=".repeat(130)); // Kurangi panjang garis
        System.out.printf("%-3s %-8s %-10s %-10s %-12s %-10s %-8s %-12s %-15s %-15s%n",
                "No","NoKend","JenisKend","Status","TglDatang", 
                "JamDatang","LamaHr","LamaJam", "Nama Pemilik", "Alamat Pemilik");
        System.out.println("-".repeat(130)); // Kurangi panjang garis

        // Biaya total tetap dihitung, tetapi tidak ditampilkan per baris
        int totalBiaya = 0;
        for (int i = 0; i < n; i++){
            Kendaraan k = this.larikKendaraan[i];
            Time lamaJam = k.lamaJam();
            int biaya = k.hitungBiaya(); // Hitung biaya
            totalBiaya += biaya;

            // Hapus k.getWaktuPulang().getDate().toString(), k.getWaktuPulang().getTime().toString(), String.format("%,d", biaya)
            System.out.printf("%-3d %-8s %-10s %-10s %-12s %-10s %-8d %-12s %-15s %-15s%n",
                    (i+1),
                    k.getNoKendaraan(),
                    k.getClass().getSimpleName(),
                    k.getStatusString(),
                    k.getWaktuDatang().getDate().toString(),
                    k.getWaktuDatang().getTime().toString(),
                    k.lamaHari(), k.getLamaJamString(lamaJam),
                    k.getPemilik().getNama(), k.getPemilik().getAlamat()
            );
        }

        System.out.println("-".repeat(130));
        // Tetap tampilkan total biaya
        System.out.printf("Total Biaya Parkir : %,d%n", totalBiaya);
    }
}