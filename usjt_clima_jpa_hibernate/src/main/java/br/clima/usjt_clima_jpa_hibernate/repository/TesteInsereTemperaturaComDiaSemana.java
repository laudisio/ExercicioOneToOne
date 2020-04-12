package br.clima.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.clima.usjt_clima_jpa_hibernate.model.Semana;
import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteInsereTemperaturaComDiaSemana {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setDiaSemana("Segunda-Feira");
		manager.persist(s);
		Temperatura t = new Temperatura();
		t.setTempMin("23°");
		t.setTempMax("34°");
		t.setHumidadeAr("20%");
		t.setLatitude("80°");
		t.setLongitude("60°");
		t.setDescricao("Ensolarado o dia inteiro");
		t.setDataHora("17:45");
		t.setSemana(s);
		manager.persist(t);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
