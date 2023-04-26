package class16;

public class Task6 {
    char grade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Task6 grade = new Task6();
        System.out.println(grade.grade(70));


    }
    }
