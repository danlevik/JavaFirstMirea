package ru.mirea.task3;

public class Head {
    protected boolean isFunctional;

    public Head(boolean isFunctional) {
        this.isFunctional = isFunctional;
    }

    public Head(){
        this.isFunctional = true;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }

    @Override
    public String toString() {
        return "Голова\n" +
                "  isFunctional=" + isFunctional;
    }
}
