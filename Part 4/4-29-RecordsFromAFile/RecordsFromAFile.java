
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try(Scanner scanner2 = new Scanner(Paths.get(file))){
            while(scanner2.hasNextLine()){
                String row = scanner2.nextLine();
                if(row.isEmpty()){
                    continue;
                }
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + String.valueOf(age) + " years");
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
