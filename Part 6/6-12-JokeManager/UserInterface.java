import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Commands"); 
            System.out.println("1 - add a joke"); 
            System.out.println("2 - draw a joke"); 
            System.out.println("3 - list jokes"); 
            System.out.println("X - stop"); 
            String input = this.scanner.nextLine();

            if(input.equals("X")) {
                break;
            }else if(input.equals("1")) {
                this.add();
            }else if(input.equals("2")) {
                this.draw();
            }else if(input.equals("3")) {
                this.list();
            }else{
                System.out.println("Invalid command");
            }
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String input = this.scanner.nextLine();
        this.jokeManager.addJoke(input);
    }

    public void draw() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void list() {
        this.jokeManager.printJokes();
    }
}
