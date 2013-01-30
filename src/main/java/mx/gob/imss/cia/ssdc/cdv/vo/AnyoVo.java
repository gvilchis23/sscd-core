/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvVO.java
 *
 * Creado:  01/11/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.vo;

/**
 * @author 
 *
 */
public class AnyoVo {
	
	private Integer clave;
	private String anyo;	
	
	/**
	 * 
	 */
	public AnyoVo() {
		super();		
	}
	
	/**
	 * @param clave
	 * @param anyo
	 */
	public AnyoVo(Integer clave, String anyo) {	
		this.clave = clave;
		this.anyo = anyo;
	}



	/**
	 * @return the cveAnio
	 */
	public Integer getClave() {
		return clave;
	}
	/**
	 * @param clave 
	 */
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	/**
	 * @return the anyo
	 */
	public String getAnyo() {
		return anyo;
	}
	/**
	 * @param anyo
	 */
	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

}
