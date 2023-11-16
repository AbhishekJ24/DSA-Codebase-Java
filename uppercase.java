public class uppercase {
    public static String conversion(String s){
        String upper="";
        int len=s.length();
        upper=upper+Character.toUpperCase(s.charAt(0));
        for(int i=1;i<len;i++){
            if(s.charAt(i)==32 && i<len-1 ){
                upper+=" "+Character.toUpperCase(s.charAt(i+1));
                ++i;
            }
            else{
                upper+=s.charAt(i);
            }
        }

        return upper;
    }

    public static void main(String[] args) {
        String s="hello there";
        System.out.println(conversion(s));
    }
}
