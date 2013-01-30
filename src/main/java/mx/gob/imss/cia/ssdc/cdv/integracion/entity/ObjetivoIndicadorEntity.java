/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ObjetivoIndicadorEntity.java
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
@Table(name = "CDC_OBJETIVO_INDICADOR")
public class ObjetivoIndicadorEntity implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_OBJETIVO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveObjetivoIndicador;
	@Column(name = "NOM_OBJETIVO")
	private String nombreObjetivoIndicador;
	/**
	 * @return the cveObjetivoIndicador
	 */
	public Long getCveObjetivoIndicador() {
		return cveObjetivoIndicador;
	}
	/**
	 * @param cveObjetivoIndicador the cveObjetivoIndicador to set
	 */
	public void setCveObjetivoIndicador(Long cveObjetivoIndicador) {
		this.cveObjetivoIndicador = cveObjetivoIndicador;
	}
	/**
	 * @return the nombreObjetivoIndicador
	 */
	public String getNombreObjetivoIndicador() {
		return nombreObjetivoIndicador;
	}
	/**
	 * @param nombreObjetivoIndicador the nombreObjetivoIndicador to set
	 */
	public void setNombreObjetivoIndicador(String nombreObjetivoIndicador) {
		this.nombreObjetivoIndicador = nombreObjetivoIndicador;
	}
	
	

}
