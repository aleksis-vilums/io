import java.util.Scanner;
import java.io.*;

public class io {
    public static void main(String[] args){ 
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;

        try {
            file = new File("data.csv");
            scan = new Scanner(file);

            while (scan.hasNextLine()){
                String letter = scan.nextLine();
                System.out.println("The next line: " + letter);
            }
        } catch (FileNotFoundException e){
            System.out.println("Error: The file does not exist");
        } finally {
            System.out.println("Done");
        }

        //exception -> IoException

        //throws -> some other code handles it, not my problem
        //try/catch -> we manage it ourselves
    }
}