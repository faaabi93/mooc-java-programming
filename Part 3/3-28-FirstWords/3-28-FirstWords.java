
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }
            String[] splits = input.split(" ");
            System.out.println(splits[0]);
        }
        scanner.close();
    }
}
