public class SeoulKim {

    public static void main(String[] args)
    {
        String[] seoul = {"Jane", "Kim"};
        int idx = -1;
        for(int i = 0; i < seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {
                idx = i;
                break;
            }
                
        }
        StringBuffer buff = new StringBuffer();
        buff.append("김서방은 ");
        buff.append(Integer.toString(idx));
        buff.append("에 있다");
        String answer = buff.toString();
        System.out.print(answer);
    }
    
}
