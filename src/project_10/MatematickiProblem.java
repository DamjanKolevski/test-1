package project_10;

import java.util.Scanner;
import java.util.Random;

public class MatematickiProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(100); // Генерира прв случаен број помеѓу 0 и 99
        int num2 = random.nextInt(100); // Генерира втор случаен број помеѓу 0 и 99

        System.out.println("Соберете ги следниве два броеви:");
        System.out.print(num1 + " + " + num2 + " = ");

        int userAnswer = input.nextInt();

        int correctAnswer = num1 + num2;

        if (userAnswer == correctAnswer) {
            System.out.println("Вашиот одговор е точен! :)");
        } else {
            System.out.println("Вашиот одговор е неточен. Точниот одговор беше: " + correctAnswer);
        }
    }
}
	


