
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizador2;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Objetos.Puente;
import Objetos.Claves;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico2 extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico2() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico2(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico2(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\006\007\000\002\007\005\000\002\007\003\000" +
    "\002\011\003\000\002\011\003\000\002\012\003\000\002" +
    "\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\004\014\011\001\002\000\006\002\ufffd\014" +
    "\ufffd\001\002\000\006\002\ufffc\014\ufffc\001\002\000\006" +
    "\002\ufffe\014\ufffe\001\002\000\006\002\000\014\011\001" +
    "\002\000\004\002\025\001\002\000\004\031\012\001\002" +
    "\000\006\005\013\007\015\001\002\000\006\027\ufff5\032" +
    "\ufff5\001\002\000\006\027\ufff9\032\ufff9\001\002\000\006" +
    "\027\ufff6\032\ufff6\001\002\000\006\027\021\032\022\001" +
    "\002\000\006\027\ufff8\032\ufff8\001\002\000\006\027\ufff7" +
    "\032\ufff7\001\002\000\006\005\013\007\015\001\002\000" +
    "\004\030\023\001\002\000\006\002\ufffb\014\ufffb\001\002" +
    "\000\006\027\ufffa\032\ufffa\001\002\000\004\002\001\001" +
    "\002\000\006\002\uffff\014\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\024\000\014\002\007\003\006\004\005\006\004\010" +
    "\003\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\025\006\004\010\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\005\016\007\015" +
    "\011\013\012\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\005\016\011\023\012\017\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico2$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico2$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico2$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  
   
        
    int cantidadClaves = 0;
    //public static ArrayList<Variable> arregloVariables = new ArrayList();
    //HtmlClase c = new HtmlClase();
    /*public static LinkedList<AcepErr> TablaErr=new LinkedList<AcepErr>();*/
   // public static consolaE = "";
    public String resultado = "";
    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);
       
        //lista_errores.add(new ErrorT(lexema, fila, columna,"sintactico" ,"Simbolo no esperado"));
        /*AcepErr datos =new AcepErr(lexema, "ERROR SINTACTICO" ,fila,columna,"Simbolo no esperado");
         //   TablaErr.add(datos);
            */
           //  ErrorLS er = new ErrorLS("Sintactico","",lexema,fila,columna);
             //HtmlClase.arrError.add(er);


    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {        
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        
        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

       /*AcepErr datos =new AcepErr(lexema, "ERROR SINTACTICO" ,fila,columna,"Simbolo no esperado Error Fatal");
                   TablaErr.add(datos);
                  */
        //lista_errores.add(new ErrorT(lexema, fila, columna,"sintactico" ,"Simbolo no esperado, Panic Mode"));
    }

    public void semantic(Symbol cur_token, String n) 
    {
        System.out.println("error semantico ");
    }

    public void semantic(String msg, Object obj) {}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico2$actions {


//METODOS Y VARIABLES QUE SOLO PUEDEN SER ACCEDIDAS DENTRO DEL PARSER
int exponente(int exp){
    int resultado= 1;
    for(int i=1; i<exp; i++){
        resultado = resultado *2;
    }
    return resultado;
}


  private final Sintactico2 parser;

  /** Constructor */
  CUP$Sintactico2$actions(Sintactico2 parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico2$do_action_part00000000(
    int                        CUP$Sintactico2$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico2$parser,
    java.util.Stack            CUP$Sintactico2$stack,
    int                        CUP$Sintactico2$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico2$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico2$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico2$parser.done_parsing();
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= CONTENIDO 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CONTENIDO ::= CONTENIDO LISTAC 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("CONTENIDO",1, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CONTENIDO ::= LISTAC 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("CONTENIDO",1, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LISTAC ::= DEFINICION 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("LISTAC",2, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LISTAC ::= FIMPRIMIR 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("LISTAC",2, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FIMPRIMIR ::= imprimir parA LISTAIMP parC puntocoma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).value;
		
                String consola = a +"\n";
                System.err.println("IMPRIMIR: " + consola);
                Puente.variableConsola += consola; 
                
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("FIMPRIMIR",4, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTAIMP ::= LISTAIMP coma OBJETOIMP 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.peek()).value;
		
                    System.err.println("LISTA:: " + a + " "+b);
                    RESULT = a + b;
                
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("LISTAIMP",5, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.elementAt(CUP$Sintactico2$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTAIMP ::= OBJETOIMP 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.peek()).value;
		
                    RESULT=a;
                
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("LISTAIMP",5, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OBJETOIMP ::= VARIABLE 
            {
              String RESULT =null;

              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("OBJETOIMP",7, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OBJETOIMP ::= MENSAJE 
            {
              String RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.peek()).value;
		 RESULT = b; 
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("OBJETOIMP",7, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // MENSAJE ::= cadena 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.peek()).value;
		 System.err.println("entrando cadena> " + a);
                String nuevaCadena = a.replace("\"", " ");
                RESULT = nuevaCadena; 
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("MENSAJE",8, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // MENSAJE ::= digito 
            {
              String RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico2$stack.peek()).value;
		 RESULT =  b; 
              CUP$Sintactico2$result = parser.getSymbolFactory().newSymbol("MENSAJE",8, ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico2$stack.peek()), RESULT);
            }
          return CUP$Sintactico2$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico2$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico2$do_action(
    int                        CUP$Sintactico2$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico2$parser,
    java.util.Stack            CUP$Sintactico2$stack,
    int                        CUP$Sintactico2$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico2$do_action_part00000000(
                               CUP$Sintactico2$act_num,
                               CUP$Sintactico2$parser,
                               CUP$Sintactico2$stack,
                               CUP$Sintactico2$top);
    }
}

}
