/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: OpinionTrabajadorEntity.java
 *
 * Creado:  Oct 14, 2011
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_OPINION_TRABAJADOR")
public class OpinionTrabajadorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CVE_OPINION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cveOpinionTrabajador;

	@Column(name = "NUM_GUSTO_TRABAJO")
	private Integer gustoTrabajo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "CDT_OPIN_TRAB_RAZON", 
			   joinColumns = @JoinColumn(name = "CVE_OPINION"), 
			   inverseJoinColumns = @JoinColumn(name = "CVE_RAZON"))
	private List<RazonEntity> razon;
	/**
	 * @return the cveOpinionTrabajador
	 */
	public Long getCveOpinionTrabajador() {
		return cveOpinionTrabajador;
	}

	/**
	 * @param cveOpinionTrabajador
	 *            the cveOpinionTrabajador to set
	 */
	public void setCveOpinionTrabajador(Long cveOpinionTrabajador) {
		this.cveOpinionTrabajador = cveOpinionTrabajador;
	}

	/**
	 * @return the gustoTrabajo
	 */
	public Integer getGustoTrabajo() {
		return gustoTrabajo;
	}

	/**
	 * @param gustoTrabajo
	 *            the gustoTrabajo to set
	 */
	public void setGustoTrabajo(Integer gustoTrabajo) {
		this.gustoTrabajo = gustoTrabajo;
	}

	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}

	/**
     * @return the razon
     */
    public List<RazonEntity> getRazon() {
    	return razon;
    }

	/**
     * @param razon the razon to set
     */
    public void setRazon(List<RazonEntity> razon) {
    	this.razon = razon;
    }

	/**
	 * @param cdv
	 *            the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}

}
