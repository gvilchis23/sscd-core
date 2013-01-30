/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProblematicaEntity.java
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_PROBLEMATICA")
public class ProblematicaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_PROBLEMATICA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveProblematica;

	@Column(name = "NOM_PROBLEMATICA")
	private String nombreProblematica;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_SUBCATEGORIA")
	private SubProblematicaEntity subProblematica;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_NECESIDAD")
	private NecesidadEntity necesidad;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "CDT_PRO_NEC_CUALITATIVA", 
			   joinColumns = @JoinColumn(name = "CVE_PROBLEMATICA"), 
			   inverseJoinColumns = @JoinColumn(name = "CVE_NEC_CUALITATIVA"))
	private List<NecCualitativasEntity> necCualitativas;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "problematica")
	private List<CdvEntity> cdv;

	@Column(name = "num_estado")
	private Integer status;

	/**
	 * @return the cveProblematica
	 */
	public Long getCveProblematica() {
		return cveProblematica;
	}

	/**
	 * @param cveProblematica
	 *            the cveProblematica to set
	 */
	public void setCveProblematica(Long cveProblematica) {
		this.cveProblematica = cveProblematica;
	}

	/**
	 * @return the nombreProblematica
	 */
	public String getNombreProblematica() {
		return nombreProblematica;
	}

	/**
	 * @param nombreProblematica
	 *            the nombreProblematica to set
	 */
	public void setNombreProblematica(String nombreProblematica) {
		this.nombreProblematica = nombreProblematica;
	}

	/**
	 * @return the subProblematica
	 */
	public SubProblematicaEntity getSubProblematica() {
		return subProblematica;
	}

	/**
	 * @param subProblematica
	 *            the subProblematica to set
	 */
	public void setSubProblematica(SubProblematicaEntity subProblematica) {
		this.subProblematica = subProblematica;
	}

	/**
	 * @return the necesidad
	 */
	public NecesidadEntity getNecesidad() {
		return necesidad;
	}

	/**
	 * @param necesidad
	 *            the necesidad to set
	 */
	public void setNecesidad(NecesidadEntity necesidad) {
		this.necesidad = necesidad;
	}

	/**
	 * @return the tipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}

	/**
	 * @param tipoVentanilla
	 *            the tipoVentanilla to set
	 */
	public void setTipoVentanilla(TipoVentanillaEntity tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
	}

	/**
	 * @return the necCualitativas
	 */
	public List<NecCualitativasEntity> getNecCualitativas() {
		return necCualitativas;
	}

	/**
	 * @param necCualitativas
	 *            the necCualitativas to set
	 */
	public void setNecCualitativas(List<NecCualitativasEntity> necCualitativas) {
		this.necCualitativas = necCualitativas;
	}

	/**
	 * @return the cdv
	 */
	public List<CdvEntity> getCdv() {
		return cdv;
	}

	/**
	 * @param cdv
	 *            the cdv to set
	 */
	public void setCdv(List<CdvEntity> cdv) {
		this.cdv = cdv;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
