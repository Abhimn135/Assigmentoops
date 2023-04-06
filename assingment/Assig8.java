class Assig8{
    public static void main( String[] args){
        byte a= 80;
        // byte  value to string
       
        String s=Byte.toString(a);
        System.out.println("value is "+s);
        // byte value to byte instance
        Byte c = Byte.valueOf(a);
        System.out.println("instance is "+c);
        // string instance to byte instance
        String z ="true";
        Byte b= Byte.valueOf(s);
        System.out.println("value is "+b);
        }}