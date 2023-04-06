class Assig17{
    public static void main( String[] args){
        int a = 65;
        Integer b= new Integer(a);
        byte num= b.byteValue();
        System.out.println("value is "+num);
        // instance to short value
        short k= b.shortValue();
        System.out.println("value is "+k);
        double d= b.doubleValue();
        System.out.println("value is "+d);}
}