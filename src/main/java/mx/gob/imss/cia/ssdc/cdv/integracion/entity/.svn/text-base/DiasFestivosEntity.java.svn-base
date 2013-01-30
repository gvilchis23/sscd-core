/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DiasFestivosEntity.java
 *
 * Creado:  Oct 17, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.Date;

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
 * @author propietario
 * 
 */

@Entity
@Table(name = "SST_DIAS_FESTIVOS")
public class DiasFestivosEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_DIASFESTIVOS")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveDiasFestivos;

	@Column(name = "FEC_FECHA")
	private Date fecha;

	@Column(name = "NOM_RAZON")
	private String razon;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_ANIO")
	private AnioEntity ano;

	/**
	 * @return the cveDiasFestivos
	 */
	public Long getCveDiasFestivos() {
		return cveDiasFestivos;
	}

	/**
	 * @param cveDiasFestivos
	 *            the cveDiasFestivos to set
	 */
	public void setCveDiasFestivos(Long cveDiasFestivos) {
		this.cveDiasFestivos = cveDiasFestivos;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return new Date(fecha.getTime());
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = (Date) fecha.clone();
	}

	/**
	 * @return the razon
	 */
	public String getRazon() {
		return razon;
	}

	/**
	 * @param razon
	 *            the razon to set
	 */
	public void setRazon(String razon) {
		this.razon = razon;
	}

	/**
	 * @return the ano
	 */
	public AnioEntity getAno() {
		return ano;
	}

	/**
	 * @param ano
	 *            the ano to set
	 */
	public void setAno(AnioEntity ano) {
		this.ano = ano;
	}

}
