/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: NecCualitativasEntity.java
 *
 * Creado:  Oct 13, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_NEC_CUALITATIVA")
public class NecCualitativasEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_NEC_CUALITATIVA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveNecCualitativas;
	
	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "necCualitativas")
	private List<ProblematicaEntity> problematica;

	@Column(name = "NOM_NEC_CUALITATIVA")
	private String nombreNecCualitativas;

	@Column(name = "NUM_ESTADO")
	private int status;

	/**
	 * @return the cveNecCualitativas
	 */
	public Long getCveNecCualitativas() {
		return cveNecCualitativas;
	}

	/**
	 * @param cveNecCualitativas
	 *            the cveNecCualitativas to set
	 */
	public void setCveNecCualitativas(Long cveNecCualitativas) {
		this.cveNecCualitativas = cveNecCualitativas;
	}

	/**
	 * @return the problematica
	 */
	public List<ProblematicaEntity> getProblematica() {
		return problematica;
	}

	/**
	 * @param problematica the problematica to set
	 */
	public void setProblematica(List<ProblematicaEntity> problematica) {
		this.problematica = problematica;
	}

	/**
	 * @return the nombreNecCualitativas
	 */
	public String getNombreNecCualitativas() {
		return nombreNecCualitativas;
	}

	/**
	 * @param nombreNecCualitativas
	 *            the nombreNecCualitativas to set
	 */
	public void setNombreNecCualitativas(String nombreNecCualitativas) {
		this.nombreNecCualitativas = nombreNecCualitativas;
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
