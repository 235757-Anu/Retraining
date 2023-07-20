class Operators {
    int s,d,q,p;
    //int a,b;
    void Add(int a,int b){
        s=a+b;
        System.out.println("Sum of "+a+" and "+b+" = "+s);
    }
    void sub(int a,int b){
        d=a-b;
        System.out.println("Difference of "+a+" and "+b+" = "+d);
    }
    void quo(int a,int b){
        q=a/b;
        System.out.println("Quotient of "+a+" and "+b+" = "+q);
    }
    void mul(int a,int b){
        p=a*b;
        System.out.println("Product of "+a+" and "+b+" = "+p);
    }
}
