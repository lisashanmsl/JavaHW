import java.util.Scanner;

public class StudentGrades {
    public static final int MAX_STUDENT = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] StudentGrade = new String[MAX_STUDENT]; // store student grade
        String[] StudentName = new String[MAX_STUDENT]; // store student name

        int count = 0;
        while (count < MAX_STUDENT) {
            System.out.printf("Student%d name(stop by enter quit): ", count + 1);
            String inputName = input.nextLine();// 用nextLine()讀入名子

            // read student Info until enter quit
            if (inputName.equalsIgnoreCase("quit")) {
                break;
            }
            StudentName[count] = inputName;
            System.out.printf("Student%d's grade:", count + 1);
            StudentGrade[count] = input.nextLine();
            count++;// 紀錄人數
        }
        input.close();

        int[] num = new int[4]; // store number of grade
        for (int i = 0; i < count; i++) {
            switch (StudentGrade[i].toUpperCase()) {
                case "A":
                    num[0]++;
                    break;
                case "B":
                    num[1]++;
                    break;
                case "C":
                    num[2]++;
                    break;
                case "D":
                    num[3]++;
                    break;
                default:
                    break;
            }
        }

        String[] grade = { "A", "B", "C", "D" };
        for (int i = 0; i < 4; i++) { // print number of grade
            System.out.printf("Number of grade%s: %d%n", grade[i], num[i]);
        }
    }
}