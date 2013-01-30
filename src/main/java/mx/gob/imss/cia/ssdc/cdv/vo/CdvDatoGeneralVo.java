/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvVO.java
 *
 * Creado:  04/11/2011
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
public class CdvDatoGeneralVo {
	
	private Long cveCdv;
    private String delegacion;	
    private String unidad;
	private String ventanilla;
	private String turno;
	Long clave;
	
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
	 * @return the delegacion
	 */
	public String getDelegacion() {
		return delegacion;
	}
	/**
	 * @param delegacion the delegacion to set
	 */
	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}
	/**
	 * @return the unidad
	 */
	public String getUnidad() {
		return unidad;
	}
	/**
	 * @param unidad the unidad to set
	 */
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	/**
	 * @return the ventanilla
	 */
	public String getVentanilla() {
		return ventanilla;
	}
	/**
	 * @param ventanilla the ventanilla to set
	 */
	public void setVentanilla(String ventanilla) {
		this.ventanilla = ventanilla;
	}
	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	/**
	 * @return the clave
	 */
	public Long getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(Long clave) {
		this.clave = clave;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CdvDatoGeneralVo [cveCdv=" + cveCdv + ", delegacion="
				+ delegacion + ", unidad=" + unidad + ", ventanilla="
				+ ventanilla + ", turno=" + turno + ", clave=" + clave + "]";
	}
	

}
