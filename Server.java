import com.zeroc.Ice.*;

// Implementation of the Printer interface
class PrinterI implements Demo.Printer {
    @Override
    public void printString(String s, Current current) {
        System.out.println(s);
    }

    @Override
    public void printReverse(String s, Current current) {
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }

    @Override
    public void printUpper(String s, Current current) {
        System.out.println(s.toUpperCase());
    }

    @Override
    public int getStringLength(String s, Current current) {
        return s.length();
    }
}

// Implementation of the Calculator interface
class CalculatorI implements Demo.Calculator {
    @Override
    public int add(int a, int b, Current current) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b, Current current) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b, Current current) {
        return a * b;
    }

    @Override
    public double divide(int a, int b, Current current) {
        if (b == 0) {
            return 0.0;
        }
        return (double) a / (double) b;
    }
}

public class Server {
    public static void main(String[] args) {
        try (Communicator communicator = Util.initialize(args)) {
            
            // Create an object adapter with endpoints
            ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints(
                "SimpleAdapter", "default -p 11000");

            // Create servant instances
            Demo.Printer printerServant = new PrinterI();
            Demo.Calculator calculatorServant = new CalculatorI();

            // Add servants to the adapter with identities
            adapter.add(printerServant, Util.stringToIdentity("SimplePrinter"));
            adapter.add(calculatorServant, Util.stringToIdentity("SimpleCalculator"));

            // Activate the adapter
            adapter.activate();

            System.out.println("Server is ready and listening on port 11000...");
            System.out.println("Available objects:");
            System.out.println("  - SimplePrinter (Printer interface)");
            System.out.println("  - SimpleCalculator (Calculator interface)");

            // Wait until shutdown
            communicator.waitForShutdown();
        }
    }
}
