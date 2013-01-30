/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ServicioEntity.java
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
// @Table(name="cdc_servicio",schema ="SSDC_DS")
@Table(name = "cdc_servicio")
public class ServicioEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cveServicio;
	private CatServicioEntity categoria;
	private String nombreServicio;
	private Integer status;

	@Id
	@Column(name = "cve_servicio")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	/**
	 * @return the cveServicio
	 */
	public Long getCveServicio() {
		return cveServicio;
	}

	/**
	 * @param cveServicio
	 *            the cveServicio to set
	 */
	public void setCveServicio(Long cveServicio) {
		this.cveServicio = cveServicio;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_categoria")
	/**
	 * @return the cveCategoria
	 */
	public CatServicioEntity getCategoria() {
		return categoria;
	}

	/**
	 * @param cveCategoria
	 *            the cveCategoria to set
	 */
	public void setCategoria(CatServicioEntity categoria) {
		this.categoria = categoria;
	}

	@Column(name = "nom_servicio")
	/**
	 * @return the nombreCategoria
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * @param nombreCategoria
	 *            the nombreCategoria to set
	 */
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
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
