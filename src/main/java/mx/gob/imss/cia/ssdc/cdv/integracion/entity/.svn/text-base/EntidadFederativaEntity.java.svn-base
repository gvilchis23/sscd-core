/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EntidadFederativaEntity.java
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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
// @Table(name = "sst_entidad_federativa", schema = "SSDC_DS")
@Table(name = "sst_entidad_federativa")
public class EntidadFederativaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_entidad_fed")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveEntidadFed;

	@Column(name = "nom_entidad_fed")
	private String nomEntidadFed;

	public Long getCveEntidadFed() {
		return cveEntidadFed;
	}

	public void setCveEntidadFed(Long cveEntidadFed) {
		this.cveEntidadFed = cveEntidadFed;
	}

	public String getNomEntidadFed() {
		return nomEntidadFed;
	}

	public void setNomEntidadFed(String nomEntidadFed) {
		this.nomEntidadFed = nomEntidadFed;
	}

}
