class Assig13{
    public static void main( String[] args){
        short a= 80;
        // short value to string
       
        String s=Short.toString(a);
        System.out.println("value is "+s);
        // byte used  to represent short
        int c = Short.BYTES;
        System.out.println("SIZE is "+c);
        // string instance to short instance
        String z ="true";
        Short b= Short.valueOf(z);
        System.out.println("value is "+b);
        }}