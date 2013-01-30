/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaRequisitos.java
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
@Table(name = "CDC_CAT_REQUISITOS")
public class CategoriaRequisitosEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_CATEG_REQUISITO")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveCategoriaRequisitos;

	@Column(name = "NOM_CATEGORIA")
	private String nombreCategoriaRequisitos;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveCategoriaRequisitos
	 */
	public Long getCveCategoriaRequisitos() {
		return cveCategoriaRequisitos;
	}

	/**
	 * @param cveCategoriaRequisitos
	 *            the cveCategoriaRequisitos to set
	 */
	public void setCveCategoriaRequisitos(Long cveCategoriaRequisitos) {
		this.cveCategoriaRequisitos = cveCategoriaRequisitos;
	}

	/**
	 * @return the nombreCategoriaRequisitos
	 */
	public String getNombreCategoriaRequisitos() {
		return nombreCategoriaRequisitos;
	}

	/**
	 * @param nombreCategoriaRequisitos
	 *            the nombreCategoriaRequisitos to set
	 */
	public void setNombreCategoriaRequisitos(String nombreCategoriaRequisitos) {
		this.nombreCategoriaRequisitos = nombreCategoriaRequisitos;
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
