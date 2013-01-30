/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: LlaveCompuestaUsuarios.java
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
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LlaveCompuestaUsuarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_personal")
	private PersonalEntity personal;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cve_perfil_personal")
	private PerfilPersonalEntity perfil;

	@Deprecated
	public LlaveCompuestaUsuarios() {
	}

	public LlaveCompuestaUsuarios(PersonalEntity personal,
			PerfilPersonalEntity perfil) {
		this.personal = personal;
		this.perfil = perfil;
	}

	/**
	 * @return the personal
	 */
	public PersonalEntity getPersonal() {
		return personal;
	}

	/**
	 * @param personal
	 *            the personal to set
	 */
	public void setPersonal(PersonalEntity personal) {
		this.personal = personal;
	}

	/**
	 * @return the perfilPersonal
	 */
	public PerfilPersonalEntity getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil
	 *            the perfilPersonal to set
	 */
	public void setPerfil(PerfilPersonalEntity perfil) {
		this.perfil = perfil;
	}
}