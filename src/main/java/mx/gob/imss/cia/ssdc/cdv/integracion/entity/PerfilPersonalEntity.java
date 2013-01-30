/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PerfilPersonalEntity.java
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
// @Table(name = "SSC_PERFIL_PERSONAL", schema = "SSDC_DS")
@Table(name = "SSC_PERFIL_PERSONAL")
public class PerfilPersonalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_perfil_personal")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long cvePerfilPersonal;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_tipo_usuario")
	private TipoUsuarioEntity tipoUsuario;

	@Column(name = "nom_nombreperfil")
	private String nomPerfil;

	/**
	 * @return the cvePerfilPersonal
	 */
	public Long getCvePerfilPersonal() {
		return cvePerfilPersonal;
	}

	/**
	 * @param cvePerfilPersonal
	 *            the cvePerfilPersonal to set
	 */
	public void setCvePerfilPersonal(Long cvePerfilPersonal) {
		this.cvePerfilPersonal = cvePerfilPersonal;
	}

	/**
	 * @return the tipoUsuario
	 */
	public TipoUsuarioEntity getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario
	 *            the tipoUsuario to set
	 */
	public void setTipoUsuario(TipoUsuarioEntity tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * @return the nomPerfil
	 */
	public String getNomPerfil() {
		return nomPerfil;
	}

	/**
	 * @param nomPerfil
	 *            the nomPerfil to set
	 */
	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}

}