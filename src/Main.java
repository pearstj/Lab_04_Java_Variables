//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ArithmeticAndVariables {
    public static void main(String[] args) {

        // Operations with int
        int intOperandA = 12;
        int intOperandB = 5;

        int intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        int intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        int intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        int intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        int intRemainder = intOperandA % intOperandB;
        System.out.println("The remainder using ints of " + intOperandA + " % " + intOperandB + " is " + intRemainder);

        System.out.println(); // spacer for readability

        // Operations with double
        double doubleOperandA = 12.0;
        double doubleOperandB = 5.0;

        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        double doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        double doubleRemainder = doubleOperandA % doubleOperandB;
        System.out.println("The remainder using doubles of " + doubleOperandA + " % " + doubleOperandB + " is " + doubleRemainder);

        System.out.println(); // spacer for readability

        // Variable Declarations and Initializations
        int numberOfKidsInFamily = 3;
        boolean isItRaining = false;
        double gasPricePerGallon = 3.89;
        int favoriteNumber = 7;
        double myShoeSize = 9.5;
        String myBirthMonth = "September";
        String myFullName = "Jane Doe";

        // Optional print statements for declared variables
        System.out.println("Number of kids in my family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isItRaining);
        System.out.println("Price of a gallon of gas: $" + gasPricePerGallon);
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("My shoe size is: " + myShoeSize);
        System.out.println("I was born in: " + myBirthMonth);
        System.out.println("My full name is: " + myFullName);
    }
}
