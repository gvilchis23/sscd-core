/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CatalogoVo.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.vo;

public class CatalogoVo {

	private Long id;
	private Long idForaneo;
	private String nombreCatalogo;
	private String nombreServicio;
	private String tipoVentanilla;

	// Para la vista de unidades
	private String nombre;
	private String tipoUnidad;
	private String delegacion;

	private Long cveDelegacion;
	private Long cveTipoUnidad;
	private Long cveEntidadFed;
	private String domCalle;
	private Integer domNumero;
	private String domColonia;
	private String domMunicipio;
	private String numTelefono;
	private String referencia;

	/**
	 * @return the nombreCatalogo
	 */
	public String getNombreCatalogo() {
		return nombreCatalogo;
	}

	/**
	 * @param nombreCatalogo
	 *            the nombreCatalogo to set
	 */
	public void setNombreCatalogo(String nombreCatalogo) {
		this.nombreCatalogo = nombreCatalogo;
	}

	/**
	 * @return the tipoVentanilla
	 */
	public String getTipoVentanilla() {
		return tipoVentanilla;
	}

	/**
	 * @param tipoVentanilla
	 *            the tipoVentanilla to set
	 */
	public void setTipoVentanilla(String tipoVentanilla) {
		this.tipoVentanilla = tipoVentanilla;
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
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the idForaneo
	 */
	public Long getIdForaneo() {
		return idForaneo;
	}

	/**
	 * @param idForaneo
	 *            the idForaneo to set
	 */
	public void setIdForaneo(Long idForaneo) {
		this.idForaneo = idForaneo;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the cveTipoUnidad
	 */
	public Long getCveTipoUnidad() {
		return cveTipoUnidad;
	}

	/**
	 * @param cveTipoUnidad
	 *            the cveTipoUnidad to set
	 */
	public void setCveTipoUnidad(Long cveTipoUnidad) {
		this.cveTipoUnidad = cveTipoUnidad;
	}

	/**
	 * @return the cveDelegacion
	 */
	public Long getCveDelegacion() {
		return cveDelegacion;
	}

	/**
	 * @param cveDelegacion
	 *            the cveDelegacion to set
	 */
	public void setCveDelegacion(Long cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	/**
	 * @return the cveEntidadFed
	 */
	public Long getCveEntidadFed() {
		return cveEntidadFed;
	}

	/**
	 * @param cveEntidadFed
	 *            the cveEntidadFed to set
	 */
	public void setCveEntidadFed(Long cveEntidadFed) {
		this.cveEntidadFed = cveEntidadFed;
	}

	/**
	 * @return the domCalle
	 */
	public String getDomCalle() {
		return domCalle;
	}

	/**
	 * @param domCalle
	 *            the domCalle to set
	 */
	public void setDomCalle(String domCalle) {
		this.domCalle = domCalle;
	}

	/**
	 * @return the domNumero
	 */
	public Integer getDomNumero() {
		return domNumero;
	}

	/**
	 * @param domNumero
	 *            the domNumero to set
	 */
	public void setDomNumero(Integer domNumero) {
		this.domNumero = domNumero;
	}

	/**
	 * @return the domColonia
	 */
	public String getDomColonia() {
		return domColonia;
	}

	/**
	 * @param domColonia
	 *            the domColonia to set
	 */
	public void setDomColonia(String domColonia) {
		this.domColonia = domColonia;
	}

	/**
	 * @return the domMunicipio
	 */
	public String getDomMunicipio() {
		return domMunicipio;
	}

	/**
	 * @param domMunicipio
	 *            the domMunicipio to set
	 */
	public void setDomMunicipio(String domMunicipio) {
		this.domMunicipio = domMunicipio;
	}

	/**
	 * @return the numTelefono
	 */
	public String getNumTelefono() {
		return numTelefono;
	}

	/**
	 * @param numTelefono
	 *            the numTelefono to set
	 */
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

}
