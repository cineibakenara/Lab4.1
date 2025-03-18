import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Persoana{
    String name;
    String prenume;

    public Persoana(String prenume, String name) {
        this.prenume = prenume;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(name, persoana.name) && Objects.equals(prenume, persoana.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prenume);
    }
}
