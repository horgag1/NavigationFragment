package com.dmcapps.navigationfragment.common.micromanagers;

import com.dmcapps.navigationfragment.common.interfaces.State;

import java.io.Serializable;
import java.util.Stack;

/**
 * Created by dcarmo on 2016-02-24.
 */
public class ManagerState implements State, Serializable {

    private boolean mIsTablet;
    private boolean mIsPortrait;

    private Stack<String> mFragmentTagStack;

    public ManagerState() {
        mFragmentTagStack = new Stack<>();
    }

    public Stack<String> getStack() {
        return mFragmentTagStack;
    }

    public void isTablet(boolean isTablet) {
        mIsTablet = isTablet;
    }

    public boolean isTablet() {
        return mIsTablet;
    }

    public void isPortrait(boolean isPortrait) {
        mIsPortrait = isPortrait;
    }

    public boolean isPortrait() {
        return mIsPortrait;
    }
}
