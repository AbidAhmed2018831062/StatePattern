package State;

public class Stop implements StateInterface{
    @Override
    public void action(Context context) {
        System.out.println("Stop");
        context.setState(this);
        
    }
}
