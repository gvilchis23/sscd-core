/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PaavEntity.java
 *
 * Creado:  Oct 17, 2011
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
@Table(name = "PAT_PAAV")
public class PaavEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_PAT_PAAV")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cvePatPaav;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_UNIDAD")
	private UnidadEntity unidad;

	 @ManyToOne (cascade = CascadeType.ALL)
	 @JoinColumn(name="CVE_ESTATUS")
	 private SscEstatusEntity estatus;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "PAT_PERIODO_PAAV", 
			   joinColumns = @JoinColumn(name = "CVE_PAT_PAAV"), 
			   inverseJoinColumns = @JoinColumn(name = "CVE_PERIODO"))
	private List<PeriodoEntity> periodo;

	/**
	 * @return the cvePatPaav
	 */
	public Long getCvePatPaav() {
		return cvePatPaav;
	}

	/**
	 * @param cvePatPaav the cvePatPaav to set
	 */
	public void setCvePatPaav(Long cvePatPaav) {
		this.cvePatPaav = cvePatPaav;
	}

	/**
	 * @return the unidad
	 */
	public UnidadEntity getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(UnidadEntity unidad) {
		this.unidad = unidad;
	}

	/**
	 * @return the estatus
	 */
	public SscEstatusEntity getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(SscEstatusEntity estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the periodo
	 */
	public List<PeriodoEntity> getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(List<PeriodoEntity> periodo) {
		this.periodo = periodo;
	}

	

}
