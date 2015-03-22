package my.sample.validation;


public class Bean {

    @Zero
    private String zero;

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }
}
