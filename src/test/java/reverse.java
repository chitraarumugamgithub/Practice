public class reverse {

    public static void main(String[] args)
    {
        String str = "level";
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb.reverse());
        if(str.equals(sb.reverse())) {
            sb.append(sb);
        }
        System.out.println(sb.length());
    }
}
