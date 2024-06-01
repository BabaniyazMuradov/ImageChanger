package Theme1;
import java.util.Scanner;

interface Operation{
    void calculate(int a, int b);
}

public class Homework {
    public static void main(String[] args) {

        Operation plus = (Operation) (a, b) -> System.out.println("=" + (a + b));
        Operation minus = (Operation) (a, b) -> System.out.println("=" + (a - b));
        Operation multiply = (Operation) (a, b) -> System.out.println("=" + (a * b));
        Operation divide = (Operation) (a, b) -> System.out.println("=" + (a / b));
while(true){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение");
        String line = scn.nextLine();
        String[] numbers = line.split("[+\\-*/]");
        int[] numbersInt = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersInt[i] = Integer.parseInt(numbers[i]);
        }
            if (line.contains("+")) {
                plus.calculate(numbersInt[0], numbersInt[1]);
            } else if (line.contains("-")) {
                minus.calculate(numbersInt[0], numbersInt[1]);
            } else if (line.contains("*")) {
                multiply.calculate(numbersInt[0], numbersInt[1]);
            } else if (line.contains("/")) {
                divide.calculate(numbersInt[0], numbersInt[1]);
            } else {
                System.err.println("Неверное выражение !");
            }
        }
    }
}