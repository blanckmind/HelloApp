public class UC2 {
    
}
public class Main {

    public static void main(String[] args) {

        // Check if user provided name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } 
        else {
            System.out.println("Hello User");
        }
    }
}