import java.util.*;
class Days{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Day");
        String day=s.next();
        Week w=new Week();
        w.Check(day);


    }
}