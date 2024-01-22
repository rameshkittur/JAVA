import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //code to create new file
    /*    File myFile=new File("test.txt");

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            throw new RuntimeException(e);
        }
     */
   //writing on file
     /*   try {
            FileWriter fileWriter=new FileWriter("test.txt");
            fileWriter.write("This is the file created \n you can write");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
        //reading from file
        File readFile=new File("test.txt");
        try {
            Scanner sc=new Scanner(readFile);
            while(sc.hasNextLine()){
                String disp=sc.nextLine();
                System.out.println(disp);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//deleating the file-> fileobj.delete();

    }
}
