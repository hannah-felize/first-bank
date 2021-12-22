// This FirstBank.java is the main class where we will be running the main method

public class FirstBank {
    public static void main(String[] args) {
        Account hannah = new Account("Hannah De Luna", "A00001");
        hannah.showMenu();

        Account bob = new Account("Bob Lob", "B00002");
        bob.showMenu();
    }
}