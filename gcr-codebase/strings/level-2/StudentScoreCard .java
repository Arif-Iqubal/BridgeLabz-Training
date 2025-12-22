// Program to calculate student scorecard
public class StudentScoreCard {

    // Method to generate random PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade
    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 75) grade[i] = "A";
            else if (percent >= 60) grade[i] = "B";
            else if (percent >= 50) grade[i] = "C";
            else grade[i] = "Fail";
        }
        return grade;
    }

    // Method to display scorecard
    public static void display(int[][] scores, double[][] result, String[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade[i]
            );
        }
    }

    public static void main(String[] args) {
		
		//Number of Students
        int students = 5;
		
		//Calling method and computing student scorecard
        int[][] scores = generateScores(students);
        double[][] result = calculateResult(scores);
        String[] grade = calculateGrade(result);

        display(scores, result, grade);
    }
}
