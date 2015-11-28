package com.test.max.exam1;

/**
 * Created by Administrator on 2015/11/16.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question,boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {

        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
