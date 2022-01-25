package abstractclassresearch;

public class ResearchMain {
    public static void main(String[] args) {

        System.out.println("AbstractClassResearchImpl.getData(): " + AbstractClassResearchImpl.getData());
        AbstractClassResearchImpl a = new AbstractClassResearchImpl();
        System.out.println("a.getString(): " + a.getString());


        System.out.println("AbstractClassResearchImpl2.getData(): " + AbstractClassResearchImpl2.getData());
        AbstractClassResearchImpl2 b = new AbstractClassResearchImpl2();
        System.out.println("b.getString(): " + b.getString());

        System.out.println("AbstractClassResearchImpl3.getData(): " + AbstractClassResearchImpl3.getData());
        AbstractClassResearchImpl3 c = new AbstractClassResearchImpl3();
        System.out.println("c.getString(): " + c.getString());


//        SomeInterfaceImpl someInterfaceImpl = new SomeInterfaceImpl();
        System.out.println("c.getString(): " + SomeInterface.getSomeString());
    }
}
