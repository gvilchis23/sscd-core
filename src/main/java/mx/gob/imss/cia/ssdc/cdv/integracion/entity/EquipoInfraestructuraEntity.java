/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InfraestructuraEntity.java
 *
 * Creado:  Oct 14, 2011
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

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_EQUIPOINFRAESTRUCTURA")
public class EquipoInfraestructuraEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_EQUIPO_INFRAESTRUCTURA")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveEquipoInfraestructura;

	@Column(name = "NOM_EQUIPO_INFRA")
	private String nombreEquipoInfraestructura;

	/**
	 * @return the cveEquipoInfraestructura
	 */
	public Long getCveEquipoInfraestructura() {
		return cveEquipoInfraestructura;
	}

	/**
	 * @param cveEquipoInfraestructura
	 *            the cveEquipoInfraestructura to set
	 */
	public void setCveEquipoInfraestructura(Long cveEquipoInfraestructura) {
		this.cveEquipoInfraestructura = cveEquipoInfraestructura;
	}

	/**
	 * @return the nombreEquipoInfraestructura
	 */
	public String getNombreEquipoInfraestructura() {
		return nombreEquipoInfraestructura;
	}

	/**
	 * @param nombreEquipoInfraestructura
	 *            the nombreEquipoInfraestructura to set
	 */
	public void setNombreEquipoInfraestructura(
	        String nombreEquipoInfraestructura) {
		this.nombreEquipoInfraestructura = nombreEquipoInfraestructura;
	}

}
