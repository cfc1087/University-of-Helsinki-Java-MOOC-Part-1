
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class GradeBook {

    ArrayList<Score> scores;

    public GradeBook() {
        scores = new ArrayList<Score>();

    }

    public void addScore(int newScore) {
        Score score = new Score(newScore);
        this.scores.add(score);
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        int[] grades = new int[6];
        ArrayList<Score> accepted = new ArrayList<Score>();
        for (Score score : scores) {
            if (score.getScore() >= 0 && score.getScore() <= 60) {
                if (score.getScore() >= 0 && score.getScore() <= 29) {
                    grades[0]++;

                } else if (score.getScore() >= 30 && score.getScore() <= 34) {
                    grades[1]++;
                    accepted.add(score);
                } else if (score.getScore() >= 35 && score.getScore() <= 39) {
                    grades[2]++;
                    accepted.add(score);
                } else if (score.getScore() >= 40 && score.getScore() <= 44) {
                    grades[3]++;
                    accepted.add(score);
                } else if (score.getScore() >= 45 && score.getScore() <= 49) {
                    grades[4]++;
                    accepted.add(score);
                } else if (score.getScore() >= 50 && score.getScore() <= 60) {
                    grades[5]++;
                    accepted.add(score);
                }
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        if (scores.size() != 0) {
            double totalscores = scores.size();
            double totalAccepted = accepted.size();
            double percent =  100 *(totalAccepted/totalscores) ;
            System.out.println("Acceptance percentage: " +percent);
        }

    }
}
