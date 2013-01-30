/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ResultadoServicioEntity.java
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name="cdc_resul_servicio",schema ="SSDC_DS")
@Table(name="cdc_resul_servicio")
public class ResultadoServicioEntity  implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long cveResultado;
	private TipoVentanillaEntity tipoVentanilla;
	private String nombreResultado;
	private Integer status;
	
	@Id
	@Column(name="cve_resultado")
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	/**
	 * @return the cveResultado
	 */
	public Long getCveResultado() {
		return cveResultado;
	}
	/**
	 * @param cveResultado the cveResultado to set
	 */
	public void setCveResultado(Long cveResultado) {
		this.cveResultado = cveResultado;
	}
	 @Column(name="nom_resultado")
	/**
	 * @return the nombreResultado
	 */
	public String getNombreResultado() {
		return nombreResultado;
	}
	/**
	 * @param nombreResultado the nombreResultado to set
	 */
	public void setNombreResultado(String nombreResultado) {
		this.nombreResultado = nombreResultado;
	}
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cve_tip_ventanilla")
	 /**
	 * @return the tipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}
	/**
	 * @param tipoVentanilla the tipoVentanilla to set
	 */
	public void setTipoVentanilla(TipoVentanillaEntity tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
	}
	
	 @Column(name="num_estado")
		/**
		 * @return the status
		 */
		public Integer getStatus() {
			return status;
		}
	
		/**
		 * @param status the status to set
		 */
		public void setStatus(Integer status) {
			this.status = status;
		}
		
	
	
	
	
	
	

}
