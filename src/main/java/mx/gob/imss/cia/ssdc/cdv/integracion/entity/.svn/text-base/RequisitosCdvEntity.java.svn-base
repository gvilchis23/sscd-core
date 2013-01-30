/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosCdvEntity.java
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
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="cdt_requisitos_cdv_servicio",schema ="SSDC_DS")
@Table(name="cdt_requisitos_cdv_servicio")
public class RequisitosCdvEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 
	
	@Id
	private LlaveCompuestaRequisitosCdv llaveCompuesta;
	
	@Column(name="DES_PRESENTACION")
	private String descripcion;
	
	
	
	/**
	 * @return the llaveCompuesta
	 */
	public LlaveCompuestaRequisitosCdv getLlaveCompuesta() {
		return llaveCompuesta;
	}
	/**
	 * @param llaveCompuesta the llaveCompuesta to set
	 */
	public void setLlaveCompuesta(LlaveCompuestaRequisitosCdv llaveCompuesta) {
		this.llaveCompuesta = llaveCompuesta;
	}
	
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
