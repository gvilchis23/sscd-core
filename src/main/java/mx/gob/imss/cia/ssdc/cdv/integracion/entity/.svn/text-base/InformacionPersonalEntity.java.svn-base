/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InformacionPersonalEntity.java
 *
 * Creado:  Oct 14, 2011
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
 * @author propietario
 * 
 */

@Entity
@Table(name = "CDT_INF_PERSONAL")
public class InformacionPersonalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CVE_INF_PERSONAL")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveInformacionPersonal;

	@Column(name = "NUM_PLAZAS_AUT")
	private Integer plazasAutorizadas;

	@Column(name = "NUM_LICENCIAS_PERM")
	private Integer licenciasPermanentes;

	@Column(name = "NUM_INCAPACIDADES")
	private Integer incapacidades;

	@Column(name = "NUM_PERSONAL_SERV")
	private Integer personalServicio;

	@Column(name = "NUM_COM_OTRA_VENT")
	private Integer otraVentanilla;

	@Column(name = "NUM_COM_OTRO_SERV")
	private Integer otroServicio;

	@Column(name = "NUM_REDUCCION_JOR")
	private Integer reduccionJornada;

	@Column(name = "NUM_PLAZAS_VACANTES")
	private Integer plazasVacantes;

	@Column(name = "NUM_PROM_FALTAS")
	private Float promedioFaltas;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;

	/**
	 * @return the cveInformacionPersonal
	 */
	public Long getCveInformacionPersonal() {
		return cveInformacionPersonal;
	}

	/**
	 * @param cveInformacionPersonal
	 *            the cveInformacionPersonal to set
	 */
	public void setCveInformacionPersonal(Long cveInformacionPersonal) {
		this.cveInformacionPersonal = cveInformacionPersonal;
	}

	/**
	 * @return the plazasAutorizadas
	 */
	public Integer getPlazasAutorizadas() {
		return plazasAutorizadas;
	}

	/**
	 * @param plazasAutorizadas
	 *            the plazasAutorizadas to set
	 */
	public void setPlazasAutorizadas(Integer plazasAutorizadas) {
		this.plazasAutorizadas = plazasAutorizadas;
	}

	/**
	 * @return the licenciasPermanentes
	 */
	public Integer getLicenciasPermanentes() {
		return licenciasPermanentes;
	}

	/**
	 * @param licenciasPermanentes
	 *            the licenciasPermanentes to set
	 */
	public void setLicenciasPermanentes(Integer licenciasPermanentes) {
		this.licenciasPermanentes = licenciasPermanentes;
	}

	/**
	 * @return the incapacidades
	 */
	public Integer getIncapacidades() {
		return incapacidades;
	}

	/**
	 * @param incapacidades
	 *            the incapacidades to set
	 */
	public void setIncapacidades(Integer incapacidades) {
		this.incapacidades = incapacidades;
	}

	/**
	 * @return the personalServicio
	 */
	public Integer getPersonalServicio() {
		return personalServicio;
	}

	/**
	 * @param personalServicio
	 *            the personalServicio to set
	 */
	public void setPersonalServicio(Integer personalServicio) {
		this.personalServicio = personalServicio;
	}

	/**
	 * @return the otraVentanilla
	 */
	public Integer getOtraVentanilla() {
		return otraVentanilla;
	}

	/**
	 * @param otraVentanilla
	 *            the otraVentanilla to set
	 */
	public void setOtraVentanilla(Integer otraVentanilla) {
		this.otraVentanilla = otraVentanilla;
	}

	/**
	 * @return the otroServicio
	 */
	public Integer getOtroServicio() {
		return otroServicio;
	}

	/**
	 * @param otroServicio
	 *            the otroServicio to set
	 */
	public void setOtroServicio(Integer otroServicio) {
		this.otroServicio = otroServicio;
	}

	/**
	 * @return the reduccionJornada
	 */
	public Integer getReduccionJornada() {
		return reduccionJornada;
	}

	/**
	 * @param reduccionJornada
	 *            the reduccionJornada to set
	 */
	public void setReduccionJornada(Integer reduccionJornada) {
		this.reduccionJornada = reduccionJornada;
	}

	/**
	 * @return the plazasVacantes
	 */
	public Integer getPlazasVacantes() {
		return plazasVacantes;
	}

	/**
	 * @param plazasVacantes
	 *            the plazasVacantes to set
	 */
	public void setPlazasVacantes(Integer plazasVacantes) {
		this.plazasVacantes = plazasVacantes;
	}

	/**
	 * @return the promedioFaltas
	 */
	public Float getPromedioFaltas() {
		return promedioFaltas;
	}

	/**
	 * @param promedioFaltas
	 *            the promedioFaltas to set
	 */
	public void setPromedioFaltas(Float promedioFaltas) {
		this.promedioFaltas = promedioFaltas;
	}

	/**
	 * @return the cdv
	 */
	public CdvEntity getCdv() {
		return cdv;
	}

	/**
	 * @param cdv
	 *            the cdv to set
	 */
	public void setCdv(CdvEntity cdv) {
		this.cdv = cdv;
	}

}
