package ordenadoresElorrieta.pojo;

import java.util.Objects;


//get/set, to String , has code , ¿ COMPARE ?

public class Ordenadores {
	private int id = 0;
	private String numeroDeSerie = null;
	private String marca = null;
	private int edad = 0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, id, marca, numeroDeSerie);
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
		return edad == other.edad && id == other.id && Objects.equals(marca, other.marca)
				&& Objects.equals(numeroDeSerie, other.numeroDeSerie);
	}
	@Override
	public String toString() {
		return "Ordenadores [id=" + id + ", numeroDeSerie=" + numeroDeSerie + ", marca=" + marca + ", edad=" + edad
				+ "]";
	}

}
