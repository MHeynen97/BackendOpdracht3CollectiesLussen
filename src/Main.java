import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};

        String[] alphabet = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul" };

        boolean play = true;

        String ongeldig = "Ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        Translator translator = new Translator(alphabet, numbers);


        while (play){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            }
            else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10 && number >= 0) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
                else {
                    System.out.println(ongeldig);
                }
            }
            else {
                System.out.println(ongeldig);
            }

        }
    }
}
