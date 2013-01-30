/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvEntity.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "CDT_CDV")
public class CdvEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	 @Id
	 @Column(name = "CVE_CDV")
	 @GenericGenerator(name = "increment", strategy = "increment")
	 @GeneratedValue(generator = "increment")
	 private Long cveCdv;

	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "CVE_TIP_VENTANILLA")
	 private TipoVentanillaEntity tipoVentanilla;
	 
	 @Column(name = "TIM_HORA_REAL_INI")
	 private int horaRealIni;
	 
	 @Column(name = "NUM_VENTANILLAS")
	 private int numeroVentanillas;
	 
	 @Column(name = "TIM_MIN_NORM_FIN")
	 private int minNormalFin;
	 
	 @Column(name = "TIM_HORA_NORM_FIN")
	 private int horaNormalFin;
	 
	 @Column(name = "TIM_MIN_NORM_INI")
	 private int minNormalIni;
	 
	 @Column(name = "TIM_HORA_NORM_INI")
	 private int horaNormalIni;
	 
	 @Column(name = "TIM_MIN_REAL_INI")
	 private int minRealIni;
	 
	 @Column(name = "TIM_HORA_REAL_FIN")
	 private int horaRealFin;
	 
	 @Column(name = "TIM_MIN_REAL_FIN")
	 private int minRealFin;
	 
	 @Column(name = "NUM_MEN_SOLICIT_REC")
	 private Integer numSolicitudRecogidas;
	 
	 @Column(name = "NUM_MEN_SOLICIT_ATEN")
	 private Integer numSolicitudAtendidas;
	 
	 @Column(name = "FEC_FECHA_CREACION")
	 private Date fechaCreacion;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "CVE_TURNO")
	 private TurnoEntity turno;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "CVE_UNIDAD")
	 private UnidadEntity unidad;
	 
	 @Column(name= "NOM_CDV" )
	 private String nombreCdv;
	 
	 @ManyToOne (cascade = CascadeType.ALL)
	 @JoinColumn(name="CVE_ESTATUS")
	 private SscEstatusEntity estatus;	 
	 
	 @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 @JoinTable(name = "CDT_CDV_CAUSA", 
	      joinColumns = @JoinColumn(name = "CVE_CDV"), 
	      inverseJoinColumns = @JoinColumn(name = "CVE_CAUSA"))
	 private List<CausaEntity> causa;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "CDT_CDVPROBLEMATICA", 
	      joinColumns = @JoinColumn(name = "CVE_CDV"), 
	      inverseJoinColumns = @JoinColumn(name = "CVE_PROBLEMATICA"))
	 private List<ProblematicaEntity> problematica;

	/**
	 * @return the cveCdv
	 */
	public Long getCveCdv() {
		return cveCdv;
	}

	/**
	 * @param cveCdv the cveCdv to set
	 */
	public void setCveCdv(Long cveCdv) {
		this.cveCdv = cveCdv;
	}

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

	/**
	 * @return the horaRealIni
	 */
	public int getHoraRealIni() {
		return horaRealIni;
	}

	/**
	 * @param horaRealIni the horaRealIni to set
	 */
	public void setHoraRealIni(int horaRealIni) {
		this.horaRealIni = horaRealIni;
	}

	/**
	 * @return the numeroVentanillas
	 */
	public int getNumeroVentanillas() {
		return numeroVentanillas;
	}

	/**
	 * @param numeroVentanillas the numeroVentanillas to set
	 */
	public void setNumeroVentanillas(int numeroVentanillas) {
		this.numeroVentanillas = numeroVentanillas;
	}

	/**
	 * @return the minNormalFin
	 */
	public int getMinNormalFin() {
		return minNormalFin;
	}

	/**
	 * @param minNormalFin the minNormalFin to set
	 */
	public void setMinNormalFin(int minNormalFin) {
		this.minNormalFin = minNormalFin;
	}

	/**
	 * @return the horaNormalFin
	 */
	public int getHoraNormalFin() {
		return horaNormalFin;
	}

	/**
	 * @param horaNormalFin the horaNormalFin to set
	 */
	public void setHoraNormalFin(int horaNormalFin) {
		this.horaNormalFin = horaNormalFin;
	}

	/**
	 * @return the minNormalIni
	 */
	public int getMinNormalIni() {
		return minNormalIni;
	}

	/**
	 * @param minNormalIni the minNormalIni to set
	 */
	public void setMinNormalIni(int minNormalIni) {
		this.minNormalIni = minNormalIni;
	}

	/**
	 * @return the horaNormalIni
	 */
	public int getHoraNormalIni() {
		return horaNormalIni;
	}

	/**
	 * @param horaNormalIni the horaNormalIni to set
	 */
	public void setHoraNormalIni(int horaNormalIni) {
		this.horaNormalIni = horaNormalIni;
	}

	/**
	 * @return the minRealIni
	 */
	public int getMinRealIni() {
		return minRealIni;
	}

	/**
	 * @param minRealIni the minRealIni to set
	 */
	public void setMinRealIni(int minRealIni) {
		this.minRealIni = minRealIni;
	}

	/**
	 * @return the horaRealFin
	 */
	public int getHoraRealFin() {
		return horaRealFin;
	}

	/**
	 * @param horaRealFin the horaRealFin to set
	 */
	public void setHoraRealFin(int horaRealFin) {
		this.horaRealFin = horaRealFin;
	}

	/**
	 * @return the minRealFin
	 */
	public int getMinRealFin() {
		return minRealFin;
	}

	/**
	 * @param minRealFin the minRealFin to set
	 */
	public void setMinRealFin(int minRealFin) {
		this.minRealFin = minRealFin;
	}

	/**
	 * @return the numSolicitudRecogidas
	 */
	public Integer getNumSolicitudRecogidas() {
		return numSolicitudRecogidas;
	}

	/**
	 * @param numSolicitudRecogidas the numSolicitudRecogidas to set
	 */
	public void setNumSolicitudRecogidas(Integer numSolicitudRecogidas) {
		this.numSolicitudRecogidas = numSolicitudRecogidas;
	}

	/**
	 * @return the numSolicitudAtendidas
	 */
	public Integer getNumSolicitudAtendidas() {
		return numSolicitudAtendidas;
	}

	/**
	 * @param numSolicitudAtendidas the numSolicitudAtendidas to set
	 */
	public void setNumSolicitudAtendidas(Integer numSolicitudAtendidas) {
		this.numSolicitudAtendidas = numSolicitudAtendidas;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the turno
	 */
	public TurnoEntity getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(TurnoEntity turno) {
		this.turno = turno;
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
	 * @return the nombreCdv
	 */
	public String getNombreCdv() {
		return nombreCdv;
	}

	/**
	 * @param nombreCdv the nombreCdv to set
	 */
	public void setNombreCdv(String nombreCdv) {
		this.nombreCdv = nombreCdv;
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
	 * @return the causa
	 */
	public List<CausaEntity> getCausa() {
		return causa;
	}

	/**
	 * @param causa the causa to set
	 */
	public void setCausa(List<CausaEntity> causa) {
		this.causa = causa;
	}

	/**
	 * @return the problematica
	 */
	public List<ProblematicaEntity> getProblematica() {
		return problematica;
	}

	/**
	 * @param problematica the problematica to set
	 */
	public void setProblematica(List<ProblematicaEntity> problematica) {
		this.problematica = problematica;
	}
	 
	
}
