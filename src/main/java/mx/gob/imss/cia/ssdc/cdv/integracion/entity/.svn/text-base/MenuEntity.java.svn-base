/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MenuEntity.java
 *
 * Creado:  Nov 7, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "SSC_MENU")
public class MenuEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cve_menu")
	private Long cveMenu;
	@Column(name = "DES_MENU")
	private String descripcionMenu;
	@Column(name = "NUM_UNIDAD")
	private Integer unidad;
	@Column(name = "NUM_DELEGACION")
	private Integer delegacion;
	@Column(name = "NUM_CENTRAL")
	private Integer central;
	@Column(name = "NUM_TIENE_HIJOS")
	private Integer hijos;
	@Column(name = "DES_ACCION")
	private String accion;
	@Transient
	private List<SubMenuEntity> subMenu;
	/**
	 * @return the cveMenu
	 */
	public Long getCveMenu() {
		return cveMenu;
	}
	/**
	 * @param cveMenu the cveMenu to set
	 */
	public void setCveMenu(Long cveMenu) {
		this.cveMenu = cveMenu;
	}
	/**
	 * @return the descripcionMenu
	 */
	public String getDescripcionMenu() {
		return descripcionMenu;
	}
	/**
	 * @param descripcionMenu the descripcionMenu to set
	 */
	public void setDescripcionMenu(String descripcionMenu) {
		this.descripcionMenu = descripcionMenu;
	}
	/**
	 * @return the unidad
	 */
	public Integer getUnidad() {
		return unidad;
	}
	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(Integer unidad) {
		this.unidad = unidad;
	}
	/**
	 * @return the delegacion
	 */
	public Integer getDelegacion() {
		return delegacion;
	}
	/**
	 * @param delegacion the delegacion to set
	 */
	public void setDelegacion(Integer delegacion) {
		this.delegacion = delegacion;
	}
	/**
	 * @return the central
	 */
	public Integer getCentral() {
		return central;
	}
	/**
	 * @param central the central to set
	 */
	public void setCentral(Integer central) {
		this.central = central;
	}
	/**
	 * @return the padre
	 */
	public Integer getHijos() {
		return hijos;
	}
	/**
	 * @param padre the padre to set
	 */
	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}
	/**
	 * @return the accion
	 */
	public String getAccion() {
		return accion;
	}
	/**
	 * @param accion the accion to set
	 */
	public void setAccion(String accion) {
		this.accion = accion;
	}
	/**
	 * @return the subMenu
	 */
	public List<SubMenuEntity> getSubMenu() {
		return subMenu;
	}
	/**
	 * @param subMenu the subMenu to set
	 */
	public void setSubMenu(List<SubMenuEntity> subMenu) {
		this.subMenu = subMenu;
	}
	
	
	

}
