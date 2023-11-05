package org.velezreyes.quiz.question6;

public class KarenTea implements Drink {

    private String name = "KarenTea";
    private boolean isFizzy = false;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return isFizzy;
    }

}
