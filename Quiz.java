import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Questions and Answers v1.0
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "What is 2 + 2?",
            "Who painted the Mona Lisa?",
            "What year did World War II end?",
            "What is the chemical symbol for water?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the tallest mammal?",
            "What is the largest ocean?",
            "Who invented the telephone?",
            "Who invented the WIFI?",
            "What is the meaning of ASEAN?"
        };
        
        String[] answers = {
            "Paris",
            "Jupiter",
            "4",
            "Leonardo da Vinci",
            "1945",
            "H2O",
            "William Shakespeare",
            "Giraffe",
            "Pacific",
            "Alexander Graham Bell",
            "NCR Corporation/Symbionics Corporation"
        };

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Counter for correct answers
        int score = 0;

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();

            // Check if user's answer is correct
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + answers[i]);
            }
        }

        // Display final score
        System.out.println("Quiz completed! Your score is: " + score + "/" + questions.length);

        // Close Scanner
        scanner.close();
    }
}
//Agoo MSFT Inc. V 1.0 2024
