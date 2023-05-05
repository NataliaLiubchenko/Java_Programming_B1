package day38_a_abstraction.language;

public interface Language {
    String PLANET = "Earth"; //by  default, it is static final

    void hi(); //by default methods with "no body" in interface is public abstract methods
    void  bye();
}
