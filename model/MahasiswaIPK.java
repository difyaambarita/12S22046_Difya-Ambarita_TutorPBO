package model;

public class MahasiswaIPK implements MahasiswaInterface {
    private double ipk;

    public MahasiswaIPK(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public Prestasi getPerformanceLevel() {
        if (ipk >= 3.5) {
            return Prestasi.EXCELLENT;
        } else if (ipk >= 3.0) {
            return Prestasi.GOOD;
        } else if (ipk >= 2.5) {
            return Prestasi.AVERAGE;
        } else {
            return Prestasi.POOR;
        }
    }
}
