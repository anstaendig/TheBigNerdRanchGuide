package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mGotCheated;

    public Question(int textResId, boolean answerTrue, boolean gotCheated) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mGotCheated = gotCheated;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isGotCheated() {
        return mGotCheated;
    }

    public void setGotCheated(boolean gotCheated) {
        mGotCheated = gotCheated;
    }
}
