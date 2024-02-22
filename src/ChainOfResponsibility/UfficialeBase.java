package ChainOfResponsibility;

public abstract class UfficialeBase implements Ufficiale{
    protected Ufficiale successore;

    @Override
    public void setSuccessore(Ufficiale successore) {
        this.successore = successore;
    }
}
