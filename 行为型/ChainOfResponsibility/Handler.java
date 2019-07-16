package ReadAgain.设计模式.行为型.ChainOfResponsibility;


public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);

}
