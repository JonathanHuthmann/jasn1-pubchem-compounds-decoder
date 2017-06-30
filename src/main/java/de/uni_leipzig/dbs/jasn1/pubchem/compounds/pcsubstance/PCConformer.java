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

import de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance.type.custom.BerRealString;

public class PCConformer implements Serializable {

  private static final long serialVersionUID = 1L;

  public static class X implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    public byte[] code = null;
    private List<BerRealString> seqOf = null;

    public X() {
      seqOf = new ArrayList<>();
    }

    public X(final byte[] code) {
      this.code = code;
    }

    public List<BerRealString> getBerReal() {
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

          BerRealString element = new BerRealString();
          subCodeLength += element.decode(is, false);
          seqOf.add(element);
        }
      }
      while (subCodeLength < totalLength) {
        BerRealString element = new BerRealString();
        subCodeLength += element.decode(is, true);
        seqOf.add(element);
      }
      if (subCodeLength != totalLength) {
        throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected "
            + totalLength + " but has " + subCodeLength);

      }
      codeLength += subCodeLength;

      return codeLength;
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
        Iterator<BerRealString> it = seqOf.iterator();
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

    public List<BerRealString> getSeqOf() {
      return seqOf;
    }

    public void setSeqOf(final List<BerRealString> seqOf) {
      this.seqOf = seqOf;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public static BerTag getTag() {
      return tag;
    }

  }

  public static class Y implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    public byte[] code = null;
    private List<BerRealString> seqOf = null;

    public Y() {
      seqOf = new ArrayList<>();
    }

    public Y(final byte[] code) {
      this.code = code;
    }

    public List<BerRealString> getBerReal() {
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

          BerRealString element = new BerRealString();
          element.decode(is, false);
          seqOf.add(element);
        }
      }
      while (subCodeLength < totalLength) {
        BerRealString element = new BerRealString();
        subCodeLength += element.decode(is, true);
        seqOf.add(element);
      }
      if (subCodeLength != totalLength) {
        throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected "
            + totalLength + " but has " + subCodeLength);

      }
      codeLength += subCodeLength;

      return codeLength;
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
        Iterator<BerRealString> it = seqOf.iterator();
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

    public List<BerRealString> getSeqOf() {
      return seqOf;
    }

    public void setSeqOf(final List<BerRealString> seqOf) {
      this.seqOf = seqOf;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public static BerTag getTag() {
      return tag;
    }

  }

  public static class Z implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    public byte[] code = null;
    private List<BerRealString> seqOf = null;

    public Z() {
      seqOf = new ArrayList<>();
    }

    public Z(final byte[] code) {
      this.code = code;
    }

    public List<BerRealString> getBerReal() {
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

          BerRealString element = new BerRealString();
          subCodeLength += element.decode(is, false);
          seqOf.add(element);
        }
      }
      while (subCodeLength < totalLength) {
        BerRealString element = new BerRealString();
        subCodeLength += element.decode(is, true);
        seqOf.add(element);
      }
      if (subCodeLength != totalLength) {
        throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected "
            + totalLength + " but has " + subCodeLength);

      }
      codeLength += subCodeLength;

      return codeLength;
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
        Iterator<BerRealString> it = seqOf.iterator();
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

    public List<BerRealString> getSeqOf() {
      return seqOf;
    }

    public void setSeqOf(final List<BerRealString> seqOf) {
      this.seqOf = seqOf;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    public static BerTag getTag() {
      return tag;
    }

  }

  public static class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    public byte[] code = null;
    private List<PCInfoData> seqOf = null;

    public Data() {
      seqOf = new ArrayList<>();
    }

    public Data(final byte[] code) {
      this.code = code;
    }

    public List<PCInfoData> getPCInfoData() {
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

          PCInfoData element = new PCInfoData();
          subCodeLength += element.decode(is, false);
          if (!element.isDropMe()) {
            seqOf.add(element);
          }
        }
      }
      while (subCodeLength < totalLength) {
        PCInfoData element = new PCInfoData();
        subCodeLength += element.decode(is, true);
        seqOf.add(element);
      }
      if (subCodeLength != totalLength) {
        throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected "
            + totalLength + " but has " + subCodeLength);

      }
      codeLength += subCodeLength;

      return codeLength;
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
        Iterator<PCInfoData> it = seqOf.iterator();
        if (it.hasNext()) {
          it.next().appendAsString(sb, indentLevel + 1);
          while (it.hasNext()) {
            sb.append(",\n");
            for (int i = 0; i < indentLevel + 1; i++) {
              sb.append("\t");
            }
            it.next().appendAsString(sb, indentLevel + 1);
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

    public List<PCInfoData> getSeqOf() {
      return seqOf;
    }

    public void setSeqOf(final List<PCInfoData> seqOf) {
      this.seqOf = seqOf;
    }

    public static BerTag getTag() {
      return tag;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

  }

  public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

  public byte[] code = null;
  private X x = null;
  private Y y = null;
  private Z z = null;
  private PCDrawAnnotations style = null;
  private Data data = null;

  public PCConformer() {
  }

  public PCConformer(final byte[] code) {
    this.code = code;
  }

  public void setX(final X x) {
    this.x = x;
  }

  public X getX() {
    return x;
  }

  public void setY(final Y y) {
    this.y = y;
  }

  public Y getY() {
    return y;
  }

  public void setZ(final Z z) {
    this.z = z;
  }

  public Z getZ() {
    return z;
  }

  public void setStyle(final PCDrawAnnotations style) {
    this.style = style;
  }

  public PCDrawAnnotations getStyle() {
    return style;
  }

  public void setData(final Data data) {
    this.data = data;
  }

  public Data getData() {
    return data;
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

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
        codeLength += length.decode(is);
        x = new X();
        subCodeLength += x.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
        codeLength += length.decode(is);
        y = new Y();
        subCodeLength += y.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
        codeLength += length.decode(is);
        z = new Z();
        subCodeLength += z.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
        codeLength += length.decode(is);
        style = new PCDrawAnnotations();
        subCodeLength += style.decode(is, true);
        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
        codeLength += length.decode(is);
        data = new Data();
        subCodeLength += data.decode(is, true);
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
      x = new X();
      subCodeLength += x.decode(is, true);
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      subCodeLength += length.decode(is);
      y = new Y();
      subCodeLength += y.decode(is, true);
      if (subCodeLength == totalLength) {
        return codeLength;
      }
      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
      subCodeLength += length.decode(is);
      z = new Z();
      subCodeLength += z.decode(is, true);
      if (subCodeLength == totalLength) {
        return codeLength;
      }
      subCodeLength += berTag.decode(is);
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
      subCodeLength += length.decode(is);
      style = new PCDrawAnnotations();
      subCodeLength += style.decode(is, true);
      if (subCodeLength == totalLength) {
        return codeLength;
      }
      subCodeLength += berTag.decode(is);
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
      subCodeLength += length.decode(is);
      data = new Data();
      subCodeLength += data.decode(is, true);
      if (subCodeLength == totalLength) {
        return codeLength;
      }
    }
    throw new IOException("Unexpected end of sequence, length tag: " + totalLength
        + ", actual sequence length: " + subCodeLength);
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
    if (x != null) {
      sb.append("x: ");
      x.appendAsString(sb, indentLevel + 1);
    } else {
      sb.append("x: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (y != null) {
      sb.append("y: ");
      y.appendAsString(sb, indentLevel + 1);
    } else {
      sb.append("y: <empty-required-field>");
    }

    if (z != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("z: ");
      z.appendAsString(sb, indentLevel + 1);
    }

    if (style != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("style: ");
      style.appendAsString(sb, indentLevel + 1);
    }

    if (data != null) {
      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      sb.append("data: ");
      data.appendAsString(sb, indentLevel + 1);
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
