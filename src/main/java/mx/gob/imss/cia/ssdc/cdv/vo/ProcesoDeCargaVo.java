/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PduServiceMock.java
 *
 * Creado:  07/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.vo;

/**
 * @author Equipo de Desarrollo
 *
 */
public class ProcesoDeCargaVo {
	
	private Integer clave;
	private String nombre;
	/**
	 * @return the clave
	 */
	public Integer getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 

}
