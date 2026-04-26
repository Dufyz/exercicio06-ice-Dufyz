import com.zeroc.Ice.*;

public class Client {
    public static void main(String[] args) {
        // 1. Initialize the Ice communicator within a try-with-resources block
        try (Communicator communicator = Util.initialize(args)) {

            // 2. Create a proxy to the remote 'Printer' object
            // Replace with the actual IP of your ICE server
            ObjectPrx printerBase = communicator.stringToProxy("SimplePrinter:default -h 127.0.0.1 -p 11000");

            // 3. Downcast the proxy to the Printer interface
            Demo.PrinterPrx printer = Demo.PrinterPrx.uncheckedCast(printerBase);

            // 4. Call the Printer remote methods
            System.out.println("=== Testing Printer Interface ===");
            
            String testString = "Hello from Java Client!";
            System.out.println("Test string: " + testString);
            
            System.out.println("\n1. Calling printString:");
            printer.printString(testString);
            
            System.out.println("\n2. Calling printReverse:");
            printer.printReverse(testString);
            
            System.out.println("\n3. Calling printUpper:");
            printer.printUpper(testString);
            
            System.out.println("\n4. Calling getStringLength:");
            int length = printer.getStringLength(testString);
            System.out.println("String length: " + length);

            // 5. Create a proxy to the remote 'Calculator' object
            System.out.println("\n=== Testing Calculator Interface ===");
            ObjectPrx calculatorBase = communicator.stringToProxy("SimpleCalculator:default -h 127.0.0.1 -p 11000");
            
            // 6. Downcast the proxy to the Calculator interface
            Demo.CalculatorPrx calculator = Demo.CalculatorPrx.uncheckedCast(calculatorBase);
            
            // 7. Call the Calculator remote methods
            int a = 10, b = 5;
            System.out.println("Testing with a=" + a + ", b=" + b);
            
            System.out.println("\n1. Add: " + calculator.add(a, b));
            System.out.println("2. Subtract: " + calculator.subtract(a, b));
            System.out.println("3. Multiply: " + calculator.multiply(a, b));
            System.out.println("4. Divide: " + calculator.divide(a, b));
            
            // Test division by zero
            System.out.println("\n5. Division by zero: " + calculator.divide(10, 0));

        } catch (LocalException e) {
            e.printStackTrace();
        }
    }
}
