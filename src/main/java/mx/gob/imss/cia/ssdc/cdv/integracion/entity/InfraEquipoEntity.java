/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InfraEquipoEntity.java
 *
 * Creado:  Oct 14, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_INFRA_EQUIPINFRAESTRUCTURA")
public class InfraEquipoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private LlaveCompuestaInfraEquipo llave;

	@Column(name = "NUM_ENUSO")
	private Integer uso;

	@Column(name = "NUM_BUEN_ESTADO")
	private Integer buenEstado;

	@Column(name = "NUM_MAL_ESTADO")
	private Integer malEstado;

	@Column(name = "NUM_OBSOLETO")
	private Integer obsoleto;

	@Column(name = "NUM_TOTAL")
	private Integer total;

	/**
	 * @return the llave
	 */
	public LlaveCompuestaInfraEquipo getLlave() {
		return llave;
	}

	/**
	 * @param llave
	 *            the llave to set
	 */
	public void setLlave(LlaveCompuestaInfraEquipo llave) {
		this.llave = llave;
	}

	/**
	 * @return the uso
	 */
	public Integer getUso() {
		return uso;
	}

	/**
	 * @param uso
	 *            the uso to set
	 */
	public void setUso(Integer uso) {
		this.uso = uso;
	}

	/**
	 * @return the buenEstado
	 */
	public Integer getBuenEstado() {
		return buenEstado;
	}

	/**
	 * @param buenEstado
	 *            the buenEstado to set
	 */
	public void setBuenEstado(Integer buenEstado) {
		this.buenEstado = buenEstado;
	}

	/**
	 * @return the malEstado
	 */
	public Integer getMalEstado() {
		return malEstado;
	}

	/**
	 * @param malEstado
	 *            the malEstado to set
	 */
	public void setMalEstado(Integer malEstado) {
		this.malEstado = malEstado;
	}

	/**
	 * @return the obsoleto
	 */
	public Integer getObsoleto() {
		return obsoleto;
	}

	/**
	 * @param obsoleto
	 *            the obsoleto to set
	 */
	public void setObsoleto(Integer obsoleto) {
		this.obsoleto = obsoleto;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

}
