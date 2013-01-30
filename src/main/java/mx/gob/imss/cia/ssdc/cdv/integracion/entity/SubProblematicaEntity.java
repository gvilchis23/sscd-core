/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SubProblematicaEntity.java
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "CDC_SUBCAT_PROBLEMATICA")
public class SubProblematicaEntity implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_SUBCATEGORIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveSubProblematica;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CATEGORIA")
	private CategoriaEntity categoria;
	@Column(name = "NOM_SUBCATEGORIA")
	private String nombreCategoria;
	@Column(name = "NUM_ESTADO")
	private Integer status;
	/**
	 * @return the cveSubProblematica
	 */
	public Long getCveSubProblematica() {
		return cveSubProblematica;
	}
	/**
	 * @param cveSubProblematica the cveSubProblematica to set
	 */
	public void setCveSubProblematica(Long cveSubProblematica) {
		this.cveSubProblematica = cveSubProblematica;
	}
	/**
	 * @return the categoria
	 */
	public CategoriaEntity getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
