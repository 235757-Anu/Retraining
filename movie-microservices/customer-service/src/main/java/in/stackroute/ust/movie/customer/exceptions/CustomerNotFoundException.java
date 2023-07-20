package in.stackroute.ust.movie.customer.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    private String uri;

    public CustomerNotFoundException(String format,String uri){
        super(format);
        this.uri=uri;
    }
    public String getUri(){
        return uri;
    }
}
