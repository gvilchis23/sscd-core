/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TurnoVo.java
 *
 * Creado:  14/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.edc.vo;


/**
 * @author 
 *
 */
public interface TurnoVo {
	
	/**
	 * @return the cveTurno
	 */
	Long getCveTurno();

	/**
	 * @param cveTurno
	 *            the cveTurno to set
	 */
	public void setCveTurno(Long cveTurno);

	
	/**
	 * @return the descripcionTurno
	 */
	public String getDescripcionTurno();
	
	

	/**
	 * @param descripcionTurno
	 *            the descripcionTurno to set
	 */
	public void setDescripcionTurno(String descripcionTurno);
}
