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
import org.openmuc.jasn1.ber.types.BerBitString;
import org.openmuc.jasn1.ber.types.BerBoolean;
import org.openmuc.jasn1.ber.types.BerInteger;
import org.openmuc.jasn1.ber.types.BerOctetString;
import org.openmuc.jasn1.ber.types.string.BerVisibleString;

import de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance.type.custom.BerRealString;
import de.uni_leipzig.dbs.jasn1.pubchem.compounds.pcsubstance.type.general.Date;
import de.uni_leipzig.dbs.jasn1.pubchem.util.PropsFilter;

public class PCInfoData implements Serializable {

  private PropsFilter pcInfoFilter = null;

  private boolean dropMe = false;

  private static final long serialVersionUID = 1L;

  public static class Value implements Serializable {

    private static final long serialVersionUID = 1L;

    public byte[] code = null;

    public static class Bvec implements Serializable {

      private static final long serialVersionUID = 1L;

      public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
      public byte[] code = null;
      private List<BerBoolean> seqOf = null;

      public Bvec() {
        seqOf = new ArrayList<>();
      }

      public Bvec(final byte[] code) {
        this.code = code;
      }

      public List<BerBoolean> getBerBoolean() {
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

            BerBoolean element = new BerBoolean();
            subCodeLength += element.decode(is, false);
            seqOf.add(element);
          }
        }
        while (subCodeLength < totalLength) {
          BerBoolean element = new BerBoolean();
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
          Iterator<BerBoolean> it = seqOf.iterator();
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

      public List<BerBoolean> getSeqOf() {
        return seqOf;
      }

      public void setSeqOf(final List<BerBoolean> seqOf) {
        this.seqOf = seqOf;
      }

      public static long getSerialversionuid() {
        return serialVersionUID;
      }

      public static BerTag getTag() {
        return tag;
      }

    }

    public static class Ivec implements Serializable {

      private static final long serialVersionUID = 1L;

      public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
      public byte[] code = null;
      private List<BerInteger> seqOf = null;

      public Ivec() {
        seqOf = new ArrayList<>();
      }

      public Ivec(final byte[] code) {
        this.code = code;
      }

      public List<BerInteger> getBerInteger() {
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

            BerInteger element = new BerInteger();
            subCodeLength += element.decode(is, false);
            seqOf.add(element);
          }
        }
        while (subCodeLength < totalLength) {
          BerInteger element = new BerInteger();
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
          Iterator<BerInteger> it = seqOf.iterator();
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

      public List<BerInteger> getSeqOf() {
        return seqOf;
      }

      public void setSeqOf(final List<BerInteger> seqOf) {
        this.seqOf = seqOf;
      }

      public static long getSerialversionuid() {
        return serialVersionUID;
      }

      public static BerTag getTag() {
        return tag;
      }

    }

    public static class Fvec implements Serializable {

      private static final long serialVersionUID = 1L;

      public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
      public byte[] code = null;
      private List<BerRealString> seqOf = null;

      public Fvec() {
        seqOf = new ArrayList<>();
      }

      public Fvec(final byte[] code) {
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

    public static class Slist implements Serializable {

      private static final long serialVersionUID = 1L;

      public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
      public byte[] code = null;
      private List<BerRealString> seqOf = null;

      public Slist() {
        seqOf = new ArrayList<>();
      }

      public Slist(final byte[] code) {
        this.code = code;
      }

      public List<BerRealString> getBerVisibleString() {
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

    private BerBoolean bval = null;
    private Bvec bvec = null;
    private BerInteger ival = null;
    private Ivec ivec = null;
    private BerRealString fval = null;
    private Fvec fvec = null;
    private BerVisibleString sval = null;
    private Slist slist = null;
    private Date date = null;
    private BerOctetString binary = null;
    private BerBitString bitlist = null;

    public Value() {
    }

    public Value(final byte[] code) {
      this.code = code;
    }

    public void setBval(final BerBoolean bval) {
      this.bval = bval;
    }

    public BerBoolean getBval() {
      return bval;
    }

    public void setBvec(final Bvec bvec) {
      this.bvec = bvec;
    }

    public Bvec getBvec() {
      return bvec;
    }

    public void setIval(final BerInteger ival) {
      this.ival = ival;
    }

    public BerInteger getIval() {
      return ival;
    }

    public void setIvec(final Ivec ivec) {
      this.ivec = ivec;
    }

    public Ivec getIvec() {
      return ivec;
    }

    public void setFval(final BerRealString fval) {
      this.fval = fval;
    }

    public BerRealString getFval() {
      return fval;
    }

    public void setFvec(final Fvec fvec) {
      this.fvec = fvec;
    }

    public Fvec getFvec() {
      return fvec;
    }

    public void setSval(final BerVisibleString sval) {
      this.sval = sval;
    }

    public BerVisibleString getSval() {
      return sval;
    }

    public void setSlist(final Slist slist) {
      this.slist = slist;
    }

    public Slist getSlist() {
      return slist;
    }

    public void setDate(final Date date) {
      this.date = date;
    }

    public Date getDate() {
      return date;
    }

    public void setBinary(final BerOctetString binary) {
      this.binary = binary;
    }

    public BerOctetString getBinary() {
      return binary;
    }

    public void setBitlist(final BerBitString bitlist) {
      this.bitlist = bitlist;
    }

    public BerBitString getBitlist() {
      return bitlist;
    }

    public int decode(final InputStream is) throws IOException {
      return decode(is, null);
    }

    public int decode(final InputStream is, BerTag berTag) throws IOException {

      int codeLength = 0;
      BerTag passedTag = berTag;

      if (berTag == null) {
        berTag = new BerTag();
        codeLength += berTag.decode(is);
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
        codeLength += BerLength.skip(is);
        bval = new BerBoolean();
        codeLength += bval.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
        codeLength += BerLength.skip(is);
        bvec = new Bvec();
        codeLength += bvec.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
        codeLength += BerLength.skip(is);
        ival = new BerInteger();
        codeLength += ival.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
        codeLength += BerLength.skip(is);
        ivec = new Ivec();
        codeLength += ivec.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
        codeLength += BerLength.skip(is);

        fval = new BerRealString();
        codeLength += fval.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
        codeLength += BerLength.skip(is);
        fvec = new Fvec();
        codeLength += fvec.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
        codeLength += BerLength.skip(is);
        sval = new BerVisibleString();
        codeLength += sval.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
        codeLength += BerLength.skip(is);
        slist = new Slist();
        codeLength += slist.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
        codeLength += BerLength.skip(is);
        date = new Date();
        codeLength += date.decode(is, null);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
        codeLength += BerLength.skip(is);
        binary = new BerOctetString();
        codeLength += binary.decode(is, true);
        return codeLength;
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
        codeLength += BerLength.skip(is);
        bitlist = new BerBitString();
        codeLength += bitlist.decode(is, true);
        return codeLength;
      }

      if (passedTag != null) {
        return 0;
      }

      throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      appendAsString(sb, 0);
      return sb.toString();
    }

    public void appendAsString(final StringBuilder sb, final int indentLevel) {

      if (bval != null) {
        sb.append("bval: ").append(bval);
        return;
      }

      if (bvec != null) {
        sb.append("bvec: ");
        bvec.appendAsString(sb, indentLevel + 1);
        return;
      }

      if (ival != null) {
        sb.append("ival: ").append(ival);
        return;
      }

      if (ivec != null) {
        sb.append("ivec: ");
        ivec.appendAsString(sb, indentLevel + 1);
        return;
      }

      if (fval != null) {
        sb.append("fval: ").append(fval);
        return;
      }

      if (fvec != null) {
        sb.append("fvec: ");
        fvec.appendAsString(sb, indentLevel + 1);
        return;
      }

      if (sval != null) {
        sb.append("sval: ").append(sval);
        return;
      }

      if (slist != null) {
        sb.append("slist: ");
        slist.appendAsString(sb, indentLevel + 1);
        return;
      }

      if (date != null) {
        sb.append("date: ");
        date.appendAsString(sb, indentLevel + 1);
        return;
      }

      if (binary != null) {
        sb.append("binary: ").append(binary);
        return;
      }

      if (bitlist != null) {
        sb.append("bitlist: ").append(bitlist);
        return;
      }

      sb.append("<none>");
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

  }

  public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

  public byte[] code = null;
  private PCUrn urn = null;
  private Value value = null;

  public PCInfoData() {
  }

  public PCInfoData(final PropsFilter filter) {
    this.pcInfoFilter = filter;
  }

  public PCInfoData(final byte[] code) {
    this.code = code;
  }

  public void setUrn(final PCUrn urn) {
    this.urn = urn;
  }

  public PCUrn getUrn() {
    return urn;
  }

  public void setValue(final Value value) {
    this.value = value;
  }

  public Value getValue() {
    return value;
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
        urn = new PCUrn();

        subCodeLength += urn.decode(is, true);

        filter();

        subCodeLength += berTag.decode(is);
        if (length.val == -1) {
          is.read();
          berTag.decode(is);
        }
      }
      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
        subCodeLength += length.decode(is);
        value = new Value();
        int choiceDecodeLength = value.decode(is, null);

        if (choiceDecodeLength != 0) {
          subCodeLength += choiceDecodeLength;
          subCodeLength += berTag.decode(is);
        } else {
          value = null;
        }
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
      urn = new PCUrn();
      subCodeLength += urn.decode(is, true);

      filter();

      subCodeLength += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match the mandatory sequence element tag.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      subCodeLength += length.decode(is);

      subCodeLength += value.decode(is, null);
      value = new Value();

      if (subCodeLength == totalLength) {
        return codeLength;
      }
    }
    throw new IOException("Unexpected end of sequence, length tag: " + totalLength
        + ", actual sequence length: " + subCodeLength);

  }

  private void filter() {
    if (pcInfoFilter != null) {
      dropMe = pcInfoFilter.skipProperty(urn.getLabel(), urn.getName());
      if (pcInfoFilter.isSkipMetadata()) {
        urn.setDatatype(null);
        urn.setParameters(null);
        urn.setImplementation(null);
        urn.setVersion(null);
        urn.setSoftware(null);
        urn.setSource(null);
        urn.setRelease(null);
      }
    }
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
    if (urn != null) {
      sb.append("urn: ");
      urn.appendAsString(sb, indentLevel + 1);
    } else {
      sb.append("urn: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (value != null) {
      sb.append("value: ");
      value.appendAsString(sb, indentLevel + 1);
    } else {
      sb.append("value: <empty-required-field>");
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

  public boolean isDropMe() {
    return dropMe;
  }

}
