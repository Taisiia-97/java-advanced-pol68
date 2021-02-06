package homework.task1;

import java.time.LocalDate;

public class Hero extends Person {

    public Hero(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        return "Hero " + name+" "+birthDate;
    }
}
