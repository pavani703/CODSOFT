package Codsoft;

public class Student {
        private int rollNumber;
        private String name;
        private String grade;

        public Student(int rollNumber, String name, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
        }

        public int getRollNumber() { return rollNumber; }
        public String getName() { return name; }
        public String getGrade() { return grade; }

        public void setName(String name) { this.name = name; }
        public void setGrade(String grade) { this.grade = grade; }

        public void display() {
            System.out.println("📌 Roll No: " + rollNumber + " | 👤 Name: " + name + " | 🏆 Grade: " + grade);
        }
    }


