/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: IndicadorEntity.java
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
@Table(name = "CDC_INDICADOR")
public class IndicadorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_INDICADOR")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveIndicador;

	@Column(name = "NOM_INDICADOR")
	private String nombreIndicador;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_OBJETIVO")
	private ObjetivoIndicadorEntity objetivoIndicador;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveIndicador
	 */
	public Long getCveIndicador() {
		return cveIndicador;
	}

	/**
	 * @param cveIndicador
	 *            the cveIndicador to set
	 */
	public void setCveIndicador(Long cveIndicador) {
		this.cveIndicador = cveIndicador;
	}

	/**
	 * @return the nombreIndicador
	 */
	public String getNombreIndicador() {
		return nombreIndicador;
	}

	/**
	 * @param nombreIndicador
	 *            the nombreIndicador to set
	 */
	public void setNombreIndicador(String nombreIndicador) {
		this.nombreIndicador = nombreIndicador;
	}

	/**
	 * @return the objetivoIndicador
	 */
	public ObjetivoIndicadorEntity getObjetivoIndicador() {
		return objetivoIndicador;
	}

	/**
	 * @param objetivoIndicador
	 *            the objetivoIndicador to set
	 */
	public void setObjetivoIndicador(ObjetivoIndicadorEntity objetivoIndicador) {
		this.objetivoIndicador = objetivoIndicador;
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
