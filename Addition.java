class Addition
{
    public static void main(String s[])
    {
        int a = 4;
        a -= 10;
        a = -a;
        a = 7 + a;
        System.out.println(" a = " + a );
        a %= a;
        a = a * a - 3 ;
        System.out.println(" a = " + a );
    }
}