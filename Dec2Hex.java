import java.util.logging.Logger;
// Anna Grygas Dec2Hex Project
class Dec2Hex {

    // Initialize the logger
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    // Method to convert a decimal number to hexadecimal representation

    public static String decimalToHex(int num) {
         if (num == 0) {
        return "0";
    }
      // Array representing hexadecimal characters
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder(); //Using StringBuilder for efficiency

        // Convert decimal number to hexadecimal
        while(num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        return hexadecimal.toString();
    }

    public static void main(String[] args) {

        // Check if an input argument is provided
        if (args.length == 0) {
            logger.warning("Please provide a decimal number as a command-line argument.");
            return;
        }

        try {
            // Try to parse the input argument as an integer
            int num = Integer.parseInt(args[0]);
            String hex = decimalToHex(num);

            // Conditionally log the hexadecimal result or "0" if the result is empty
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("Hexadecimal representation: %s", hex.isEmpty() ? "0" : hex));
        }

        } catch (NumberFormatException e) {

            // Handle non-integer input gracefully by printing an error message
            logger.severe("Invalid input. Please enter a valid integer.");
        }
    }
}
