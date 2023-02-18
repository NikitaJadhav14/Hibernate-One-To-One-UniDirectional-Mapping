package com.jsp.pan.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.pan.dto.Pan;

public class PanDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Pan createPan(Pan pan) {
		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();

		System.out.println("pan Details Saved..");
		return pan;

	}

	public Pan getPanByID(int id) {
		Pan p1 = entityManager.find(Pan.class, id);
		System.out.println("Pan Details");
		System.out.println(p1.getPanid());
		System.out.println(p1.getPanno());

		return p1;
	}

	public Pan deletePan(int id) {
		Pan p1 = entityManager.find(Pan.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Pan Details Deleted..");
		return p1;
	}

	public Pan updatePan(int id, String PanNo) {
		Pan p1 = entityManager.find(Pan.class, id);

		if (p1 != null) {
			p1.setPanno(PanNo);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();

		} else {
			System.out.println("Pan Details Not found..");

		}
		return p1;
	}

	
}
