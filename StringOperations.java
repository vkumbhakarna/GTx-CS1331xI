public class StringOperations {
    
    //TODO: Start your code after this line
    public static void main(String args[]){ 
    String name = "Viraj";
	System.out.println(name);
    String name1 = name.replace(name.charAt(0),'A');
	String name2 = name1.replace(name1.charAt(name1.length() -1 ),'Z');
    System.out.println( name2 );
    String addr = "www.edx.com";
    System.out.println( addr );
    int strt=addr.indexOf('.',0);
    int end = addr.lastIndexOf('.');
	String newstr ;
	newstr= addr.substring(strt + 1 ,end)+"1331";
    System.out.println( newstr );
    }
    
}
