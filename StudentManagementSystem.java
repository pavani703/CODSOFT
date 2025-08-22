package Codsoft;
import java.util.ArrayList;
import java.util.Scanner;

    public class StudentManagementSystem {
        private ArrayList<Student> students = new ArrayList<>();
        private Scanner sc = new Scanner(System.in);

        private void addStudent() {
            System.out.print("🆔 Roll Number: ");
            int roll = sc.nextInt(); sc.nextLine();

            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    System.out.println("⚠️ Already exists!");
                    return;
                }
            }

            System.out.print("👤 Name: ");
            String name = sc.nextLine();
            System.out.print("🏆 Grade: ");
            String grade = sc.nextLine();

            students.add(new Student(roll, name, grade));
            System.out.println("✅ Added!");
        }

        private void removeStudent() {
            System.out.print("🗑️ Roll Number: ");
            int roll = sc.nextInt(); sc.nextLine();
            boolean removed = students.removeIf(s -> s.getRollNumber() == roll);
            if (removed) System.out.println("🗑️ Removed!");
            else System.out.println("⚠️ Not found.");
        }

        private void searchStudent() {
            System.out.print("🔍 Roll Number: ");
            int roll = sc.nextInt(); sc.nextLine();
            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    System.out.println("✅ Found:");
                    s.display();
                    return;
                }
            }
            System.out.println("⚠️ Not found.");
        }

        private void displayAllStudents() {
            if (students.isEmpty()) {
                System.out.println("⚠️ No students.");
                return;
            }
            System.out.println("\n📋 Students:");
            for (Student s : students) s.display();
        }

        private void editStudent() {
            System.out.print("✏️ Roll Number: ");
            int roll = sc.nextInt(); sc.nextLine();
            for (Student s : students) {
                if (s.getRollNumber() == roll) {
                    System.out.print("👤 New Name: ");
                    s.setName(sc.nextLine());
                    System.out.print("🏆 New Grade: ");
                    s.setGrade(sc.nextLine());
                    System.out.println("✅ Updated!");
                    return;
                }
            }
            System.out.println("⚠️ Not found.");
        }

        private void start() {
            while (true) {
                System.out.println("\n🎓 Student Management System 🎓");
                System.out.println("1️⃣ Add | 2️⃣ Remove | 3️⃣ Search | 4️⃣ Display | 5️⃣ Edit | 0️⃣ Exit");
                System.out.print("👉 Choice: ");
                int choice = sc.nextInt(); sc.nextLine();

                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: removeStudent(); break;
                    case 3: searchStudent(); break;
                    case 4: displayAllStudents(); break;
                    case 5: editStudent(); break;
                    case 0: System.out.println("👋 Goodbye!"); return;
                    default: System.out.println("⚠️ Invalid choice.");
                }
            }
        }

        public static void main(String[] args) {
            new StudentManagementSystem().start();
        }
    }


