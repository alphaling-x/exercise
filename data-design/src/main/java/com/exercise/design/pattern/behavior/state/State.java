package com.exercise.design.pattern.behavior.state;

public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
