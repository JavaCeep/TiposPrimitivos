/*
 * Clasificación de los diferentes Tipos Primitivos
 */
package test;

/**
 *
 * @author SantiagoMrv
 */
public class TiposPrimitivos {
    
    /*
    
    * Enteros:
        - byte: 8 bits (-128 a 127) | Byte.MIN_VALUE - Byte.MAX_VALUE
        - short: 16 bits (-32768 a 32767) | Short.MIN_VALUE - Short.MAX_VALUE
        - int: 32 bits |Integer.MIN_VALUE - Integer.MAX_VALUE
        - long: 64 bitd | Long.MIN_VALUE - Long.MAX_VALUE        
    
    * Decimales:
        - float: 32 bits (literal f)| Float.MIN_VALUE - Float.MAX_VALUE
        - double: 64 bits (Literal d)| Double.MIN_VALUE - Double.MAX_VALUE
    
    * Caracter:
        - char: 16 bits | Char.MIN_VALUE - Char.MAX_VALUE
    
    */
    
    public static void main(String[] args) {
        
        Byte enteroByte = 5;
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("Valor mínimo del tipo byte: " +  Byte.MIN_VALUE);
        System.out.println("Valor máximo del tipo byte: " +  Byte.MAX_VALUE);
        
        Short enteroShort = 10000;
        System.out.println("enteroShort = " + enteroShort);
        System.out.println("Valor mínimo del tipo short: " +  Short.MIN_VALUE);
        System.out.println("Valor máximo del tipo short: " +  Short.MAX_VALUE);
        
        Integer enteroInt = 35000;
        System.out.println("enteroInteger= " + enteroInt);
        System.out.println("Valor mínimo del tipo byte: " +  Integer.MIN_VALUE);
        System.out.println("Valor máximo del tipo byte: " +  Integer.MAX_VALUE);

        Long enteroLong = 6300000000l;
        System.out.println("enteroLong= " + enteroLong);
        System.out.println("Valor mínimo del tipo long: " +  Long.MIN_VALUE);
        System.out.println("Valor máximo del tipo long: " +  Long.MAX_VALUE);
        
        Float decimalFloat = 10.0F;
        System.out.println("decimalFloat= " + decimalFloat);
        System.out.println("Valor mínimo del tipo float: " +  Float.MIN_VALUE);
        System.out.println("Valor máximo del tipo float: " +  Float.MAX_VALUE);
        
        Double decimalDoble = 2324.0323204;
        System.out.println("decimalDoble= " + decimalDoble);
        System.out.println("Valor mínimo del tipo double: " +  Double.MIN_VALUE);
        System.out.println("Valor máximo del tipo double: " +  Double.MAX_VALUE);
        
        char miCaracter = '!';
        System.out.println("miCaracter = " + miCaracter);
        
        char segundoCaracter = '\u0021';
        System.out.println("segundoCaracter = " + segundoCaracter);
        
        char tercerCaracter = 33;
        System.out.println("tercerCaracter = " + tercerCaracter);
                       
    }
    
}
