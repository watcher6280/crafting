/**
 * Created by Tesseract on 6/07/2017.
 * Code taken from https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 * Modified for
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "C:/Users/Tesseract/IdeaProjects/zeldaCrafting/src//materialList.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(csvSplitBy);

                System.out.println("Country [code= " + country[0] + " , name=" + country[4] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}