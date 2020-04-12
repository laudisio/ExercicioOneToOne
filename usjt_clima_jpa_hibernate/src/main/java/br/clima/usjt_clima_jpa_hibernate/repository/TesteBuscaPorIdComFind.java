package br.clima.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;

import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Temperatura t = manager.find(Temperatura.class, 1L);
		System.out.println(t);
		manager.close();
		JPAUtil.close();

	}

}
