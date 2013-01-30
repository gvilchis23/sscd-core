/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosEntity.java
 *
 * Creado:  13/10/2011
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

@Entity
@Table(name = "cdc_requisitos")
public class RequisitosEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_requisito")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveRequisitos;

	@Column(name = "nom_requisito")
	private String nombreRequisitos;

	@Column(name = "num_estado")
	private int status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_categ_requisito")
	private CategoriaRequisitosEntity catRequisitos;

	/**
	 * @return the cveRequisitos
	 */
	public Long getCveRequisitos() {
		return cveRequisitos;
	}

	/**
	 * @param cveRequisitos
	 *            the cveRequisitos to set
	 */
	public void setCveRequisitos(Long cveRequisitos) {
		this.cveRequisitos = cveRequisitos;
	}

	/**
	 * @return the nombreRequisitos
	 */
	public String getNombreRequisitos() {
		return nombreRequisitos;
	}

	/**
	 * @param nombreRequisitos
	 *            the nombreRequisitos to set
	 */
	public void setNombreRequisitos(String nombreRequisitos) {
		this.nombreRequisitos = nombreRequisitos;
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

	/**
	 * @return the cveCatRequisitos
	 */
	public CategoriaRequisitosEntity getCatRequisitos() {
		return catRequisitos;
	}

	/**
	 * @param cveCatRequisitos
	 *            the cveCatRequisitos to set
	 */
	public void setCatRequisitos(CategoriaRequisitosEntity cveCatRequisitos) {
		this.catRequisitos = cveCatRequisitos;
	}

}
