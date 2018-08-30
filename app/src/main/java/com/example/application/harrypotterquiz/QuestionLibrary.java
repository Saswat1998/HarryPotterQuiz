package com.example.application.harrypotterquiz;

/**
 * Created by saswat on 8/10/2017.
 */

public class QuestionLibrary {
    private String mQuestions [] = {
            "Who was Harry's favourite teacher at Hogwarts?",
            "What was the name of Harry's first broom?",
            "What is the spell for making objects fly in the air?",
            "Who killed Sirius Black?",
            "Whom did Harry first kiss at Hogwarts?",
            "What was Ron most afraid of?",
            "What did Harry give Dobby to make him a free elf?",
            "Who killed Neville Longbottom's parents?",
            "What was name of the group to which Harry's father and professor Lupin belonged to?"
    };
    private String mchoices [][] = {
            {"Reemus Lupin","Hagrid","Professor Snape"},
            {"Nimbus 2000","Nimbus 2001","Firebolt"},
            {"Expectro Patronum","Petrificus Totalus","Wingardium Leviosa"},
            {"Lord Voldemort","Draco Malfoy","Bellatrix Lestrange"},
            {"Hermione Granger","Cho Chang","Ginny Weasly"},
            {"Lord Voldemort","Death Eaters","Spiders"},
            {"Wand","Clothes","Sock"},
            {"Bellatrix Lestrange","Lord Voldemort","Lucius Malfoy"},
            {"The amazing four","The marauders","Saviours of Hogwarts"}

    };
    private String mCorrectAnswers[] = {"Hagrid", "Nimbus 2000", "Wingardium Leviosa", "Bellatrix Lestrange", "Cho Chang", "Spiders", "Sock","Bellatrix Lestrange","The marauders"};
    public  String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice0 = mchoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mchoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mchoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
