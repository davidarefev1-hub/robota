import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("byte: " + Byte.SIZE + " біт [" + Byte.MIN_VALUE + " ... " + Byte.MAX_VALUE + "]");
        System.out.println("short: " + Short.SIZE + " біт [" + Short.MIN_VALUE + " ... " + Short.MAX_VALUE + "]");
        System.out.println("int: " + Integer.SIZE + " біт [" + Integer.MIN_VALUE + " ... " + Integer.MAX_VALUE + "]");
        System.out.println("long: " + Long.SIZE + " біт [" + Long.MIN_VALUE + " ... " + Long.MAX_VALUE + "]");
        System.out.println("float: " + Float.SIZE + " біт [" + Float.MIN_VALUE + " ... " + Float.MAX_VALUE + "]");
        System.out.println("double: " + Double.SIZE + " біт [" + Double.MIN_VALUE + " ... " + Double.MAX_VALUE + "]");
        System.out.println("char: " + Character.SIZE + " біт [" + (int)Character.MIN_VALUE + " ... " + (int)Character.MAX_VALUE + "]");
        System.out.println("boolean: 1 біт [false / true]\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("byte: ");    byte b = Byte.parseByte(sc.nextLine());
        System.out.print("short: ");   short s = Short.parseShort(sc.nextLine());
        System.out.print("int: ");     int i = Integer.parseInt(sc.nextLine());
        System.out.print("long: ");    long l = Long.parseLong(sc.nextLine());
        System.out.print("float: ");   float f = Float.parseFloat(sc.nextLine());
        System.out.print("double: ");  double d = Double.parseDouble(sc.nextLine());
        System.out.print("boolean: "); boolean bool = Boolean.parseBoolean(sc.nextLine());
        System.out.print("char: ");    char c = sc.nextLine().charAt(0);

        System.out.println("Отримано: " + b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d + ", " + bool + ", " + c);
    }
}
