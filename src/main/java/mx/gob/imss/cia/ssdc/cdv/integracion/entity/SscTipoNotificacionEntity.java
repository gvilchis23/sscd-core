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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * @author pc123
 *
 */
@Entity
@Table(name = "SSC_TIPO_NOTIFICACION")
public class SscTipoNotificacionEntity implements Serializable {

	private static final long serialVersionUID = 1L;
			
	@Id
	@Column(name = "CVE_TIPO_NOTIFICACION")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveTipoNotificacion;
	
	@Column(name = "NOM_TIPO_NOTIFICACION")
	private String nomTipoNotificacion;
	
	@Column(name = "NUM_ESTADO")
	private Integer numEstado;

	public Long getCveTipoNotificacion() {
		return cveTipoNotificacion;
	}

	public void setCveTipoNotificacion(Long cveTipoNotificacion) {
		this.cveTipoNotificacion = cveTipoNotificacion;
	}

	public String getNomTipoNotificacion() {
		return nomTipoNotificacion;
	}

	public void setNomTipoNotificacion(String nomTipoNotificacion) {
		this.nomTipoNotificacion = nomTipoNotificacion;
	}

	public Integer getNumEstado() {
		return numEstado;
	}

	public void setNumEstado(Integer numEstado) {
		this.numEstado = numEstado;
	}
	    
}