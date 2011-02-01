/* The following code was generated by JFlex 1.4.3 on 2/1/11 9:32 AM */

package com.innovatian.idea.powershell.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/1/11 9:32 AM from the specification file
 * <tt>PowerShell.flex</tt>
 */
class PowerShellLexer implements FlexLexer, PowerShellTokenTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\2\0\1\0"+
    "\1\0\1\44\2\0\1\45\1\46\1\6\1\43\1\53\1\42\1\35"+
    "\1\5\12\0\1\55\1\54\1\40\1\36\1\37\34\0\1\47\1\4"+
    "\1\50\1\56\2\0\1\15\1\7\1\17\1\24\1\10\1\27\1\11"+
    "\1\21\1\12\1\0\1\16\1\25\1\33\1\13\1\22\1\32\1\57"+
    "\1\14\1\26\1\20\1\23\1\0\1\34\1\30\1\31\1\0\1\51"+
    "\1\0\1\52\1\41\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\0\1\3\1\4\14\0\1\5"+
    "\1\6\1\7\1\10\1\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\0\1\2\5\0\1\26\1\27\7\0\1\30"+
    "\7\0\1\31\1\32\1\33\1\34\1\35\13\0\1\36"+
    "\6\0\1\37\6\0\1\40\4\0\1\41\1\42\1\43"+
    "\6\0\1\44\1\0\1\45\2\0\1\46\10\0\1\47"+
    "\1\0\1\50\3\0\1\51\1\52\3\0\1\53\2\0"+
    "\1\54\7\0\1\55\1\56\1\57\1\60\3\0\1\61"+
    "\1\0\1\62\4\0\1\63\1\64\1\65\1\66\4\0"+
    "\1\67\1\0\1\70\3\0\1\71\1\72\2\0\1\73"+
    "\1\0\1\74\1\75\5\0\1\76\1\77\20\0\1\100"+
    "\1\0\1\101\1\102\1\0\1\103\1\0\1\104\7\0"+
    "\1\105\1\106\13\0\1\107\1\0\1\110\1\0\1\111"+
    "\1\0\1\112\5\0\1\113\12\0\1\114\1\115\1\116"+
    "\6\0\1\117\1\0\1\120\7\0\1\121\1\0\1\122"+
    "\2\0\1\123\1\0\1\124\1\0\1\125\1\0\1\126"+
    "\1\0\1\127\1\130\2\0\1\131\1\132\4\0\1\133"+
    "\1\0\1\134\1\135";

  private static int [] zzUnpackAction() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\140\0\140\0\300\0\360"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\140\0\140\0\140\0\140\0\140\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\u0420\0\u0450\0\u0480\0\u04b0"+
    "\0\u04e0\0\u0510\0\u0540\0\140\0\140\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\140\0\u06c0\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\140\0\140\0\140"+
    "\0\140\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\140\0\u0a50\0\u0a80\0\u0ab0"+
    "\0\u0ae0\0\u0b10\0\u0b40\0\140\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\140\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\140"+
    "\0\140\0\140\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40"+
    "\0\u0e70\0\u0ea0\0\140\0\u0ed0\0\u0f00\0\140\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\140\0\u10b0"+
    "\0\140\0\u10e0\0\u1110\0\u1140\0\u1170\0\140\0\u11a0\0\u11d0"+
    "\0\u1200\0\140\0\u1230\0\u1260\0\140\0\u1290\0\u12c0\0\u12f0"+
    "\0\u1320\0\u1350\0\u1380\0\u13b0\0\140\0\140\0\140\0\140"+
    "\0\u13e0\0\u1410\0\u1440\0\140\0\u1470\0\140\0\u14a0\0\u14d0"+
    "\0\u1500\0\u1530\0\140\0\140\0\140\0\140\0\u1560\0\u1590"+
    "\0\u15c0\0\u15f0\0\140\0\u1620\0\140\0\u1650\0\u1680\0\u16b0"+
    "\0\140\0\140\0\u16e0\0\u1710\0\140\0\u1740\0\140\0\140"+
    "\0\u1770\0\u17a0\0\u17d0\0\u1800\0\u1830\0\140\0\140\0\u1860"+
    "\0\u1890\0\u18c0\0\u18f0\0\u1920\0\u1950\0\u1980\0\u19b0\0\u19e0"+
    "\0\u1a10\0\u1a40\0\u1a70\0\u1aa0\0\u1ad0\0\u1b00\0\u1b30\0\140"+
    "\0\u1b60\0\140\0\140\0\u1b90\0\140\0\u1bc0\0\140\0\u1bf0"+
    "\0\u1c20\0\u1c50\0\u1c80\0\u1cb0\0\u1ce0\0\u1d10\0\140\0\140"+
    "\0\u1d40\0\u1d70\0\u1da0\0\u1dd0\0\u1e00\0\u1e30\0\u1e60\0\u1e90"+
    "\0\u1ec0\0\u1ef0\0\u1f20\0\140\0\u1f50\0\140\0\u1f80\0\140"+
    "\0\u1fb0\0\140\0\u1fe0\0\u2010\0\u2040\0\u2070\0\u20a0\0\140"+
    "\0\u20d0\0\u2100\0\u2130\0\u2160\0\u2190\0\u21c0\0\u21f0\0\u2220"+
    "\0\u2250\0\u2280\0\140\0\140\0\140\0\u22b0\0\u22e0\0\u2310"+
    "\0\u2340\0\u2370\0\u23a0\0\140\0\u23d0\0\140\0\u2400\0\u2430"+
    "\0\u2460\0\u2490\0\u24c0\0\u24f0\0\u2520\0\140\0\u2550\0\140"+
    "\0\u2580\0\u25b0\0\140\0\u25e0\0\140\0\u2610\0\140\0\u2640"+
    "\0\140\0\u2670\0\140\0\140\0\u26a0\0\u26d0\0\140\0\140"+
    "\0\u2700\0\u2730\0\u2760\0\u2790\0\140\0\u27c0\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\2\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\0\1\11\1\0\1\12\2\0\1\13\1\14\2\0"+
    "\1\15\1\16\1\0\1\17\1\20\2\0\1\21\1\0"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\2\0\3\2\1\45\134\0\1\46"+
    "\1\3\65\0\1\47\3\0\1\50\56\0\1\51\11\0"+
    "\1\52\2\0\1\53\42\0\1\54\13\0\1\55\40\0"+
    "\1\56\64\0\1\57\4\0\1\60\51\0\1\61\4\0"+
    "\1\62\51\0\1\63\61\0\1\64\4\0\1\65\71\0"+
    "\1\66\35\0\1\67\7\0\1\70\1\71\50\0\1\72"+
    "\1\73\63\0\1\74\73\0\1\75\60\0\1\76\57\0"+
    "\1\77\57\0\1\100\57\0\1\101\31\0\1\102\1\103"+
    "\1\104\1\105\1\106\1\107\1\0\1\110\5\0\1\111"+
    "\5\0\1\112\25\0\2\2\57\0\1\3\66\0\1\113"+
    "\56\0\1\114\73\0\1\115\61\0\1\116\43\0\1\117"+
    "\65\0\1\120\57\0\1\121\52\0\1\122\61\0\1\123"+
    "\13\0\1\124\42\0\1\125\63\0\1\126\57\0\1\127"+
    "\51\0\1\130\60\0\1\131\11\0\1\132\46\0\1\133"+
    "\56\0\1\134\66\0\1\135\51\0\1\136\55\0\1\137"+
    "\102\0\1\140\101\0\1\141\10\0\1\142\7\0\1\142"+
    "\47\0\1\143\1\144\1\0\1\145\1\146\2\0\1\147"+
    "\5\0\1\150\1\151\4\0\1\152\34\0\1\153\11\0"+
    "\1\154\45\0\1\155\75\0\1\156\41\0\1\157\1\160"+
    "\1\0\1\161\1\162\2\0\1\163\2\0\1\164\2\0"+
    "\1\165\5\0\1\166\34\0\1\167\1\0\1\170\5\0"+
    "\1\171\54\0\1\172\54\0\1\173\62\0\1\174\52\0"+
    "\1\175\67\0\1\176\62\0\1\177\53\0\1\200\60\0"+
    "\1\201\71\0\1\202\47\0\1\203\47\0\1\204\62\0"+
    "\1\205\62\0\1\206\54\0\1\207\62\0\1\210\56\0"+
    "\1\211\57\0\1\212\55\0\1\213\67\0\1\214\111\0"+
    "\1\215\10\0\1\216\7\0\1\217\47\0\1\220\11\0"+
    "\1\221\45\0\1\222\71\0\1\223\45\0\1\224\1\0"+
    "\1\225\5\0\1\226\52\0\1\227\61\0\1\230\62\0"+
    "\1\231\71\0\1\232\104\0\1\233\10\0\1\234\7\0"+
    "\1\235\47\0\1\236\11\0\1\237\45\0\1\240\71\0"+
    "\1\241\50\0\1\242\54\0\1\243\1\0\1\244\5\0"+
    "\1\245\54\0\1\246\60\0\1\247\61\0\1\250\52\0"+
    "\1\251\62\0\1\252\53\0\1\253\61\0\1\254\64\0"+
    "\1\255\50\0\1\256\101\0\1\257\50\0\1\260\51\0"+
    "\1\261\65\0\1\262\42\0\1\263\67\0\1\264\47\0"+
    "\1\265\102\0\1\266\34\0\1\267\67\0\1\270\71\0"+
    "\1\271\40\0\1\272\62\0\1\273\63\0\1\274\55\0"+
    "\1\275\56\0\1\276\5\0\1\277\5\0\1\300\51\0"+
    "\1\301\52\0\1\302\71\0\1\303\40\0\1\304\64\0"+
    "\1\305\55\0\1\306\61\0\1\307\47\0\1\310\66\0"+
    "\1\311\67\0\1\312\43\0\1\313\57\0\1\314\65\0"+
    "\1\315\63\0\1\316\46\0\1\317\55\0\1\320\73\0"+
    "\1\321\50\0\1\322\5\0\1\323\5\0\1\324\51\0"+
    "\1\325\52\0\1\326\47\0\1\327\67\0\1\330\56\0"+
    "\1\331\62\0\1\332\47\0\1\333\62\0\1\334\57\0"+
    "\1\335\61\0\1\336\5\0\1\337\5\0\1\340\51\0"+
    "\1\341\52\0\1\342\54\0\1\343\52\0\1\344\66\0"+
    "\1\345\61\0\1\346\61\0\1\347\65\0\1\350\50\0"+
    "\1\351\63\0\1\352\53\0\1\353\47\0\1\354\62\0"+
    "\1\355\57\0\1\356\57\0\1\357\63\0\1\360\51\0"+
    "\1\361\62\0\1\362\61\0\1\363\56\0\1\364\62\0"+
    "\1\365\47\0\1\366\62\0\1\367\57\0\1\370\57\0"+
    "\1\371\54\0\1\372\66\0\1\373\46\0\1\374\62\0"+
    "\1\375\57\0\1\376\62\0\1\377\61\0\1\u0100\56\0"+
    "\1\u0101\52\0\1\u0102\65\0\1\u0103\47\0\1\u0104\66\0"+
    "\1\u0105\50\0\1\u0106\62\0\1\u0107\62\0\1\u0108\61\0"+
    "\1\u0109\56\0\1\u010a\52\0\1\u010b\60\0\1\u010c\64\0"+
    "\1\u010d\47\0\1\u010e\66\0\1\u010f\50\0\1\u0110\62\0"+
    "\1\u0111\61\0\1\u0112\63\0\1\u0113\56\0\1\u0114\47\0"+
    "\1\u0115\66\0\1\u0116\50\0\1\u0117\62\0\1\u0118\72\0"+
    "\1\u0119\46\0\1\u011a\63\0\1\u011b\64\0\1\u011c\43\0"+
    "\1\u011d\62\0\1\u011e\63\0\1\u011f\64\0\1\u0120\43\0"+
    "\1\u0121\60\0\1\u0122\56\0\1\u0123\60\0\1\u0124\72\0"+
    "\1\u0125\44\0\1\u0126\72\0\1\u0127\57\0\1\u0128\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10224];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\1\0\2\11\14\0\4\1\1\0"+
    "\1\1\14\11\1\0\1\1\5\0\2\11\7\0\1\11"+
    "\7\0\1\1\4\11\13\0\1\11\6\0\1\11\6\0"+
    "\1\11\4\0\3\11\6\0\1\1\1\0\1\11\2\0"+
    "\1\11\10\0\1\11\1\0\1\11\3\0\1\1\1\11"+
    "\3\0\1\11\2\0\1\11\7\0\4\11\3\0\1\11"+
    "\1\0\1\11\4\0\4\11\4\0\1\11\1\0\1\11"+
    "\3\0\2\11\2\0\1\11\1\0\2\11\5\0\2\11"+
    "\20\0\1\11\1\0\2\11\1\0\1\11\1\0\1\11"+
    "\7\0\2\11\13\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\5\0\1\11\12\0\3\11\6\0\1\11"+
    "\1\0\1\11\7\0\1\11\1\0\1\11\2\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\2\11"+
    "\2\0\2\11\4\0\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[296];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  PowerShellLexer(java.io.Reader in) {
      this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  PowerShellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 42: 
          { return EXIT;
          }
        case 94: break;
        case 56: 
          { return COCLT;
          }
        case 95: break;
        case 31: 
          { return TRY;
          }
        case 96: break;
        case 12: 
          { return LPAREN;
          }
        case 97: break;
        case 27: 
          { return GE;
          }
        case 98: break;
        case 40: 
          { return COLT;
          }
        case 99: break;
        case 63: 
          { return WHILE;
          }
        case 100: break;
        case 17: 
          { return RCURLY;
          }
        case 101: break;
        case 65: 
          { return ELSEIF;
          }
        case 102: break;
        case 88: 
          { return COICONTAINS;
          }
        case 103: break;
        case 20: 
          { return COLON;
          }
        case 104: break;
        case 58: 
          { return BREAK;
          }
        case 105: break;
        case 26: 
          { return EQ;
          }
        case 106: break;
        case 86: 
          { return COCONTAINS;
          }
        case 107: break;
        case 30: 
          { return END;
          }
        case 108: break;
        case 53: 
          { return COCGT;
          }
        case 109: break;
        case 50: 
          { return COILT;
          }
        case 110: break;
        case 75: 
          { return COIMATCH;
          }
        case 111: break;
        case 16: 
          { return LCURLY;
          }
        case 112: break;
        case 66: 
          { return RETURN;
          }
        case 113: break;
        case 2: 
          { return WS;
          }
        case 114: break;
        case 68: 
          { return FILTER;
          }
        case 115: break;
        case 36: 
          { return COIS;
          }
        case 116: break;
        case 92: 
          { return COINOTCONTAINS;
          }
        case 117: break;
        case 89: 
          { return COCNOTMATCH;
          }
        case 118: break;
        case 76: 
          { return COCMATCH;
          }
        case 119: break;
        case 59: 
          { return CATCH;
          }
        case 120: break;
        case 18: 
          { return COMMA;
          }
        case 121: break;
        case 47: 
          { return COIGT;
          }
        case 122: break;
        case 4: 
          { return MULT;
          }
        case 123: break;
        case 44: 
          { return DATA;
          }
        case 124: break;
        case 11: 
          { return MOD;
          }
        case 125: break;
        case 74: 
          { return PROCESS;
          }
        case 126: break;
        case 64: 
          { return COLIKE;
          }
        case 127: break;
        case 3: 
          { return DIV;
          }
        case 128: break;
        case 54: 
          { return COCNE;
          }
        case 129: break;
        case 10: 
          { return PLUS;
          }
        case 130: break;
        case 37: 
          { return CONE;
          }
        case 131: break;
        case 55: 
          { return COCLE;
          }
        case 132: break;
        case 8: 
          { return LT;
          }
        case 133: break;
        case 67: 
          { return SWITCH;
          }
        case 134: break;
        case 72: 
          { return COMATCH;
          }
        case 135: break;
        case 39: 
          { return COLE;
          }
        case 136: break;
        case 5: 
          { return DOT;
          }
        case 137: break;
        case 24: 
          { return DO;
          }
        case 138: break;
        case 22: 
          { return IN;
          }
        case 139: break;
        case 19: 
          { return SEMI;
          }
        case 140: break;
        case 48: 
          { return COINE;
          }
        case 141: break;
        case 87: 
          { return COINOTMATCH;
          }
        case 142: break;
        case 38: 
          { return COAS;
          }
        case 143: break;
        case 62: 
          { return PARAM;
          }
        case 144: break;
        case 83: 
          { return CONOTMATCH;
          }
        case 145: break;
        case 79: 
          { return CONOTLIKE;
          }
        case 146: break;
        case 52: 
          { return COCGE;
          }
        case 147: break;
        case 49: 
          { return COILE;
          }
        case 148: break;
        case 7: 
          { return GT;
          }
        case 149: break;
        case 15: 
          { return RBRACK;
          }
        case 150: break;
        case 35: 
          { return COGE;
          }
        case 151: break;
        case 91: 
          { return CONOTCONTAINS;
          }
        case 152: break;
        case 77: 
          { return CONTINUE;
          }
        case 153: break;
        case 80: 
          { return COREPLACE;
          }
        case 154: break;
        case 81: 
          { return COINOTLIKE;
          }
        case 155: break;
        case 51: 
          { return COCEQ;
          }
        case 156: break;
        case 6: 
          { return ASSIGN;
          }
        case 157: break;
        case 69: 
          { return COILIKE;
          }
        case 158: break;
        case 1: 
          { return NEWLINE;
          }
        case 159: break;
        case 14: 
          { return LBRACK;
          }
        case 160: break;
        case 33: 
          { return ELLIPSIS;
          }
        case 161: break;
        case 34: 
          { return COEQ;
          }
        case 162: break;
        case 46: 
          { return COIGE;
          }
        case 163: break;
        case 82: 
          { return COIREPLACE;
          }
        case 164: break;
        case 78: 
          { return FUNCTION;
          }
        case 165: break;
        case 41: 
          { return ELSE;
          }
        case 166: break;
        case 60: 
          { return THROW;
          }
        case 167: break;
        case 93: 
          { return COCNOTCONTAINS;
          }
        case 168: break;
        case 23: 
          { return IF;
          }
        case 169: break;
        case 29: 
          { return NE;
          }
        case 170: break;
        case 73: 
          { return FINALLY;
          }
        case 171: break;
        case 61: 
          { return UNTIL;
          }
        case 172: break;
        case 45: 
          { return COIEQ;
          }
        case 173: break;
        case 84: 
          { return COCNOTLIKE;
          }
        case 174: break;
        case 9: 
          { return MINUS;
          }
        case 175: break;
        case 28: 
          { return LE;
          }
        case 176: break;
        case 32: 
          { return FOR;
          }
        case 177: break;
        case 25: 
          { return RANGE;
          }
        case 178: break;
        case 90: 
          { return COCCONTAINS;
          }
        case 179: break;
        case 21: 
          { return EXP;
          }
        case 180: break;
        case 13: 
          { return RPAREN;
          }
        case 181: break;
        case 71: 
          { return COCLIKE;
          }
        case 182: break;
        case 57: 
          { return BEGIN;
          }
        case 183: break;
        case 43: 
          { return TRAP;
          }
        case 184: break;
        case 85: 
          { return COCREPLACE;
          }
        case 185: break;
        case 70: 
          { return COISNOT;
          }
        case 186: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
