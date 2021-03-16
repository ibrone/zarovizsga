package hu.nive.ujratervezes.zarovizsga.workhours;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class WorkHours {

    String minWork(String file) {
        RandomAccessFile raf;
        String sor;
        List<String> Workhours = new ArrayList<String>();
        try {
            raf = new RandomAccessFile("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt", "rw");

            int db = 0;
            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
                db++;
            }

            raf.seek(0);

            db = 0;
            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {

                db++;
            }

            raf.close();
        } catch (IOException e) {


        }

    }
}
