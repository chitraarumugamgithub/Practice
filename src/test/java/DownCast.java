class A{
    A(){
        System.out.println("def consturctor");
    }
    protected void msg(){System.out.println("Hello java");}
}

public class DownCast extends A{
    DownCast(){
        System.out.println("baseclass const");
    }

    void msg1(){System.out.println("Hello java1");}//C.T.Error
    public static void main(String args[]){
        DownCast obj=new DownCast();
        obj.msg1();
        obj.msg();
    }
}  