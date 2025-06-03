import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();

            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

           
            System.out.println("Content of " + fileName + ":");

            
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}