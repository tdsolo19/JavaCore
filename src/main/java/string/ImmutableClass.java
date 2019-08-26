package string;

public final class ImmutableClass {
    public final String SOMETHING ;

    public ImmutableClass(String a) {
       this.SOMETHING = a;
    }

    public String getSOMETHING(){
        return SOMETHING;
    }
    ImmutableClass obj = new ImmutableClass("hello");

}
