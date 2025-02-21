package Java_7_getstarted;
public class BinaryLiterals {
    public static void main(String[] args) {
        // Define a binary literal
        int binaryLiteral = 0b1010;
        // Print the binary literal
        // System.out.println(binaryLiteral); // Output: 10
        byte x1 = 0b101;    // Using b0, The b can be lower or upper case  
        byte x2 = 0B101;    // Using B0  
        System.out.println("----------Binary Literal in Byte----------------");  
        System.out.println("x1 = "+x1);  
        System.out.println("x2 = "+x2);
    
        byte b1 = 5; // a decimal value  
        // Using binary of 5  
        byte b2 = 0b101;    // using b0, The b can be lower or upper case  
        // Declaring negative binary  
        byte b3 = -0b101;  
        // Using underscore in binary literal  
        byte b4 = 0b101_0;  
        System.out.println("b1 = "+b1);  
        System.out.println("b2 = "+b2);  
        System.out.println("b3 = "+b3);  
        System.out.println("b4 = "+b4);  
        // Check whether binary and decimal are equal   
        System.out.println("is b1 and b2 equal: "+(b1==b2));  
        // Perform operation on binary value  
        System.out.println("b2 + 1 = "+(b2+1));  
        // Perform operation on negative binary value  
        System.out.println("b3 + 1 = "+(b3+1));  
        System.out.println("b4 x 2 = "+(b4*2)); 
    }
}
