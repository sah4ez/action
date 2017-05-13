package com.github.sah4ez.beans.impl;

import javax.ejb.Stateless;

/**
 * Created by aleksandr on 08.05.17.
 */
@Stateless
public class ActionsBean {//implements ActionsLocal, ActionsRemote {

//    @PersistenceContext(name = "action-unit")
//    private EntityManager entityManager;

    public ActionsBean() {
    }

//    @Override
//    public void addAction(Action action) {
//        entityManager.persist(action);
//        Logger.getLogger("ActionBeans").log(Level.INFO, action.toString());
//    }

//    @Override
//    public List<Action> allAction() {
//        Query query = entityManager.createQuery("select a from Action a");
//        return Collections.emptyList();
//    }
}
