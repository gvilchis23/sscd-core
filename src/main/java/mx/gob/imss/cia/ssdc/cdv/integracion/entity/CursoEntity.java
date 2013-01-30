/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CursoEntity.java
 *
 * Creado:  Oct 13, 2011
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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author propietario
 * 
 */
@Entity
@Table(name = "CDC_CURSO")
public class CursoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_curso")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveCurso;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tip_ventanilla")
	private TipoVentanillaEntity tipoVentanilla;

	@Column(name = "nom_curso")
	private String nombreCurso;

	@ManyToMany(cascade = CascadeType.ALL, 
				fetch = FetchType.EAGER, 
				mappedBy = "cursos")
	private List<CdtPerfilPersonalEntity> cdtPerfilPersonal;

	/**
	 * @return the cveCurso
	 */
	public Long getCveCurso() {
		return cveCurso;
	}

	/**
	 * @param cveCurso
	 *            the cveCurso to set
	 */
	public void setCveCurso(Long cveCurso) {
		this.cveCurso = cveCurso;
	}

	/**
	 * @return the tipoVentanilla
	 */
	public TipoVentanillaEntity getTipoVentanilla() {
		return tipoVentanilla;
	}

	/**
	 * @param tipoVentanilla
	 *            the tipoVentanilla to set
	 */
	public void setTipoVentanilla(TipoVentanillaEntity tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
	}

	/**
	 * @return the nombreCurso
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}

	/**
	 * @param nombreCurso
	 *            the nombreCurso to set
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	/**
	 * @return the cdtPerfilPersonal
	 */
	public List<CdtPerfilPersonalEntity> getCdtPerfilPersonal() {
		return cdtPerfilPersonal;
	}

	/**
	 * @param cdtPerfilPersonal
	 *            the cdtPerfilPersonal to set
	 */
	public void setCdtPerfilPersonal(
			List<CdtPerfilPersonalEntity> cdtPerfilPersonal) {
		this.cdtPerfilPersonal = cdtPerfilPersonal;
	}

}
