/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompuestaInfraEquipo.java
 *
 * Creado:  Oct 14, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author propietario
 * 
 */

@Embeddable
public class LlaveCompuestaInfraEquipo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_INFRAESTRUCTURA")
	private InfraestructuraEntity infraestructura;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_EQUIPO_INFRAESTRUCTURA")
	private EquipoInfraestructuraEntity equipo;

	/**
	 * @return the infraestructura
	 */
	public InfraestructuraEntity getInfraestructura() {
		return infraestructura;
	}

	/**
	 * @param infraestructura
	 *            the infraestructura to set
	 */
	public void setInfraestructura(InfraestructuraEntity infraestructura) {
		this.infraestructura = infraestructura;
	}

	/**
	 * @return the equipo
	 */
	public EquipoInfraestructuraEntity getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo
	 *            the equipo to set
	 */
	public void setEquipo(EquipoInfraestructuraEntity equipo) {
		this.equipo = equipo;
	}

}
