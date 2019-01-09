package Assignment2;

interface A{
    String okay();
}

interface B{
    String okay();

}
class TwoInterfaceSameReturnTypenMethod implements A,B {
     public String okay() {
        return null;
    }
}

