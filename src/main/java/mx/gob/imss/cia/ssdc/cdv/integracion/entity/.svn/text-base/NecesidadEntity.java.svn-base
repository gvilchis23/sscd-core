/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecesidadEntity.java
 *
 * Creado:  Oct 13, 2011
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "CDC_TIPNECESIDAD")
public class NecesidadEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_NECESIDAD")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveNecesidad;
	@Column(name = "NOM_NECESIDAD")
	private String nombreNecesidad;
	/**
	 * @return the cveNecesidad
	 */
	public Long getCveNecesidad() {
		return cveNecesidad;
	}
	/**
	 * @param cveNecesidad the cveNecesidad to set
	 */
	public void setCveNecesidad(Long cveNecesidad) {
		this.cveNecesidad = cveNecesidad;
	}
	/**
	 * @return the nombreNecesidad
	 */
	public String getNombreNecesidad() {
		return nombreNecesidad;
	}
	/**
	 * @param nombreNecesidad the nombreNecesidad to set
	 */
	public void setNombreNecesidad(String nombreNecesidad) {
		this.nombreNecesidad = nombreNecesidad;
	}
	
	

}
