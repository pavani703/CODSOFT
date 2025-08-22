package Codsoft;
import java.util.Scanner;
public class Quiz {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] questions = {
                    "Q1️⃣: What is the capital of India?",
                    "Q2️⃣: Who invented Java?",
                    "Q3️⃣: Which keyword is used to inherit a class in Java?",
                    "Q4️⃣: Which data type is used to store true/false values?"
            };

            String[] options = {
                    "1️⃣ Delhi  2️⃣ Mumbai  3️⃣ Kolkata  4️⃣ Chennai",
                    "1️⃣ James Gosling  2️⃣ Dennis Ritchie  3️⃣ Guido van Rossum  4️⃣ Bjarne Stroustrup",
                    "1️⃣ super  2️⃣ this  3️⃣ extends  4️⃣ implements",
                    "1️⃣ int  2️⃣ String  3️⃣ boolean  4️⃣ float"
            };

            int[] answers = {1, 1, 3, 3}; // correct options
            boolean playAgain = true;

            System.out.println("🎓 Welcome to the Quiz Application! 📝");

            while (playAgain) {
                int score = 0;

                System.out.println("\n📋 Menu:");
                System.out.println("1️⃣ Start Quiz");
                System.out.println("0️⃣ Exit");
                System.out.print("👉 Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    for (int i = 0; i < questions.length; i++) {
                        System.out.println("\n" + questions[i]);
                        System.out.println(options[i]);
                        System.out.print("👉 Enter your choice (1-4): ");
                        int userAnswer = sc.nextInt();

                        if (userAnswer == answers[i]) {
                            System.out.println("✅ Correct! 🎉");
                            score++;
                        } else {
                            System.out.println("❌ Wrong! The correct answer was: " + answers[i]);
                        }
                    }

                    System.out.println("\n🎯 Quiz Over!");
                    System.out.println("📊 Your Score: " + score + "/" + questions.length);

                    double percentage = (score * 100.0) / questions.length;
                    System.out.println("📈 Percentage: " + percentage + "%");

                    if (percentage >= 75) {
                        System.out.println("🏆 Excellent! You passed with distinction! 🌟");
                    } else if (percentage >= 50) {
                        System.out.println("👍 You passed the quiz. Keep improving! 💪");
                    } else {
                        System.out.println("📖 You did not pass. Try again and keep learning! 🚀");
                    }
                } else if (choice == 0) {
                    System.out.println("👋 Exiting the Quiz. Goodbye!");
                    break;
                } else {
                    System.out.println("⚠️ Invalid choice! Please try again.");
                }

                System.out.print("\n🔁 Do you want to play again? (yes/no): ");
                String again = sc.next().toLowerCase();
                playAgain = again.equals("yes");
            }

            System.out.println("👏 Thanks for playing the Quiz! 🎓");
            sc.close();
        }
    }


