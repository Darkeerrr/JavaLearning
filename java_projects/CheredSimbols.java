// Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package java_projects;

public class CheredSimbols {
    public static void main(String[] args) {
        int n = 100_000;
        char c1 = 'h';
        char c2 = 'e';
        System.out.println("String");
        long start = System.currentTimeMillis();
        alternatingCharStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("StringBuilder");
        start = System.currentTimeMillis();
        alternatingCharSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }
    public static String alternatingCharStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n/2; i++){
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }
    public static String alternatingCharSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/2; i++){
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
