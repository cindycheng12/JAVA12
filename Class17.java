public class Class17 {
    public static void main(String[] args) {
        String str="262904713";
        System.out.println(Short.parseShort(str));
    }
}



//會得到
//Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"262904713" Radix:10
        at java.lang.Short.parseShort(Unknown Source)
        at java.lang.Short.parseShort(Unknown Source)
        at Class17.main(Class17.java:4)
