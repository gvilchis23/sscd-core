/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UtilidadesEntity.java
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_UTILIDADES")
public class UtilidadesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_UTILIDADES")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveUtilidades;

	@Column(name = "NOM_UTILIDAD")
	private String nombreUtilidades;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "num_estado")
	private Integer status;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "utilidades")
	private List<SistemaEntity> sistema;

	/**
	 * @return the cveUtilidades
	 */
	public Long getCveUtilidades() {
		return cveUtilidades;
	}

	/**
	 * @param cveUtilidades
	 *            the cveUtilidades to set
	 */
	public void setCveUtilidades(Long cveUtilidades) {
		this.cveUtilidades = cveUtilidades;
	}

	/**
	 * @return the nombreUtilidades
	 */
	public String getNombreUtilidades() {
		return nombreUtilidades;
	}

	/**
	 * @param nombreUtilidades
	 *            the nombreUtilidades to set
	 */
	public void setNombreUtilidades(String nombreUtilidades) {
		this.nombreUtilidades = nombreUtilidades;
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

	/**
	 * @return the sistema
	 */
	public List<SistemaEntity> getSistema() {
		return sistema;
	}

	/**
	 * @param sistema
	 *            the sistema to set
	 */
	public void setSistema(List<SistemaEntity> sistema) {
		this.sistema = sistema;
	}

}
