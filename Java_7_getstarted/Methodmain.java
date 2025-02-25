package Java_7_getstarted;

public class Methodmain {

    public static void main(String[] args) {
        if (args.length > 0) {  
            System.out.println("List of command-line arguments received:");  
            for (int i = 0; i < args.length; i++) {  
                System.out.println((i + 1) + ": " + args[i]);  
            }  
        } else {  
            System.out.println("No command-line arguments were received.");  
        }  
    }
    static {
        System.out.println("This is a static block");
    }  
}