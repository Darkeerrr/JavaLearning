package java_projects;

public class longerString {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fligth", "strong"}; // fl
        String prefix = strs[0];
        prefix = getPrefix(strs, prefix);
        System.out.println(prefix);
    }

    private static String getPrefix (String[] strs, String prefix) {
        for (int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if (prefix.isEmpty()) break;
        }
        return prefix;
    }
    
}
