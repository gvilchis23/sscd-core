/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CatServicioEntity.java
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
// @Table(name="cdc_cat_servicio",schema ="SSDC_DS")
@Table(name = "cdc_cat_servicio")
public class CatServicioEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cveCategoria;
	private TipoVentanillaEntity ventanilla;
	private String nombreCategoria;
	private Integer status;

	@Id
	@Column(name = "cve_categoria")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	/**
	 * @return the cveCategoria
	 */
	public Long getCveCategoria() {
		return cveCategoria;
	}

	/**
	 * @param cveCategoria
	 *            the cveCategoria to set
	 */
	public void setCveCategoria(Long cveCategoria) {
		this.cveCategoria = cveCategoria;
	}

	@Column(name = "nom_nombrecategoria")
	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	/**
	 * @param nombreCategoria
	 *            the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	/**
	 * @return the ventanilla
	 */
	public TipoVentanillaEntity getVentanilla() {
		return ventanilla;
	}

	/**
	 * @param cveTipoVentanilla
	 *            the cveTipoVentanilla to set
	 */
	public void setVentanilla(TipoVentanillaEntity ventanilla) {
		this.ventanilla = ventanilla;
	}

	@Column(name = "num_estado")
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
