/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaEntity.java
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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "ssc_categoria", schema = "SSDC_DS")
@Table(name = "ssc_categoria")
public class CategoriaEntity implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cve_categoria")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cveCategoria;

    @Column(name = "nom_nombrecategoria")
    private String nomCategoria;

    /**
     * @return the cveCategoria
     */
    public Long getCveCategoria() {
        return cveCategoria;
    }

    /**
     * @param cveCategoria
     *            the cveCategoria to set
     */
    public void setCveCategoria(Long cveCategoria) {
        this.cveCategoria = cveCategoria;
    }

    /**
     * @return the nomCategoria
     */
    public String getNomCategoria() {
        return nomCategoria;
    }

    /**
     * @param cveCategoria
     *            the cveCategoria to set
     */
    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

}
