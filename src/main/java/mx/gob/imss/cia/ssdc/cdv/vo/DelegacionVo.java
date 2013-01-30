/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvVO.java
 *
 * Creado:  01/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.vo;

/**
 * @author
 * 
 */
public class DelegacionVo {

	private Long clave;
	private String delegacion;

	public DelegacionVo() {
	}

	/**
	 * @param clave
	 * @param delegacion
	 */
	public DelegacionVo(Long clave, String delegacion) {
		super();
		this.clave = clave;
		this.delegacion = delegacion;
	}

	/**
	 * @return the cveDelegacion
	 */
	public Long getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the cveDelegacion to set
	 */
	public void setClave(Long clave) {
		this.clave = clave;
	}

	/**
	 * @return the nombreDelegacion
	 */
	public String getDelegacion() {
		return delegacion;
	}

	/**
	 * @param delegacion
	 *            the nombreDelegacion to set
	 */
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

}