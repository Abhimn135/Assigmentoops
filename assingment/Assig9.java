class Assig9{
    public static void main( String[] args){
        byte a = 65;
        // byte instance
        Byte b = new Byte(a);
        byte num= b.byteValue();
        System.out.println("value is "+num);
        // instance to short value
        short k= b.shortValue();
        System.out.println("value is "+k);
        double d= b.doubleValue();
        System.out.println("value is "+d);}}
