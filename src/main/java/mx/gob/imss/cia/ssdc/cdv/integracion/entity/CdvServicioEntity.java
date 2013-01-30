/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvServicioEntity.java
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@Entity
@Table(name = "cdt_cdv_servicio")
public class CdvServicioEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private LlaveCompuestaCdv llaveCompuesta;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CVE_VENTINTER_ANT")
	private VentanillaAnteriorEntity ventanillaAnterior;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CVE_VENTINTER_POST")
	private VentanillaPosteriorEntity ventanillaPosterior;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CVE_RESULTADO")
	private ResultadoServicioEntity resultado;
	@Column(name = "NUM_ESPFILA_HR")
	private Integer datoHoraEspera;
	@Column(name = "NUM_ESPFILA_MIN")
	private Integer datoMinEspera;
	@Column(name = "NUM_ESPFILA_SEG")
	private Integer datoSegundosEspera;
	@Column(name = "NUM_CICRESULT_HR")
	private Integer datoHoraPromedio;
	@Column(name = "NUM_CICRESULT_MIN")
	private Integer datoMinPromedio;
	@Column(name = "NUM_CICRESULT_SEG")
	private Integer datoSegundosPromedio;
	@Column(name = "NUM_ATENCION_HR")
	private Integer datoHoraAtencion;
	@Column(name = "NUM_ATENCION_MIN")
	private Integer datoMinAtencion;
	@Column(name = "NUM_ATENCION_SEG")
	private Integer datoSegundosAtencion;
	@Column(name = "NUM_MEN_USERS_ULTANIO")
	private Integer atendidos;
	@Transient
	private String nombreServicio;
	@Transient
	private String seleccion;
	@Transient
	private Integer anterior;
	@Transient
	private Integer posterior;

	/**
	 * @return the cveVentanillaAnterior
	 */
	public VentanillaAnteriorEntity getVentanillaAnterior() {
		return ventanillaAnterior;
	}

	/**
	 * @param cveVentanillaAnterior
	 *            the cveVentanillaAnterior to set
	 */
	public void setVentanillaAnterior(
	        VentanillaAnteriorEntity ventanillaAnterior) {
		this.ventanillaAnterior = ventanillaAnterior;
	}

	/**
	 * @return the cveVentanillaPosterior
	 */
	public VentanillaPosteriorEntity getVentanillaPosterior() {
		return ventanillaPosterior;
	}

	/**
	 * @param cveVentanillaPosterior
	 *            the cveVentanillaPosterior to set
	 */
	public void setVentanillaPosterior(
	        VentanillaPosteriorEntity ventanillaPosterior) {
		this.ventanillaPosterior = ventanillaPosterior;
	}

	/**
	 * @return the cveResultado
	 */
	public ResultadoServicioEntity getResultado() {
		return resultado;
	}

	/**
	 * @param cveResultado
	 *            the cveResultado to set
	 */
	public void setResultado(ResultadoServicioEntity resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the datoHoraEspera
	 */
	public Integer getDatoHoraEspera() {
		return datoHoraEspera;
	}

	/**
	 * @param datoHoraEspera
	 *            the datoHoraEspera to set
	 */
	public void setDatoHoraEspera(Integer datoHoraEspera) {
		this.datoHoraEspera = datoHoraEspera;
	}

	/**
	 * @return the datoMinEspera
	 */
	public Integer getDatoMinEspera() {
		return datoMinEspera;
	}

	/**
	 * @param datoMinEspera
	 *            the datoMinEspera to set
	 */
	public void setDatoMinEspera(Integer datoMinEspera) {
		this.datoMinEspera = datoMinEspera;
	}

	/**
	 * @return the datoHoraPromedio
	 */
	public Integer getDatoHoraPromedio() {
		return datoHoraPromedio;
	}

	/**
	 * @param datoHoraPromedio
	 *            the datoHoraPromedio to set
	 */
	public void setDatoHoraPromedio(Integer datoHoraPromedio) {
		this.datoHoraPromedio = datoHoraPromedio;
	}

	/**
	 * @return the datoMinPromedio
	 */
	public Integer getDatoMinPromedio() {
		return datoMinPromedio;
	}

	/**
	 * @param datoMinPromedio
	 *            the datoMinPromedio to set
	 */
	public void setDatoMinPromedio(Integer datoMinPromedio) {
		this.datoMinPromedio = datoMinPromedio;
	}

	/**
	 * @return the datoHoraAtencion
	 */
	public Integer getDatoHoraAtencion() {
		return datoHoraAtencion;
	}

	/**
	 * @param datoHoraAtencion
	 *            the datoHoraAtencion to set
	 */
	public void setDatoHoraAtencion(Integer datoHoraAtencion) {
		this.datoHoraAtencion = datoHoraAtencion;
	}

	/**
	 * @return the datoMinAtencion
	 */
	public Integer getDatoMinAtencion() {
		return datoMinAtencion;
	}

	/**
	 * @param datoMinAtencion
	 *            the datoMinAtencion to set
	 */
	public void setDatoMinAtencion(Integer datoMinAtencion) {
		this.datoMinAtencion = datoMinAtencion;
	}

	/**
	 * @return the atendidos
	 */
	public Integer getAtendidos() {
		return atendidos;
	}

	/**
	 * @param atendidos
	 *            the atendidos to set
	 */
	public void setAtendidos(Integer atendidos) {
		this.atendidos = atendidos;
	}

	/**
	 * @return the datoSegundosEspera
	 */
	public Integer getDatoSegundosEspera() {
		return datoSegundosEspera;
	}

	/**
	 * @param datoSegundosEspera
	 *            the datoSegundosEspera to set
	 */
	public void setDatoSegundosEspera(Integer datoSegundosEspera) {
		this.datoSegundosEspera = datoSegundosEspera;
	}

	/**
	 * @return the datoSegundosPromedio
	 */
	public Integer getDatoSegundosPromedio() {
		return datoSegundosPromedio;
	}

	/**
	 * @param datoSegundosPromedio
	 *            the datoSegundosPromedio to set
	 */
	public void setDatoSegundosPromedio(Integer datoSegundosPromedio) {
		this.datoSegundosPromedio = datoSegundosPromedio;
	}

	/**
	 * @return the datoSegundosAtencion
	 */
	public Integer getDatoSegundosAtencion() {
		return datoSegundosAtencion;
	}

	/**
	 * @param datoSegundosAtencion
	 *            the datoSegundosAtencion to set
	 */
	public void setDatoSegundosAtencion(Integer datoSegundosAtencion) {
		this.datoSegundosAtencion = datoSegundosAtencion;
	}

	/**
	 * @return the nombreServicio
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * @param nombreServicio
	 *            the nombreServicio to set
	 */
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	/**
	 * @return the seleccion
	 */
	public String getSeleccion() {
		return seleccion;
	}

	/**
	 * @param seleccion
	 *            the seleccion to set
	 */
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	/**
	 * @return the llaveCompuesta
	 */
	public LlaveCompuestaCdv getLlaveCompuesta() {
		return llaveCompuesta;
	}

	/**
	 * @param llaveCompuesta
	 *            the llaveCompuesta to set
	 */
	public void setLlaveCompuesta(LlaveCompuestaCdv llaveCompuesta) {
		this.llaveCompuesta = llaveCompuesta;
	}

	/**
	 * @return the anterior
	 */
	public Integer getAnterior() {
		return anterior;
	}

	/**
	 * @param anterior
	 *            the anterior to set
	 */
	public void setAnterior(Integer anterior) {
		this.anterior = anterior;
	}

	/**
	 * @return the posterior
	 */
	public Integer getPosterior() {
		return posterior;
	}

	/**
	 * @param posterior
	 *            the posterior to set
	 */
	public void setPosterior(Integer posterior) {
		this.posterior = posterior;
	}

}
