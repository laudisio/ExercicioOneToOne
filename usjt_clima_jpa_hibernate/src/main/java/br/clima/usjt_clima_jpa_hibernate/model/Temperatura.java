package br.clima.usjt_clima_jpa_hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_temperatura")
public class Temperatura {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable=false,length=200)
	private String descricao;
	@Column(nullable=false,length=10)
	private String tempMin;
	@Column(nullable=false, length=10)
	private String tempMax;
	@Column(nullable=false, length=10)
	private String humidadeAr;
	@Column(nullable=false, length=20)
	private String dataHora;
	@Column(nullable=false, length=10)
	private String latitude;
	@Column(nullable=false, length=10)
	private String longitude;
	
	@OneToOne(optional=false)
	@JoinColumn (name = "dia_da_semana")
	private Semana semana;
	
	
	
	public Semana getSemana() {
		return semana;
	}
	public void setSemana(Semana semana) {
		this.semana = semana;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTempMin() {
		return tempMin;
	}
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	public String getTempMax() {
		return tempMax;
	}
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}
	public String getHumidadeAr() {
		return humidadeAr;
	}
	public void setHumidadeAr(String humidadeAr) {
		this.humidadeAr = humidadeAr;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperatura other = (Temperatura) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Temperatura [descricao=" + descricao + ", tempMin=" + tempMin + ", tempMax=" + tempMax + ", humidadeAr="
				+ humidadeAr + ", dataHora=" + dataHora + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	

}
