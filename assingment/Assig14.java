class Assig14{
    public static void main( String[] args){
        short a = 65;
        // byte instance
        Short b = new Short(a);
        byte num= b.byteValue();
        System.out.println("value is "+num);
        // instance to short value
        short k= b.shortValue();
        System.out.println("value is "+k);
        double d= b.doubleValue();}
}