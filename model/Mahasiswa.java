package model;

// Class representing a student
public class Mahasiswa {
    private String name;
    private double ipk;

    public Mahasiswa(String name, double ipk) {
        this.name = name;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", IPK: " + ipk;
    }
}
