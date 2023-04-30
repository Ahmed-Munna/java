package basicJava;

abstract class Abstract {
    public String name = "MunnaVau";
    public int age = 20;
    abstract void study();
}
class Students extends Abstract{
    public void study() {
        System.out.println("Its so Complecated...!");
    };

    
}