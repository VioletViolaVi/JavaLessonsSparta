package com.spartaglobal.java.lessons;

public class LifePolicy extends Policy{
    private boolean isSmoker;

    // generated using generate feature in intellij
    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    // generated using generate feature in intellij
    public boolean isSmoker() {
        return isSmoker;
    }

    // generated using generate feature in intellij
    @Override
    public String toString() {
        return "LifePolicy{" +
                "isSmoker=" + isSmoker +
                '}';
    }
}
