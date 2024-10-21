import java.util.Date;

public class Pasaporte {

	Piloto piloto;
	Pasajero pasajero;
	private int id;
	private String nacionalidad;
	private int nPaginas;
	private Date fechaExpiracion;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNPaginas() {
		return this.nPaginas;
	}

	/**
	 * 
	 * @param nPaginas
	 */
	public void setNPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	/**
	 * 
	 * @param fechaExpiracion
	 */
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/**
	 * 
	 * @param id
	 * @param nacionalidad
	 * @param nPaginas
	 * @param fechaExpiracion
	 */
	public Pasaporte(int id, String nacionalidad, int nPaginas, String fechaExpiracion) {
		// TODO - implement Pasaporte.Pasaporte
		throw new UnsupportedOperationException();
	}

	public void mostrarDatosPasaporte() {
		// TODO - implement Pasaporte.mostrarDatosPasaporte
		throw new UnsupportedOperationException();
	}

}