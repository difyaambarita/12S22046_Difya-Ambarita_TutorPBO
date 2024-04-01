package model;

public class MahasiswaEkstrakurikuler implements MahasiswaInterface {
    private int activityCount;
    
    public MahasiswaEkstrakurikuler(int activityCount) {
        this.activityCount = activityCount;
    }
    
    @Override
    public Prestasi getPerformanceLevel() {
        if (activityCount >= 5) {
            return Prestasi.EXCELLENT;
        } else if (activityCount >= 3) {
            return Prestasi.GOOD;
        } else if (activityCount >= 1) {
            return Prestasi.AVERAGE;
        } else {
            return Prestasi.POOR;
        }
    }
}
