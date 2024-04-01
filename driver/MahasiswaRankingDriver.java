package driver;

import model.Mahasiswa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MahasiswaRankingDriver {
    public static void main(String[] args) {
        List<Mahasiswa> students = new ArrayList<>();
        students.add(new Mahasiswa("W", 3.8));
        students.add(new Mahasiswa("X", 3.6));
        students.add(new Mahasiswa("Y", 3.9));
        students.add(new Mahasiswa("D", 3.5));
        students.add(new Mahasiswa("A", 3.7));

        // Sorting students based on their GPA in descending order
        Collections.sort(students, Comparator.comparing(Mahasiswa::getIpk).reversed());

        // Displaying top 3 students
        System.out.println("Top 3 Students based on GPA:");
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            System.out.println("Rank " + (i + 1) + ": " + students.get(i));
        }
    }
}
