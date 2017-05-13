package com.github.sah4ez.service;

import com.github.sah4ez.entity.Actions;
import com.github.sah4ez.entity.User;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
@LocalBean
public class UserActions {
    @PersistenceContext(unitName = "jpaentity-persistence-unit")
    private EntityManager entityManager;

    @Transactional
    public List<Actions> userAction(User user){
        TypedQuery<Actions> query = entityManager.createQuery(
                "select a from Actions a where a.user = :id",
                Actions.class
        );
        return query.setParameter("id", user.getId()).getResultList();
    }

}