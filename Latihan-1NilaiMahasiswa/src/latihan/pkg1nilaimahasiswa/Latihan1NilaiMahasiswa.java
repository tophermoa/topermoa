/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1nilaimahasiswa;

/**
 *
 * @author USER
 */
class Mahasiswa {

    private String nama;
    private String nim;
    private double quis;
    private double uts;
    private double uas;
    private double na;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getQuis() {
        return quis;
    }

    public void setQuis(double quis) {
        this.quis = quis;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNa() {
        return na;
    }

    public void setNa(double na) {
        this.na = na;
    }

    public char getIndex() 
    {
        double Na = getNa();
        char indeks = 'A';
        if (na<=100 && na >= 80)indeks = 'A';
        if (na<=79 && na >= 68)indeks = 'B';
        if (na<=67 && na >= 56)indeks = 'C';
        if (na<=55 && na >= 45)indeks = 'D';
        if (na<=44) indeks = 'E';
        return indeks;
    }
    
    public String getKeterangan()
    {
        char indeks = getIndex();
        switch (indeks)
        {
            case 'A':
                return "Sangat Baik";
                case 'B':
                return "Sangat Baik";
                case 'C':
                return "Sangat Baik";
                case 'D':
                return "Sangat Baik";
                case 'E':
                return "Sangat Baik";
                default:
                    return " Indeks salah";
        }
        }
    }


public class Latihan1NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Christover Ramanda Moa");
        mhs.setNim("10116531");
        mhs.setQuis((int) (75 * 0.2));
        mhs.setUts((int) (45 * 0.3));
        mhs.setUas((int) (34 * 0.5));
        mhs.setNa((int) (75 * 0.2) + (int) (45 * 0.3) + (int) (34 * 0.5));

        char index = 0;

        
//output
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + mhs.getNama());
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + mhs.getNim());
        }

        System.out.println("Quis  \t\t=" + mhs.getQuis());
        System.out.println("Uts \t\t=" + mhs.getUts());
        System.out.println("Uas \t\t=" + mhs.getUas());
        System.out.println("\nNilai Akhir \t\t=" + mhs.getNa());
        System.out.println("\nNilai Indeks = " + mhs.getIndex());
        System.out.println("\nKeterangan = "+ mhs.getKeterangan());
    }

}
