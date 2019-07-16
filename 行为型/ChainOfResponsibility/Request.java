package ReadAgain.设计模式.行为型.ChainOfResponsibility;

public class Request {
    private RequestType type;
    private String name;
    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
