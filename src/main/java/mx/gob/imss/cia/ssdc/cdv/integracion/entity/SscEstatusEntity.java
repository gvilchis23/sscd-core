/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscEstatusEntity.java
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
@Table(name = "SSC_ESTATUS")
public class SscEstatusEntity implements Serializable {

	private static final long serialVersionUID = -2259538778113256651L;

	@Id
	@Column(name = "CVE_ESTATUS")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveEstatus;
	
	@Column(name = "NOM_ESTATUS")
	private String nomEstatus;
	
	@Column(name = "NUM_ESTADO")
	private Short numEstado;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn (name="CVE_TIPO_REGISTRO")
    private SscTipoRegistroEntity tipoRegistro;

	/**
	 * @return the cveEstatus
	 */
	public Long getCveEstatus() {
		return cveEstatus;
	}

	/**
	 * @param cveEstatus the cveEstatus to set
	 */
	public void setCveEstatus(Long cveEstatus) {
		this.cveEstatus = cveEstatus;
	}

	/**
	 * @return the nomEstatus
	 */
	public String getNomEstatus() {
		return nomEstatus;
	}

	/**
	 * @param nomEstatus the nomEstatus to set
	 */
	public void setNomEstatus(String nomEstatus) {
		this.nomEstatus = nomEstatus;
	}

	/**
	 * @return the numEstado
	 */
	public Short getNumEstado() {
		return numEstado;
	}

	/**
	 * @param numEstado the numEstado to set
	 */
	public void setNumEstado(Short numEstado) {
		this.numEstado = numEstado;
	}

	/**
	 * @return the tipoRegistro
	 */
	public SscTipoRegistroEntity getTipoRegistro() {
		return tipoRegistro;
	}

	/**
	 * @param tipoRegistro the tipoRegistro to set
	 */
	public void setTipoRegistro(SscTipoRegistroEntity tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	
    
}
