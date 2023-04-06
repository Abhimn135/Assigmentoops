class Assig8{
    public static void main( String[] args){
        byte a= 25;
        // boolean value to string
        String s=String.valueOf(a);
        System.out.println("value is "+s);

        // boolean value to boolean instance
       Boolean abc=new Boolean();
       abc=Boolean.valueOf(a);
        System.out.println(abc);