public class Test {
    public static void main(String[] args){
        strArr();   // 字符串与字符数组之间转换
        System.out.println();
        strCompare();   // 字符串比较
        System.out.println();
        strFind();    // 字符串查找
    }

    // 字符串与字符数组之间转换
    public static void strArr() {
        String str = "hello";
        char[] arr = {'h','e','l','l','o'};
        System.out.println(new String(arr));   // hello
        System.out.println(new String(arr,1,3));   // ell
        System.out.println(str.charAt(1));      // e
        System.out.println(str.toCharArray());  // hello
    }

    // 字符串比较
    public static void strCompare() {
        // “==”比较引用     “.equal()”比较内容
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("hello".equals(str1));   // true
        System.out.println("hello".equals(str2));   // true
        System.out.println("hello" == str1);        // true
        System.out.println("hello" == str2);        // false
        // .equalsIgnoreCase() 忽略大小写比较
        System.out.println("Hello".equalsIgnoreCase(str1));     // true
        // .compareTo() 比较字符串 ASCII 码值大小
        System.out.println("A".compareTo("a"));     // -32
        System.out.println("ba".compareTo("ab"));   // 1
        System.out.println("a".compareToIgnoreCase("a"));     // 0
    }

    // 字符串查找
    public static void strFind() {
        String str = "asdfggfdsa";
        System.out.println(str.contains("fgh"));    // true
        System.out.println(str.indexOf("d"));       // 2
        System.out.println(str.indexOf("d",5)); // 7
        System.out.println(str.lastIndexOf("d"));   // 7
        // startsWith 和 endWith
        System.out.println(str.startsWith("a"));    // true
        System.out.println(str.endsWith("s"));  // false
    }

}
