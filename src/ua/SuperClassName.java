package ua;

public class SuperClassName {
    int superVariable = 5;

    {
        System.out.printf("non static in SuperClassName init, super variable: %d\n", this.superVariable);
    }

    public SuperClassName() {
        System.out.println("constructor in SuperClassName");
    }

    static {
        System.out.println("static init in SuperClassName");
    }
}


class ClassName extends SuperClassName {
    public static int className = 13;

    {
        System.out.printf("ClassName non static init block: P1 %d, Constant: %d\n", this.primitiveInstanceVariable, this.CONSTANT_VALUE );
    }

    static {
        System.out.println("static init block in ClassName");
    }

    private int primitiveInstanceVariable = 7;
    private final int CONSTANT_VALUE = 5;

    public ClassName(int parameter) {
        primitiveInstanceVariable = parameter;
        System.out.printf("constructor ClassName: %d\n", primitiveInstanceVariable);
    }

    public int getPrimitiveInstanceVariable() {
        return primitiveInstanceVariable;
    }

    {
        int  var = 7;
        System.out.printf("ClassName non static init block: P2 %d, var: %d\n", this.primitiveInstanceVariable, var);
    }
}