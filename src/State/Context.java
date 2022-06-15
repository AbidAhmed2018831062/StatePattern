package State;

public class Context {
    private StateInterface state;
    Context()
    {
        state=null;
    }
    public void setState(StateInterface state)
    {
      this.state=state;
    }
    public StateInterface returnState()
    {
        return this.state;
    }
}
