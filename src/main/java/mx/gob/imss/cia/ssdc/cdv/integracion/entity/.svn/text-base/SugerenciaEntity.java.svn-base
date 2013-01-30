/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SugerenciaEntity.java
 *
 * Creado:  Oct 17, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "CDT_SUGERENCIA")
public class SugerenciaEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_SUGERENCIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveSugerencia;
	@Column(name = "NOM_SUGERENCIA")
	private String nombreSugerencia;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	/**
	 * @return the cveSugerencia
	 */
	public Long getCveSugerencia() {
		return cveSugerencia;
	}
	/**
	 * @param cveSugerencia the cveSugerencia to set
	 */
	public void setCveSugerencia(Long cveSugerencia) {
		this.cveSugerencia = cveSugerencia;
	}
	/**
	 * @return the nombreSugerencia
	 */
	public String getNombreSugerencia() {
		return nombreSugerencia;
	}
	/**
	 * @param nombreSugerencia the nombreSugerencia to set
	 */
	public void setNombreSugerencia(String nombreSugerencia) {
		this.nombreSugerencia = nombreSugerencia;
	}
	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}
	/**
	 * @param cdv the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}
	
	

}
