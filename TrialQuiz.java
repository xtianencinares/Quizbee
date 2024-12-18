import java.util.Scanner;

public class QuizBee { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String[][] questions = {
                {"What is the capital of France?", "Paris"},
                {"What is the tallest mountain in the world?", "Mount Everest"},
                {"What is the largest planet in our solar system?", "Jupiter"}
                {"What is the capital of Japan?", "Tokyo"},
                {"What is the capital of Philippines?", "Manila"},
                {"What is the capital of Indonesia?", "Jakarta"},
                {"What is the capital of India?", "New Deli"},
                {"What is the capital of Mexico?", "Mexico City"},
                {"What is the capital of South Korea?", "Soul"},
                {"What is the capital of North Korea?", "PyongYang"},
                {"What is the capital of Russia?", "Moscow"},
                {"What is the capital of Germany  ?", "Berlin"},
                {"What is the capital of Thailand  ?", "Bangkok"},
        };

        int score = 0;

        // Loop through each question
        for (String[] question : questions) {
            System.out.println(question[0]);
            String answer = scanner.nextLine();

            // Check if answer is correct
            if (answer.equalsIgnoreCase(question[1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer is: " + question[1]);
            }
        }
      
        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
}
// Agoo Use only Inc. 2024 V1.0
