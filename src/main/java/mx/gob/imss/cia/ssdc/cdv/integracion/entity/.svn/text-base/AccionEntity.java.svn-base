/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AccionEntity.java
 *
 * Creado:  Oct 13, 2011
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */
@Entity
@Table(name = "CDC_ACCION")
public class AccionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_accion")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveAccion;

	@Column(name = "nom_accion")
	private String nombreAccion;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveAccion
	 */
	public Long getCveAccion() {
		return cveAccion;
	}

	/**
	 * @param cveAccion
	 *            the cveAccion to set
	 */
	public void setCveAccion(Long cveAccion) {
		this.cveAccion = cveAccion;
	}

	/**
	 * @return the nombreAccion
	 */
	public String getNombreAccion() {
		return nombreAccion;
	}

	/**
	 * @param nombreAccion
	 *            the nombreAccion to set
	 */
	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
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
