public class UC6 {
    
}
public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Defensive programming: check length before using substring
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Print the final structured greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}