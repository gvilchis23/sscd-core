/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DelegacionEntity.java
 *
 * Creado:  13/10/2011
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mx.gob.imss.cia.ssdc.commons.QueriesNombrados;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(
		name = QueriesNombrados.DELEGACION_FIND_ALL, 
		query = QueriesNombrados.DELEGACION_FIND_ALL_QUERY
)
@Table(name = "sst_delegacion")
public class DelegacionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_delegacion")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveDelegacion;

	@ManyToOne
	@JoinColumn(name = "cve_entidad_fed")
	private EntidadFederativaEntity entidadFed;

	@Column(name = "nom_nombredel")
	private String nombreDelegacion;

	@Column(name = "ref_clave_presup")
	private String cvePresupuestaria;

	@Column(name = "dom_calle")
	private String domCalle;

	@Column(name = "dom_numero")
	private int domNumero;

	@Column(name = "dom_colonia")
	private String domColonia;

	@Column(name = "num_telefono")
	private String telefonoDelegacion;

	@Column(name = "num_estado")
	private int status;

	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public EntidadFederativaEntity getEntidadFed() {
		return entidadFed;
	}

	public void setEntidadFed(EntidadFederativaEntity entidadFed) {
		this.entidadFed = entidadFed;
	}

	public String getNombreDelegacion() {
		return nombreDelegacion;
	}

	public void setNombreDelegacion(String nombreDelegacion) {
		this.nombreDelegacion = nombreDelegacion;
	}

	public String getCvePresupuestaria() {
		return cvePresupuestaria;
	}

	public void setCvePresupuestaria(String cvePresupuestaria) {
		this.cvePresupuestaria = cvePresupuestaria;
	}

	public String getDomCalle() {
		return domCalle;
	}

	public void setDomCalle(String domCalle) {
		this.domCalle = domCalle;
	}

	public int getDomNumero() {
		return domNumero;
	}

	public void setDomNumero(int domNumero) {
		this.domNumero = domNumero;
	}

	public String getDomColonia() {
		return domColonia;
	}

	public void setDomColonia(String domColonia) {
		this.domColonia = domColonia;
	}

	public String getTelefonoDelegacion() {
		return telefonoDelegacion;
	}

	public void setTelefonoDelegacion(String telefonoDelegacion) {
		this.telefonoDelegacion = telefonoDelegacion;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
