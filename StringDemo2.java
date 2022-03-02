class StringDemo2 {
    public static void main(String args[]) {
        String strOb1 = "First String";
        String strob2 = "Second string";
        String strOb3 = strOb1;

        System.out.println("Length of strOb1: " + strOb1.length());

        System.out.println("char at index 3 in strOb1: " +
                strOb1.charAt(3));

        if (strOb1.equals(strob2))
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");

        if (strOb1.equals(strOb3))
            System.out.println("str1 == str3");
        else
            System.out.println("strob1 != strob3");

    }
}