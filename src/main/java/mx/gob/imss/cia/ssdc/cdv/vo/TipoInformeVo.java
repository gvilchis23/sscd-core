/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoInformeVO.java
 *
 * Creado:  04/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.vo;

/**
 * @author Gamaliel
 * 
 */
public class TipoInformeVo {
	private Integer clave;
	private String tipoInforme;

	/**
	 * @return the clave
	 */
	public Integer getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(Integer clave) {
		this.clave = clave;
	}

	/**
	 * @return the tipoInforme
	 */
	public String getTipoInforme() {
		return tipoInforme;
	}

	/**
	 * @param tipoInforme
	 *            the tipoInforme to set
	 */
	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}
}
