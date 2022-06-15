package State;

public class Start implements StateInterface{

    @Override
    public void action(Context context) {
        System.out.println("Start");
        context.setState(this);
        
    }

}
