package com.github.sah4ez.beans.api;

import com.github.sah4ez.ejb.Action;

import java.util.List;

/**
 * Created by aleksandr on 09.05.17.
 */
public interface Actions {

    void addAction(Action action);

    List<Action> allAction();
}
