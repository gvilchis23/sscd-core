/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ModuloAtencionEntity.java
 *
 * Creado:  Oct 14, 2011
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
@Table(name = "CDT_MOD_ATENCION")
public class ModuloAtencionEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_MOD_ATENCION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveModuloAtencion;
	@Column(name = "NUM_EXISTE_MODULO")
	private Integer existeModulo;
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;
	@Column(name = "NUM_PERSONAL_TECNICO")
	private Integer personalTecnico;
	@Column(name = "NUM_VISIBLE")
	private Integer visible;
	@Column(name = "NUM_ACCESIBLE")
	private Integer accesible;
	@Column(name = "NUM_SENIALIZADO")
	private Integer senializado;
	@Column(name = "NUM_NUM_PERSO_ATIENDEN")
	private Integer personasAtendiendo;
	/**
	 * @return the cveModuloAtencion
	 */
	public Long getCveModuloAtencion() {
		return cveModuloAtencion;
	}
	/**
	 * @param cveModuloAtencion the cveModuloAtencion to set
	 */
	public void setCveModuloAtencion(Long cveModuloAtencion) {
		this.cveModuloAtencion = cveModuloAtencion;
	}
	/**
	 * @return the existeModulo
	 */
	public Integer getExisteModulo() {
		return existeModulo;
	}
	/**
	 * @param existeModulo the existeModulo to set
	 */
	public void setExisteModulo(Integer existeModulo) {
		this.existeModulo = existeModulo;
	}
	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}
	/**
	 * @param cdv the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}
	/**
	 * @return the personalTecnico
	 */
	public Integer getPersonalTecnico() {
		return personalTecnico;
	}
	/**
	 * @param personalTecnico the personalTecnico to set
	 */
	public void setPersonalTecnico(Integer personalTecnico) {
		this.personalTecnico = personalTecnico;
	}
	/**
	 * @return the visible
	 */
	public Integer getVisible() {
		return visible;
	}
	/**
	 * @param visible the visible to set
	 */
	public void setVisible(Integer visible) {
		this.visible = visible;
	}
	/**
	 * @return the accesible
	 */
	public Integer getAccesible() {
		return accesible;
	}
	/**
	 * @param accesible the accesible to set
	 */
	public void setAccesible(Integer accesible) {
		this.accesible = accesible;
	}
	/**
	 * @return the senializado
	 */
	public Integer getSenializado() {
		return senializado;
	}
	/**
	 * @param senializado the senializado to set
	 */
	public void setSenializado(Integer senializado) {
		this.senializado = senializado;
	}
	/**
	 * @return the personasAtendiendo
	 */
	public Integer getPersonasAtendiendo() {
		return personasAtendiendo;
	}
	/**
	 * @param personasAtendiendo the personasAtendiendo to set
	 */
	public void setPersonasAtendiendo(Integer personasAtendiendo) {
		this.personasAtendiendo = personasAtendiendo;
	}
	
	

}
