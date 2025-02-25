package Java_7_getstarted;

// public class DemoNoMain {
//     static {
//         System.out.println("This is a static block");
//     }
    
// }

// program to demonstrate the use of static block in abstract class and this program will run without main method 
abstract class DemoNoMain extends javafx.application.Application  //javafx not set in path
{  
    static      //static block  
    {  
        System.out.println("Java");  
        System.exit(0);  
    }  
}
