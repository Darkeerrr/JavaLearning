package java_projects;

public class SjatieStr {
    public static void main(String[] args) {
        String str1 = "aaaabbbcdd";
        long start = System.currentTimeMillis();
        SjatieStroki(str1);
        System.out.println(System.currentTimeMillis() - start);
}

    private static void SjatieStroki(String str1) {
        StringBuilder str = new StringBuilder();
        char c1 = str1.charAt(0);
        int c2 = 1;
        for (int i = 1; i < str1.length(); i++){
            if (c1 == str1.charAt(i)){
                    c2++;
            }
            else if (str1.charAt(i) != c1){
                str.append(c1).append(c2);
                c1 = str1.charAt(i);
                c2 = 1;    
            }
    }
    str.append(c1).append(c2);
    System.out.println(str);
    }
}