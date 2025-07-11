package DAY1;

public class size_of_datatype  {
    public static void main(String[] args) {
        System.out.println("Size of Java Primitive Data Types (in bytes):\n");

        System.out.println("byte    : " + (Byte.SIZE / 8) + " byte");
        System.out.println("short   : " + (Short.SIZE / 8) + " bytes");
        System.out.println("char    : " + (Character.SIZE / 8) + " bytes");
        System.out.println("boolean : JVM dependent (usually 1 byte)");
        System.out.println("int     : " + (Integer.SIZE / 8) + " bytes");
        System.out.println("long    : " + (Long.SIZE / 8) + " bytes");
        System.out.println("float   : " + (Float.SIZE / 8) + " bytes");
        System.out.println("double  : " + (Double.SIZE / 8) + " bytes");
    }
}
