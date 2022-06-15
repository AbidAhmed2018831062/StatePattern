package State;

public class State {
    public static void main(String[] args)
    {
        Context cn=new Context();
       StateInterface st=new Start();
       st.action(cn);
       StateInterface st1=new Stop();
       st1.action(cn);
    }
}