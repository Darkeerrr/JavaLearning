package java_projects;

public class Polyndrom {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcba");
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            char c1 = str.charAt(i);
            newStr.append(c1);
        }
        if (str.toString().equals(newStr.toString())){
            System.out.println("Это полиндром!");
            System.out.println(str + " " + newStr);
        }
        else{
            System.out.println("Это не полиндром!");
            System.out.println(str + " " + newStr);
        }
    }
}
