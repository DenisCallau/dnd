package spells;

public interface OffensiveSpell {

    default void cast() {
        System.out.println("asd");
    }

}
