package br.clima.usjt_clima_jpa_hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.clima.usjt_clima_jpa_hibernate.model.Temperatura;

public class TesteAtualizaTemperatura {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Temperatura t = manager.find(Temperatura.class, 1L);
		t.setTempMin("15°");
		t.setTempMax("25°");
		t.setHumidadeAr("50%");
		t.setLatitude("80°");
		t.setLongitude("60°");
		t.setDescricao("Nublado com pancadas de chuva");
		t.setDataHora("20:45");
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
