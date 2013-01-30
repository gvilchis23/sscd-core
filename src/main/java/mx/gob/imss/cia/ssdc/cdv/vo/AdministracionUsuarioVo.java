/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AdministracionUsuarioVO.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.vo;

public class AdministracionUsuarioVo {

    private Long clavePersonal;
    private Long clavePerfil;
    private String userName;
    private String nombreUsuario;
    private String perfilUsuario;

    /**
     * @return the clavePersonal
     */
    public Long getClavePersonal() {
        return clavePersonal;
    }

    /**
     * @param clavePersonal
     *            the clavePersonal to set
     */
    public void setClavePersonal(Long clavePersonal) {
        this.clavePersonal = clavePersonal;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario
     *            the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the perfilUsuario
     */
    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    /**
     * @param perfilUsuario
     *            the perfilUsuario to set
     */
    public void setPerfilUsuario(String perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    /**
     * @return the clavePerfil
     */
    public Long getClavePerfil() {
        return clavePerfil;
    }

    /**
     * @param clavePerfil the clavePerfil to set
     */
    public void setClavePerfil(Long clavePerfil) {
        this.clavePerfil = clavePerfil;
    }
}

