package ordenadoresElorrieta;

import java.sql.Date;
import java.util.Objects;


//get/set, to String , has code , ¿ COMPARE ?

public class Ordenadores {
	
	private String numeroDeSerie = null;
	private String marca = null;
	private String modelo = null;
	private Date fechaDeCompra ;
	private String memoria = null;
	private String disco = null;
	private boolean funciona = false;
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getFechaDeCompra() {
		return fechaDeCompra;
	}
	public void setFechaDeCompra(Date fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getDisco() {
		return disco;
	}
	public void setDisco(String disco) {
		this.disco = disco;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	@Override
	public String toString() {
		return "OrdenadoresPojo [numeroDeSerie=" + numeroDeSerie + ", marca=" + marca + ", modelo=" + modelo
				+ ", fechaDeCompra=" + fechaDeCompra + ", memoria=" + memoria + ", disco=" + disco + ", funciona="
				+ funciona + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(disco, fechaDeCompra, funciona, marca, memoria, modelo, numeroDeSerie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordenadores other = (Ordenadores) obj;
		return Objects.equals(disco, other.disco) && Objects.equals(fechaDeCompra, other.fechaDeCompra)
				&& funciona == other.funciona && Objects.equals(marca, other.marca)
				&& Objects.equals(memoria, other.memoria) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(numeroDeSerie, other.numeroDeSerie);
	}
	
	

}
