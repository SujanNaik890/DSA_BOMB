package Generics;

class DefineGenericClass <T>
{
    private T x;

    DefineGenericClass(T x){
        this.x=x;
    }
    void display(){
        System.out.print(x);
    }
}
public class GenericClass{
    public static void main(String[] args) {
        DefineGenericClass<Integer> integer=new DefineGenericClass<>(10);
        integer.display();
    }
}

