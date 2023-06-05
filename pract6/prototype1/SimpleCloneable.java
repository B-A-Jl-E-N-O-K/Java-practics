package pract6.prototype1;


public class SimpleCloneable implements Cloneable {
    public void print() {
        System.out.println("New cloanable");
    }

    @Override
    public SimpleCloneable clone() throws CloneNotSupportedException {
        return (SimpleCloneable) super.clone();
    }
}
