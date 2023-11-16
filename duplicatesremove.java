public class duplicatesremove{
    public static String DuplicatesRemove(String s){
        String str="";
        boolean flag;
        for(int i=0;i<s.length();i++){
            flag=true;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i))
                flag=false;
            }
            if(flag)
            str=str+s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(DuplicatesRemove("aabbhhiisshheekkjjoosshhii"));
    }
}