/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TurnoVO.java
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
public class TurnoVo {

	private Long clave;
	private String turno;

	public TurnoVo() {
		super();
	}

	/**
	 * @param clave
	 * @param turno
	 */
	public TurnoVo(Long clave, String turno) {
		super();
		this.clave = clave;
		this.turno = turno;
	}

	/**
	 * @return the clave
	 */
	public Long getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(Long clave) {
		this.clave = clave;
	}

	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno
	 *            the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
