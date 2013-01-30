/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TurnoEntity.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import mx.gob.imss.cia.ssdc.cdv.edc.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.commons.QueriesNombrados;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(
		name = QueriesNombrados.TURNO_FIND_ALL, 
		query = QueriesNombrados.TURNO_FIND_ALL_QUERY)
@Table(name = "cdc_turno")
public class TurnoEntity implements Serializable, TurnoVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cve_turno")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveTurno;
	
	@Column(name = "des_turno")
	private String descripcionTurno;
	
	@Column(name = "num_estado")
	private int status;
	
	/**
	 * @return the cveTurno
	 */
	public Long getCveTurno() {
		return cveTurno;
	}

	/**
	 * @param cveTurno
	 *            the cveTurno to set
	 */
	public void setCveTurno(Long cveTurno) {
		this.cveTurno = cveTurno;
	}

	
	/**
	 * @return the descripcionTurno
	 */
	public String getDescripcionTurno() {
		return descripcionTurno;
	}

	/**
	 * @param descripcionTurno
	 *            the descripcionTurno to set
	 */
	public void setDescripcionTurno(String descripcionTurno) {
		this.descripcionTurno = descripcionTurno;
	}
	
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
