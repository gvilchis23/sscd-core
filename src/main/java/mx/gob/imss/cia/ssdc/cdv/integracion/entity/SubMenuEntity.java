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

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "SSC_SUBMENU")
public class SubMenuEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_SUBMENU")
	private Long cveSubMenu;
	@Column(name = "DES_SUBMENU")
	private String descripcionSubMenu;
	@Column(name = "DES_ACCION")
	private String accion;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_MENU")
	private MenuEntity menu;
	/**
	 * @return the cveSubMenu
	 */
	public Long getCveSubMenu() {
		return cveSubMenu;
	}
	/**
	 * @param cveSubMenu the cveSubMenu to set
	 */
	public void setCveSubMenu(Long cveSubMenu) {
		this.cveSubMenu = cveSubMenu;
	}
	
	/**
	 * @return the descripcionSubMenu
	 */
	public String getDescripcionSubMenu() {
		return descripcionSubMenu;
	}
	/**
	 * @param descripcionSubMenu the descripcionSubMenu to set
	 */
	public void setDescripcionSubMenu(String descripcionSubMenu) {
		this.descripcionSubMenu = descripcionSubMenu;
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
	 * @return the menu
	 */
	public MenuEntity getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(MenuEntity menu) {
		this.menu = menu;
	}
	
	

}
