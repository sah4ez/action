package com.github.sah4ez.dao;

import com.github.sah4ez.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * DAO for User
 */
@Stateless
public class UserDao {
	@PersistenceContext(unitName = "jpaentity-persistence-unit")
	private EntityManager em;

	public void create(User entity) {
		em.persist(entity);
	}

	public void deleteById(Long id) {
		User entity = em.find(User.class, id);
		if (entity != null) {
			em.remove(entity);
		}
	}

	public User findById(Long id) {
		return em.find(User.class, id);
	}

	public User update(User entity) {
		return em.merge(entity);
	}

	public List<User> listAll(Integer startPosition, Integer maxResult) {
		TypedQuery<User> findAllQuery = em.createQuery(
				"SELECT DISTINCT u FROM User u ORDER BY u.id", User.class);
		if (startPosition != null) {
			findAllQuery.setFirstResult(startPosition);
		}
		if (maxResult != null) {
			findAllQuery.setMaxResults(maxResult);
		}
		return findAllQuery.getResultList();
	}
}
