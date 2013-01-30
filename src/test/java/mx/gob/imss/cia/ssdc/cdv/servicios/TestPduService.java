/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestPduService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestPduService {
	@Test
	public void debieraExistirPduService() throws Exception {
		assertNotNull(new TestPduService());
	}
}
