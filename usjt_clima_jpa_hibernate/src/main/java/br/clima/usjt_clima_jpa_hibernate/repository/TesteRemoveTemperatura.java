package br.clima.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteRemoveTemperatura {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Temperatura t = manager.find(Temperatura.class, 1L);
		manager.remove(t);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
