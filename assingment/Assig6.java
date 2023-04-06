class Assig1{
    public static void main( String[] args){
        boolean a= true;
        // boolean value to string
        String s=String.valueOf(a);
        System.out.println("value is "+s);

        // boolean value to boolean instance
       Boolean abc=new Boolean();
       abc=Boolean.valueOf(a);
        System.out.println(abc);

        //string value to boolean value

        String value = "TrUe";
  
        boolean result = Boolean.parseBoolean(value);
  
        System.out.println(result);
// string value to boolean instance 
    string k="k";
    Boolean k1=new Boolean();
    k1=Boolean.parseBoolean(k);
       System.out.println(k1"); 
    }
}