/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CausaEntity.java
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */
@Entity
@Table(name = "CDC_CAUSA")
public class CausaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_causa")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveCausa;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "causa")
	private List<CdvEntity> cdv;

	@Column(name = "nom_causa")
	private String nombreCausa;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveCausa
	 */
	public Long getCveCausa() {
		return cveCausa;
	}

	/**
	 * @param cveCausa
	 *            the cveCausa to set
	 */
	public void setCveCausa(Long cveCausa) {
		this.cveCausa = cveCausa;
	}

	/**
	 * @return the nombreCausa
	 */
	public String getNombreCausa() {
		return nombreCausa;
	}

	/**
	 * @param nombreCausa
	 *            the nombreCausa to set
	 */
	public void setNombreCausa(String nombreCausa) {
		this.nombreCausa = nombreCausa;
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
