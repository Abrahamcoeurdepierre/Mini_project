package com.example.questionquiz;

import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    public String firstAnswer = "No Answer";
    public String secondAnswer = "No Answer";
    public String lastAnswer = "No Answer";
    public int score = 0;

    public ScoreViewModel() {
    }
    public void scoreUp(){
        if (    firstAnswer.equalsIgnoreCase("Cheetah") ||
                secondAnswer.equalsIgnoreCase("George Washington") ||
                lastAnswer.equalsIgnoreCase("Santiago"))
        {
          score = score + 1;
        }
    }
    public Integer getScore(){
        return score;
    }
}
