class Dec2Hex {
    public static String decimalToHex(int num) {
         if (num == 0) {
        return "0";
    }
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexadecimal = "";

        // Convert decimal number to hexadecimal
        while(num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }

    public static void main(String[] args) {
        // Check if an input argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a decimal number as a command-line argument.");
            return;
        }

        try {
            // Try to parse the input argument as an integer
            int num = Integer.parseInt(args[0]);
            String hex = decimalToHex(num);

            // Print the hexadecimal result or "0" if the result is empty
            System.out.println("Hexadecimal representation: " + (hex.isEmpty() ? "0" : hex));
        } catch (NumberFormatException e) {
            // Handle non-integer input gracefully by printing an error message
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
