/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SalidaEntity.java
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
@Table(name = "CDC_SALIDA")
public class SalidaEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_SALIDA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveSalida;

	@Column(name = "NOM_SALIDA")
	private String nombreSalida;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "salida")
	private List<SistemaEntity> sistema;

	@Column(name = "num_estado")
	private Integer status;

	/**
	 * @return the cveSalida
	 */
	public Long getCveSalida() {
		return cveSalida;
	}

	/**
	 * @param cveSalida
	 *            the cveSalida to set
	 */
	public void setCveSalida(Long cveSalida) {
		this.cveSalida = cveSalida;
	}

	/**
	 * @return the nombreSalida
	 */
	public String getNombreSalida() {
		return nombreSalida;
	}

	/**
	 * @param nombreSalida
	 *            the nombreSalida to set
	 */
	public void setNombreSalida(String nombreSalida) {
		this.nombreSalida = nombreSalida;
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
