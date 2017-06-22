/**
 * This class file was automatically generated by jASN1 v1.8.0 (http://www.openmuc.org)
 */

package de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import org.openmuc.jasn1.ber.BerLength;
import org.openmuc.jasn1.ber.BerTag;
import org.openmuc.jasn1.ber.types.BerInteger;

public class PCStereoPentagonalBiPyramid implements Serializable {

  private static final long serialVersionUID = 1L;

  public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

  public byte[] code = null;
  private BerInteger center = null;
  private BerInteger top = null;
  private BerInteger bottom = null;
  private BerInteger left = null;
  private BerInteger labove = null;
  private BerInteger lbelow = null;
  private BerInteger rabove = null;
  private BerInteger rbelow = null;

  public PCStereoPentagonalBiPyramid() {
  }

  public PCStereoPentagonalBiPyramid(byte[] code) {
    this.code = code;
  }

  public void setCenter(BerInteger center) {
    this.center = center;
  }

  public BerInteger getCenter() {
    return center;
  }

  public void setTop(BerInteger top) {
    this.top = top;
  }

  public BerInteger getTop() {
    return top;
  }

  public void setBottom(BerInteger bottom) {
    this.bottom = bottom;
  }

  public BerInteger getBottom() {
    return bottom;
  }

  public void setLeft(BerInteger left) {
    this.left = left;
  }

  public BerInteger getLeft() {
    return left;
  }

  public void setLabove(BerInteger labove) {
    this.labove = labove;
  }

  public BerInteger getLabove() {
    return labove;
  }

  public void setLbelow(BerInteger lbelow) {
    this.lbelow = lbelow;
  }

  public BerInteger getLbelow() {
    return lbelow;
  }

  public void setRabove(BerInteger rabove) {
    this.rabove = rabove;
  }

  public BerInteger getRabove() {
    return rabove;
  }

  public void setRbelow(BerInteger rbelow) {
    this.rbelow = rbelow;
  }

  public BerInteger getRbelow() {
    return rbelow;
  }

  public int decode(InputStream is) throws IOException {
    return decode(is, true);
  }

  public int decode(InputStream is, boolean withTag) throws IOException {
    int codeLength = 0;
    int subCodeLength = 0;
    BerTag berTag = new BerTag();

    if (withTag) {
      codeLength += tag.decodeAndCheck(is);
    }

    BerLength length = new BerLength();
    codeLength += length.decode(is);

    int totalLength = length.val;
    if (totalLength == -1) {
      subCodeLength += berTag.decode(is);

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
        codeLength += length.decode(is);
        center = new BerInteger();
        subCodeLength += center.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
        codeLength += length.decode(is);
        top = new BerInteger();
        subCodeLength += top.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
        codeLength += length.decode(is);
        bottom = new BerInteger();
        subCodeLength += bottom.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
        codeLength += length.decode(is);
        left = new BerInteger();
        subCodeLength += left.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
        codeLength += length.decode(is);
        labove = new BerInteger();
        subCodeLength += labove.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
        codeLength += length.decode(is);
        lbelow = new BerInteger();
        subCodeLength += lbelow.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
        codeLength += length.decode(is);
        rabove = new BerInteger();
        subCodeLength += rabove.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
        codeLength += length.decode(is);
        rbelow = new BerInteger();
        subCodeLength += rbelow.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }
      int nextByte = is.read();
      if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0 || nextByte != 0) {
        if (nextByte == -1) {
          throw new EOFException("Unexpected end of input stream.");
        }
        throw new IOException("Decoded sequence has wrong end of contents octets");
      }
      codeLength += subCodeLength + 1;
      return codeLength;
    }

    codeLength += totalLength;

    subCodeLength += berTag.decode(is);
    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
      subCodeLength += length.decode(is);
      center = new BerInteger();
      subCodeLength += center.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      subCodeLength += length.decode(is);
      top = new BerInteger();
      subCodeLength += top.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
      subCodeLength += length.decode(is);
      bottom = new BerInteger();
      subCodeLength += bottom.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
      subCodeLength += length.decode(is);
      left = new BerInteger();
      subCodeLength += left.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
      subCodeLength += length.decode(is);
      labove = new BerInteger();
      subCodeLength += labove.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
      subCodeLength += length.decode(is);
      lbelow = new BerInteger();
      subCodeLength += lbelow.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
      subCodeLength += length.decode(is);
      rabove = new BerInteger();
      subCodeLength += rabove.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
      subCodeLength += length.decode(is);
      rbelow = new BerInteger();
      subCodeLength += rbelow.decode(is, true);
      if (subCodeLength == totalLength) {
        return codeLength;
      }
    }
    throw new IOException("Unexpected end of sequence, length tag: " + totalLength
        + ", actual sequence length: " + subCodeLength);

  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    appendAsString(sb, 0);
    return sb.toString();
  }

  public void appendAsString(StringBuilder sb, int indentLevel) {

    sb.append("{");
    sb.append("\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (center != null) {
      sb.append("center: ").append(center);
    } else {
      sb.append("center: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (top != null) {
      sb.append("top: ").append(top);
    } else {
      sb.append("top: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (bottom != null) {
      sb.append("bottom: ").append(bottom);
    } else {
      sb.append("bottom: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (left != null) {
      sb.append("left: ").append(left);
    } else {
      sb.append("left: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (labove != null) {
      sb.append("labove: ").append(labove);
    } else {
      sb.append("labove: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (lbelow != null) {
      sb.append("lbelow: ").append(lbelow);
    } else {
      sb.append("lbelow: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (rabove != null) {
      sb.append("rabove: ").append(rabove);
    } else {
      sb.append("rabove: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (rbelow != null) {
      sb.append("rbelow: ").append(rbelow);
    } else {
      sb.append("rbelow: <empty-required-field>");
    }

    sb.append("\n");
    for (int i = 0; i < indentLevel; i++) {
      sb.append("\t");
    }
    sb.append("}");
  }

}
