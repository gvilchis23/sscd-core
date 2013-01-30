/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SscTipoRegistoEntity.java
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
 * @author FABRICIO-INAP
 *
 */
@Entity
@Table(name = "SSC_TIPO_REGISTRO")
public class SscTipoRegistroEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3620563158097068188L;
	
	@Id
    @Column(name = "CVE_TIPO_REGISTRO")
    @GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
    private Long cveTipoRegistro;
	
    @Column(name = "NOM_TIPO_REGISTRO")
    private String nomTipoRegistro;
    
    @Column(name = "NUM_ESTADO")
    private Integer numEstado;

	/**
	 * @return the cveTipoRegistro
	 */
	public Long getCveTipoRegistro() {
		return cveTipoRegistro;
	}

	/**
	 * @param cveTipoRegistro the cveTipoRegistro to set
	 */
	public void setCveTipoRegistro(Long cveTipoRegistro) {
		this.cveTipoRegistro = cveTipoRegistro;
	}

	/**
	 * @return the nomTipoRegistro
	 */
	public String getNomTipoRegistro() {
		return nomTipoRegistro;
	}

	/**
	 * @param nomTipoRegistro the nomTipoRegistro to set
	 */
	public void setNomTipoRegistro(String nomTipoRegistro) {
		this.nomTipoRegistro = nomTipoRegistro;
	}

	/**
	 * @return the numEstado
	 */
	public Integer getNumEstado() {
		return numEstado;
	}

	/**
	 * @param numEstado the numEstado to set
	 */
	public void setNumEstado(Integer numEstado) {
		this.numEstado = numEstado;
	}
    
      
  

}