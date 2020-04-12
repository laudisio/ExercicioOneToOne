package br.clima.usjt_clima_jpa_hibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Temperatura");
		List <Temperatura> temperaturas = query.getResultList();
		for (Temperatura t: temperaturas) {
			System.out.println(t);
		}
		manager.close();
		JPAUtil.close();

	}

}
