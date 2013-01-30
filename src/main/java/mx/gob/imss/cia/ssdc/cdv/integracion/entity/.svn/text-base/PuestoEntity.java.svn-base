/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PuestoEntity.java
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
//@Table(name = "ssc_puesto", schema = "SSDC_DS")
@Table(name = "ssc_puesto")
public class PuestoEntity implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cve_puesto")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long cveCPuesto;

    @Column(name = "nom_nombrepuesto")
    private String nomNombrePuesto;

    /**
     * @return the cveCPuesto
     */
    public Long getCvePuesto() {
        return cveCPuesto;
    }

    /**
     * @param cveCPuesto
     *            the cveCPuesto to set
     */
    public void setCvePuesto(Long cveCPuesto) {
        this.cveCPuesto = cveCPuesto;
    }

    /**
     * @return the nomNombrePuesto
     */
    public String getNomPuesto() {
        return nomNombrePuesto;
    }

    /**
     * @param cveCPuesto
     *            the cveCPuesto to set
     */
    public void setNomPuesto(String nomNombrePuesto) {
        this.nomNombrePuesto = nomNombrePuesto;
    }
}
