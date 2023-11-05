package org.velezreyes.quiz.question6;

public class ScottCola implements Drink {

    private String name = "ScottCola";
    private boolean isFizzy = true;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return isFizzy;
    }

}