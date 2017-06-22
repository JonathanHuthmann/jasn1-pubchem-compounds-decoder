/**
 * This class file was automatically generated by jASN1 v1.8.0 (http://www.openmuc.org)
 */

package de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance;

import java.math.BigInteger;

import org.openmuc.jasn1.ber.types.BerInteger;

public class PCCoordinateType extends BerInteger {

  private static final long serialVersionUID = 1L;

  public PCCoordinateType() {
  }

  public PCCoordinateType(byte[] code) {
    super(code);
  }

  public PCCoordinateType(BigInteger value) {
    super(value);
  }

  public PCCoordinateType(long value) {
    super(value);
  }

}
