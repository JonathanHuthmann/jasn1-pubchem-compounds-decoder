/**
 * This class file was automatically generated by jASN1 v1.8.0 (http://www.openmuc.org)
 */

package de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openmuc.jasn1.ber.BerLength;
import org.openmuc.jasn1.ber.BerTag;
import org.openmuc.jasn1.ber.types.BerInteger;
import org.openmuc.jasn1.ber.types.string.BerVisibleString;

/**
 * MMDB Source Record detailing specific location or part of an MMDB Record
 */
public class PCMMDBSource implements Serializable {

  private static final long serialVersionUID = 1L;

  public static class MoleculeName implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    public byte[] code = null;
    private List<BerVisibleString> seqOf = null;

    public MoleculeName() {
      seqOf = new ArrayList<>();
    }

    public MoleculeName(final byte[] code) {
      this.code = code;
    }

    public List<BerVisibleString> getBerVisibleString() {
      if (seqOf == null) {
        seqOf = new ArrayList<>();
      }
      return seqOf;
    }

    public int decode(final InputStream is) throws IOException {
      return decode(is, true);
    }

    public int decode(final InputStream is, final boolean withTag) throws IOException {
      int codeLength = 0;
      int subCodeLength = 0;
      BerTag berTag = new BerTag();
      if (withTag) {
        codeLength += tag.decodeAndCheck(is);
      }

      BerLength length = new BerLength();
      codeLength += length.decode(is);
      int totalLength = length.val;

      if (length.val == -1) {
        while (true) {
          subCodeLength += berTag.decode(is);

          if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
            int nextByte = is.read();
            if (nextByte != 0) {
              if (nextByte == -1) {
                throw new EOFException("Unexpected end of input stream.");
              }
              throw new IOException("Decoded sequence has wrong end of contents octets");
            }
            codeLength += subCodeLength + 1;
            return codeLength;
          }

          BerVisibleString element = new BerVisibleString();
          subCodeLength += element.decode(is, false);
          seqOf.add(element);
        }
      }
      throw new IOException("Unexpected end of sequence, length tag: " + totalLength
          + " But only indefinite length tag supported");
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      appendAsString(sb, 0);
      return sb.toString();
    }

    public void appendAsString(final StringBuilder sb, final int indentLevel) {

      sb.append("{\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (seqOf == null) {
        sb.append("null");
      } else {
        Iterator<BerVisibleString> it = seqOf.iterator();
        if (it.hasNext()) {
          sb.append(it.next());
          while (it.hasNext()) {
            sb.append(",\n");
            for (int i = 0; i < indentLevel + 1; i++) {
              sb.append("\t");
            }
            sb.append(it.next());
          }
        }
      }

      sb.append("\n");
      for (int i = 0; i < indentLevel; i++) {
        sb.append("\t");
      }
      sb.append("}");
    }

    public byte[] getCode() {
      return code;
    }

    public void setCode(final byte[] code) {
      this.code = code;
    }

    public List<BerVisibleString> getSeqOf() {
      return seqOf;
    }

    public void setSeqOf(final List<BerVisibleString> seqOf) {
      this.seqOf = seqOf;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public static BerTag getTag() {
      return tag;
    }

  }

  public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

  public byte[] code = null;
  private BerInteger mmdbId = null;
  private BerInteger moleculeId = null;
  private MoleculeName moleculeName = null;
  private BerInteger residueId = null;
  private BerVisibleString residueName = null;
  private BerInteger atomId = null;
  private BerVisibleString atomName = null;

  public PCMMDBSource() {
  }

  public PCMMDBSource(final byte[] code) {
    this.code = code;
  }

  public void setMmdbId(final BerInteger mmdbId) {
    this.mmdbId = mmdbId;
  }

  /**
   * @return MMDB Record ID
   */
  public BerInteger getMmdbId() {
    return mmdbId;
  }

  public void setMoleculeId(final BerInteger moleculeId) {
    this.moleculeId = moleculeId;
  }

  /**
   * @return MMDB Molecule ID
   */
  public BerInteger getMoleculeId() {
    return moleculeId;
  }

  public void setMoleculeName(final MoleculeName moleculeName) {
    this.moleculeName = moleculeName;
  }

  /**
   * @return MMDB Molecule Name
   */
  public MoleculeName getMoleculeName() {
    return moleculeName;
  }

  public void setResidueId(final BerInteger residueId) {
    this.residueId = residueId;
  }

  /**
   * @return Residue ID
   */
  public BerInteger getResidueId() {
    return residueId;
  }

  public void setResidueName(final BerVisibleString residueName) {
    this.residueName = residueName;
  }

  /**
   * @return Residue Name
   */
  public BerVisibleString getResidueName() {
    return residueName;
  }

  public void setAtomId(final BerInteger atomId) {
    this.atomId = atomId;
  }

  /**
   * @return Atom ID
   */
  public BerInteger getAtomId() {
    return atomId;
  }

  public void setAtomName(final BerVisibleString atomName) {
    this.atomName = atomName;
  }

  /**
   * @return Atom Name
   */
  public BerVisibleString getAtomName() {
    return atomName;
  }

  public int decode(final InputStream is) throws IOException {
    return decode(is, true);
  }

  public int decode(final InputStream is, final boolean withTag) throws IOException {
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

      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerInteger.tag)) {
        mmdbId = new BerInteger();
        subCodeLength += mmdbId.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerInteger.tag)) {
        moleculeId = new BerInteger();
        subCodeLength += moleculeId.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(MoleculeName.tag)) {
        moleculeName = new MoleculeName();
        subCodeLength += moleculeName.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerInteger.tag)) {
        residueId = new BerInteger();
        subCodeLength += residueId.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerVisibleString.tag)) {
        residueName = new BerVisibleString();
        subCodeLength += residueName.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerInteger.tag)) {
        atomId = new BerInteger();
        subCodeLength += atomId.decode(is, false);
        subCodeLength += berTag.decode(is);
      }
      if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
        int nextByte = is.read();
        if (nextByte != 0) {
          if (nextByte == -1) {
            throw new EOFException("Unexpected end of input stream.");
          }
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        codeLength += subCodeLength + 1;
        return codeLength;
      }
      if (berTag.equals(BerVisibleString.tag)) {
        atomName = new BerVisibleString();
        subCodeLength += atomName.decode(is, false);
        subCodeLength += berTag.decode(is);
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
    throw new IOException("Unexpected end of sequence, length tag: " + totalLength
        + " But only indefinite length tag supported");
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    appendAsString(sb, 0);
    return sb.toString();
  }

  public void appendAsString(final StringBuilder sb, final int indentLevel) {

    sb.append("{");
    sb.append("\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (mmdbId != null) {
      sb.append("mmdbId: ").append(mmdbId);
    } else {
      sb.append("mmdbId: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (moleculeId != null) {
      sb.append("moleculeId: ").append(moleculeId);
    } else {
      sb.append("moleculeId: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (moleculeName != null) {
      sb.append("moleculeName: ");
      moleculeName.appendAsString(sb, indentLevel + 1);
    } else {
      sb.append("moleculeName: <empty-required-field>");
    }

    if (residueId != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("residueId: ").append(residueId);
    }

    if (residueName != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("residueName: ").append(residueName);
    }

    if (atomId != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("atomId: ").append(atomId);
    }

    if (atomName != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("atomName: ").append(atomName);
    }

    sb.append("\n");
    for (int i = 0; i < indentLevel; i++) {
      sb.append("\t");
    }
    sb.append("}");
  }

  public byte[] getCode() {
    return code;
  }

  public void setCode(final byte[] code) {
    this.code = code;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public static BerTag getTag() {
    return tag;
  }

}
