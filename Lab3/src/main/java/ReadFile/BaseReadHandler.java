package ReadFile;

public abstract class BaseReadHandler implements ReadHandler {
    
    private ReadHandler next;

    @Override
    public void setNext(ReadHandler rh) {
        this.next = rh;
    }
}
