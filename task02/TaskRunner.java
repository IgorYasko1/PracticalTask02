package study.task02;

import java.util.Scanner;

public class TaskRunner {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            int gram = scanner.nextInt();
            Dinosaur.weightCalculation(gram);
        }

    }

}
