package com.github.sah4ez.beans.api;

import com.github.sah4ez.ejb.Action;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by aleksandr on 08.05.17.
 */
@Remote
public interface ActionsRemote extends Actions {

    void addAction(Action action);

    List<Action> allAction();
}
