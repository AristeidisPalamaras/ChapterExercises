package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LocationsApp {
    public static void main(String[] args) {

        File inputFile = new File("src/gr/aueb/cf/ch9/locations.txt");
        File outputFile = new File("src/gr/aueb/cf/ch9/formatedLocations.txt");

        String[] line;

        try
            (Scanner in = new Scanner(inputFile);
             PrintStream ps = new PrintStream(new FileOutputStream(outputFile, true)))
        {
            in.nextLine();
            while (in.hasNextLine()) {
                line = in.nextLine().split(",");
                ps.printf("{ location: '%s', latitude: %s, longitude: %s }\n",
                        line[0], line[1], line[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
