package WriteFile;

import Storage.Storage;

public abstract class BaseWriteHandler {

    private BaseWriteHandler next;

    public void setNext(BaseWriteHandler rh) {
        this.next = rh;
    }

    public BaseWriteHandler getNext() {
        return next;
    }
    
    protected abstract boolean canHandle(String filePath);

    protected abstract void handle(String filePath, Storage storage);
    
    public void process(String filePath, Storage storage) throws Exception{
        if(canHandle(filePath)){
            handle(filePath, storage);
        } else if (getNext() != null){
            getNext().process(filePath, storage);
        } else {
            throw new Exception();
        }
    }

}
