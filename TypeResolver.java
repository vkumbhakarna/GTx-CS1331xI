class TypeResolver
{
    public static String Long = "long";
    public static String Int = "int";
    public static String Float = "float";
    public static String Double = "double";
    public static String Char = "char";
    public static String Boolean = "boolean";
    public static String Short = "short";
    public static String Byte = "byte";

    public static void main(String[] args)
    {
        //all true
        TypeResolver resolver = new TypeResolver();
        System.out.println(resolver.getType(1) == TypeResolver.Int); 
        System.out.println(resolver.getType(1f) == TypeResolver.Float); 
        System.out.println(resolver.getType(1.0) == TypeResolver.Double);
        System.out.println(resolver.getType('a') == TypeResolver.Char); 
        System.out.println(resolver.getType((short) 1) == TypeResolver.Short); 
        System.out.println(resolver.getType((long) 1000) == TypeResolver.Long);
        System.out.println(resolver.getType(false) == TypeResolver.Boolean); 
        System.out.println(resolver.getType((byte) 2) == TypeResolver.Byte);
		System.out.println(resolver.getType(4/2 - 2/3 - 1/3 + 1/3));
		System.out.println(resolver.getType(4 - ((int) 5.5 + 2.5) / 1));
    }

    public String getType(int x)
    {
        return TypeResolver.Int;
    }

    public String getType(byte x)
    {
        return TypeResolver.Byte;
    }

    public String getType(float x)
    {
        return TypeResolver.Float;
    }

    public String getType(double x)
    {
        return TypeResolver.Double;
    }

    public String getType(boolean x)
    {
        return TypeResolver.Boolean;
    }

    public String getType(short x)
    {
        return TypeResolver.Short;
    }

    public String getType(long x)
    {
        return TypeResolver.Long;
    }

    public String getType(char x)
    {
        return TypeResolver.Char;
    }
}