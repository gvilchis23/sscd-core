/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscTipoNotificacion.java
 *
 * Creado:  11/11/2011
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
 * @author pc123
 *
 */
@Entity
@Table(name = "SST_NOTIFICACION")
public class SscNotificacionEntity implements Serializable {
 
	private static final long serialVersionUID = -3303795762761002492L;

	@Id
	@Column(name = "CVE_NOTIFICACION")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveNotificacion;
	
	@Column(name = "NOM_NOTIFICACION")
	private String nomNotificacion;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="CVE_TIPO_NOTIFICACION")
    private SscTipoNotificacionEntity tipoNotificacion;

	/**
	 * @return the cveNotificacion
	 */
	public Long getCveNotificacion() {
		return cveNotificacion;
	}

	/**
	 * @param cveNotificacion the cveNotificacion to set
	 */
	public void setCveNotificacion(Long cveNotificacion) {
		this.cveNotificacion = cveNotificacion;
	}

	/**
	 * @return the nomNotificacion
	 */
	public String getNomNotificacion() {
		return nomNotificacion;
	}

	/**
	 * @param nomNotificacion the nomNotificacion to set
	 */
	public void setNomNotificacion(String nomNotificacion) {
		this.nomNotificacion = nomNotificacion;
	}

	/**
	 * @return the tipoNotificacion
	 */
	public SscTipoNotificacionEntity getTipoNotificacion() {
		return tipoNotificacion;
	}

	/**
	 * @param tipoNotificacion the tipoNotificacion to set
	 */
	public void setTipoNotificacion(SscTipoNotificacionEntity tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}


}
