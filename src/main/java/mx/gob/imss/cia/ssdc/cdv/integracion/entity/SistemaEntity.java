/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SistemaEntity.java
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDC_SISTEMA")
public class SistemaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_SISTEMA")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveSistema;

	@Column(name = "NOM_SISTEMA")
	private String nombreSistema;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "CDT_SISTEMA_SALIDA", 
	   		   joinColumns = @JoinColumn(name = "CVE_SISTEMA"), 
	   		   inverseJoinColumns = @JoinColumn(name = "CVE_SALIDA"))
	private List<SalidaEntity> salida;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CDT_SISTEMA_UTILIDADES", 
	   		   joinColumns = @JoinColumn(name = "CVE_SISTEMA"), 
	   		   inverseJoinColumns = @JoinColumn(name = "CVE_UTILIDADES"))
	private List<UtilidadesEntity> utilidades;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveSistema
	 */
	public Long getCveSistema() {
		return cveSistema;
	}

	/**
	 * @param cveSistema
	 *            the cveSistema to set
	 */
	public void setCveSistema(Long cveSistema) {
		this.cveSistema = cveSistema;
	}

	/**
	 * @return the nombreSistema
	 */
	public String getNombreSistema() {
		return nombreSistema;
	}

	/**
	 * @param nombreSistema
	 *            the nombreSistema to set
	 */
	public void setNombreSistema(String nombreSistema) {
		this.nombreSistema = nombreSistema;
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
	 * @return the salida
	 */
	public List<SalidaEntity> getSalida() {
		return salida;
	}

	/**
	 * @param salida
	 *            the salida to set
	 */
	public void setSalida(List<SalidaEntity> salida) {
		this.salida = salida;
	}

	/**
     * @return the utilidades
     */
    public List<UtilidadesEntity> getUtilidades() {
    	return utilidades;
    }

	/**
     * @param utilidades the utilidades to set
     */
    public void setUtilidades(List<UtilidadesEntity> utilidades) {
    	this.utilidades = utilidades;
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
