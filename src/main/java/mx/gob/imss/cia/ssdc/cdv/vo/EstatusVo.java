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
public class EstatusVo {

	private Integer clave;
	private String estatus;

	/**
	 * @return the cveEstatus
	 */
	public Integer getClave() {
		return clave;
	}

	/**
	 * @param clave
	 */
	public void setClave(Integer clave) {
		this.clave = clave;
	}

	/**
	 * @return the nombreEstatus
	 */
	public String getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus
	 */
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
