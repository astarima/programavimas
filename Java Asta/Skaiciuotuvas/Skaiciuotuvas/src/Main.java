import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {


            String operator = readText(scanner, "Enter an operation (or 'quit' to exit):");
            if(operator.equals("quit")) break;

            int a = readNumber(scanner, "Enter a first number");
            int b = readNumber(scanner, "Enter a second number:");

        Integer result = null;
        Boolean comparison = null;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            case "%" -> result = a % b;

            case ">" -> comparison = a > b;
            case ">=" -> comparison = a >= b;
            case "<" -> comparison = a < b;
            case "<=" -> comparison = a <= b;
            case "!=" -> comparison = a != b;
            default -> {
                System.err.print("Operator does not exist:" + operator);
                return;
            }
        }

        if (comparison != null) {
            System.out.println("Result:");
            System.out.println(comparison);
            return;
        }

        System.out.println("Result:");
        System.out.println();



        System.out.println("Result: " );
        System.out.println(result);
    }

    }

    private static int readNumber(Scanner s, String prompt){
        System.out.println(prompt);
        return s.nextInt();

    }

    private static String readText(Scanner s, String prompt) {
        System.out.println(prompt);
        return s.next();
    }

}