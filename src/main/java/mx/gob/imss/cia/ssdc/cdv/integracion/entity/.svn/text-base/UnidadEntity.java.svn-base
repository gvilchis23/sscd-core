/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UnidadEntity.java
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

import mx.gob.imss.cia.ssdc.commons.QueriesNombrados;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(
		name = QueriesNombrados.UNIDAD_FIND_ALL, 
		query = QueriesNombrados.UNIDAD_FIND_ALL_QUERY
)
@Table(name = "sst_unidad")
public class UnidadEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_unidad")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveUnidad;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_entidad_fed")
	private EntidadFederativaEntity entidadFederativa;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_delegacion")
	private DelegacionEntity delegacion;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tipo_unidad")
	private TipoUnidadEntity tipoUnidad;

	@Column(name = "nom_nombre")
	private String nombreUnidad;

	@Column(name = "dom_calle")
	private String domCalle;

	@Column(name = "dom_numero")
	private Integer domNumero;

	@Column(name = "dom_colonia")
	private String domColonia;

	@Column(name = "dom_municipio")
	private String domMunicipio;

	@Column(name = "num_telefono")
	private String numTelefono;

	@Column(name = "ref_clave_presup")
	private String refClavePresup;

	@Column(name = "num_estado")
	private int status;

	public Long getCveUnidad() {
		return cveUnidad;
	}

	public void setCveUnidad(Long cveUnidad) {
		this.cveUnidad = cveUnidad;
	}

	public DelegacionEntity getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(DelegacionEntity delegacion) {
		this.delegacion = delegacion;
	}

	public TipoUnidadEntity getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(TipoUnidadEntity tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public EntidadFederativaEntity getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(EntidadFederativaEntity entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public String getDomCalle() {
		return domCalle;
	}

	public void setDomCalle(String domCalle) {
		this.domCalle = domCalle;
	}

	public Integer getDomNumero() {
		return domNumero;
	}

	public void setDomNumero(Integer domNumero) {
		this.domNumero = domNumero;
	}

	public String getDomColonia() {
		return domColonia;
	}

	public void setDomColonia(String domColonia) {
		this.domColonia = domColonia;
	}

	public String getDomMunicipio() {
		return domMunicipio;
	}

	public void setDomMunicipio(String domMunicipio) {
		this.domMunicipio = domMunicipio;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getRefClavePresup() {
		return refClavePresup;
	}

	public void setRefClavePresup(String refClavePresup) {
		this.refClavePresup = refClavePresup;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
