/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvPerfilPersonal.java
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
@Table(name = "CDT_PERFIL_PERSONAL_CDV")
public class CdtPerfilPersonalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CVE_PERFIL")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveCdvPerfil;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_ESCOLARIDAD")
	private EscolaridadEntity escolaridad;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CVE_CDV")
	private CdvEntity cdv;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "CDT_PERFIL_CURSO", 
			   joinColumns = @JoinColumn(name = "CVE_PERFIL"), 
			   inverseJoinColumns = @JoinColumn(name = "CVE_CURSO"))
	private List<CursoEntity> cursos;

	@Column(name = "CVE_EMPLEADO")
	private Integer numeroEmpleado;

	@Column(name = "FEC_TIEM_EXP_ANIO")
	private int expAno;

	@Column(name = "FEC_TIEM_EXP_MES")
	private int expMes;

	/**
	 * @return the cveCdvPerfil
	 */
	public Long getCveCdvPerfil() {
		return cveCdvPerfil;
	}

	/**
	 * @param cveCdvPerfil
	 *            the cveCdvPerfil to set
	 */
	public void setCveCdvPerfil(Long cveCdvPerfil) {
		this.cveCdvPerfil = cveCdvPerfil;
	}

	/**
	 * @return the escolaridad
	 */
	public EscolaridadEntity getEscolaridad() {
		return escolaridad;
	}

	/**
	 * @param escolaridad
	 *            the escolaridad to set
	 */
	public void setEscolaridad(EscolaridadEntity escolaridad) {
		this.escolaridad = escolaridad;
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

	/**
	 * @return the cursos
	 */
	public List<CursoEntity> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos
	 *            the cursos to set
	 */
	public void setCursos(List<CursoEntity> cursos) {
		this.cursos = cursos;
	}

	/**
	 * @return the numeroEmpleado
	 */
	public Integer getNumeroEmpleado() {
		return numeroEmpleado;
	}

	/**
	 * @param numeroEmpleado
	 *            the numeroEmpleado to set
	 */
	public void setNumeroEmpleado(Integer numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	/**
	 * @return the expAno
	 */
	public int getExpAno() {
		return expAno;
	}

	/**
	 * @param expAno
	 *            the expAno to set
	 */
	public void setExpAno(int expAno) {
		this.expAno = expAno;
	}

	/**
	 * @return the expMes
	 */
	public int getExpMes() {
		return expMes;
	}

	/**
	 * @param expMes
	 *            the expMes to set
	 */
	public void setExpMes(int expMes) {
		this.expMes = expMes;
	}

}