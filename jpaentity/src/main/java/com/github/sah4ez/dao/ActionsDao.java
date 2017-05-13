package com.github.sah4ez.dao;

import com.github.sah4ez.entity.Actions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * DAO for Actions
 */
@Stateless
public class ActionsDao {
	@PersistenceContext(unitName = "jpaentity-persistence-unit")
	private EntityManager em;

	public void create(Actions entity) {
		em.persist(entity);
	}

	public void deleteById(Long id) {
		Actions entity = em.find(Actions.class, id);
		if (entity != null) {
			em.remove(entity);
		}
	}

	public Actions findById(Long id) {
		return em.find(Actions.class, id);
	}

	public Actions update(Actions entity) {
		return em.merge(entity);
	}

	public List<Actions> listAll(Integer startPosition, Integer maxResult) {
		TypedQuery<Actions> findAllQuery = em
				.createQuery(
						"SELECT DISTINCT a FROM Actions a LEFT JOIN FETCH a.user ORDER BY a.id",
						Actions.class);
		if (startPosition != null) {
			findAllQuery.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			findAllQuery.setMaxResults(maxResult);
		}
		return findAllQuery.getResultList();
	}
}
