/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoProcesoCargaEntity.java
 *
 * Creado:  Oct 17, 2011
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author propietario
 *
 */

@Entity
@Table(name = "SSC_TIPO_PROCESOCARGA")
public class TipoProcesoCargaEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_TIPOPROCARGA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveTipoCarga;
	
	@Column(name = "NOM_TIPOPROCARGA")
	private String nombreTipoCarga;

	/**
	 * @return the cveTipoCarga
	 */
	public Long getCveTipoCarga() {
		return cveTipoCarga;
	}

	/**
	 * @param cveTipoCarga the cveTipoCarga to set
	 */
	public void setCveTipoCarga(Long cveTipoCarga) {
		this.cveTipoCarga = cveTipoCarga;
	}

	/**
	 * @return the nombreTipoCarga
	 */
	public String getNombreTipoCarga() {
		return nombreTipoCarga;
	}

	/**
	 * @param nombreTipoCarga the nombreTipoCarga to set
	 */
	public void setNombreTipoCarga(String nombreTipoCarga) {
		this.nombreTipoCarga = nombreTipoCarga;
	}
	
	

}
