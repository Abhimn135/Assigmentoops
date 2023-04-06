class Assig18{
    public static void main( String[] args){
        int a=10;
        Integer i= new Integer(a);
        int maxx= i.MAX_VALUE;
        int minn= i.MIN_VALUE;
        int summ= i.sum(maxx,minn);
        System.out.println("maxx value is "+maxx);
        System.out.println("minn value is "+minn);
        System.out.println("summ  is "+summ);}}