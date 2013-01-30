/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoVentanillaEntity.java
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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import mx.gob.imss.cia.ssdc.commons.QueriesNombrados;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;

/**
 * @author propietario
 * 
 */
@Entity
@NamedQuery(
		name = QueriesNombrados.TIPO_VENTANILLA_FIND_ALL, 
		query = QueriesNombrados.TIPO_VENTANILLA_FIND_ALL_QUERY
)
@Table(name = "cdc_tipo_ventanilla")
public class TipoVentanillaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cve_tip_ventanilla")
	@GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(generator = "increment")
	private Long cveTipoVentanilla;

	@Column(name = "nom_tip_ventanilla")
	private String nombreTipoVentanilla;

	@Column(name = "num_tiene_cat_serv")
	private int tieneCategoria;

	@Column(name = "num_tiene_cat_requ")
	private String tieneRequisito;

	@Column(name = "num_estado")
	private int status;

	/**
	 * @return the cveTipoVentanilla
	 */
	public Long getCveTipoVentanilla() {
		return cveTipoVentanilla;
	}

	/**
	 * @param cveTipoVentanilla
	 *            the cveTipoVentanilla to set
	 */
	public void setCveTipoVentanilla(Long cveTipoVentanilla) {
		this.cveTipoVentanilla = cveTipoVentanilla;
	}

	/**
	 * @return the nombreTipoVentanilla
	 */
	public String getNombreTipoVentanilla() {
		return nombreTipoVentanilla;
	}

	/**
	 * @param nombreTipoVentanilla
	 *            the nombreTipoVentanilla to set
	 */
	public void setNombreTipoVentanilla(String nombreTipoVentanilla) {
		this.nombreTipoVentanilla = nombreTipoVentanilla;
	}

	/**
	 * @return the tieneCategoria
	 */
	public int getTieneCategoria() {
		return tieneCategoria;
	}

	/**
	 * @param tieneCategoria
	 *            the tieneCategoria to set
	 */
	public void setTieneCategoria(int tieneCategoria) {
		this.tieneCategoria = tieneCategoria;
	}

	/**
	 * @return the tieneRequisito
	 */
	public String getTieneRequisito() {
		return tieneRequisito;
	}

	/**
	 * @param tieneRequisito
	 *            the tieneRequisito to set
	 */
	public void setTieneRequisito(String tieneRequisito) {
		this.tieneRequisito = tieneRequisito;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
