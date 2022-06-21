import ru.netology.domain.Billboard;
import ru.netology.domain.Film;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillboardTest {
    Film first = new Film("First", "Fantasy", 1);
    Film second = new Film("Second", "Drama", 2);
    Film third = new Film("Third", "Criminal", 3);
    Film fourth = new Film("Fourth", "Detective", 4);
    Film fifth = new Film("Fifth", "Comedy", 5);
    Film sixth = new Film("Sixth", "Drama", 6);
    Film seventh = new Film("Seventh", "Drama", 7);
    Film eighth = new Film("Eighth", "Fantasy", 8);
    Film ninth = new Film ("Ninth", "Melodrama", 9);
    Film tenth = new Film("Tenth", "Melodrama", 10);

    @Test
    public void addFilms() {
        Billboard films = new Billboard();
        films.add(first);
        films.add(second);
        films.add(third);
        Film[] actual = films.findAll();
        Film[] expected = {first, second, third};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findAll() {
        Billboard films = new Billboard();
        films.add(first);
        films.add(second);
        films.add(third);
        films.add(fourth);
        films.add(fifth);
        films.add(sixth);
        films.add(seventh);
        films.add(eighth);
        films.add(ninth);
        films.add(tenth);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllWithLimit() {
        Billboard films = new Billboard(3);
        films.add(first);
        films.add(second);
        films.add(third);
        films.add(fourth);
        films.add(fifth);
        films.add(sixth);
        films.add(seventh);
        films.add(eighth);
        films.add(ninth);
        films.add(tenth);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {tenth, ninth, eighth};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void findAllUnderLimit() {
        Billboard films = new Billboard(5);
        films.add(first);
        films.add(second);
        films.add(third);

        films.findLast();

        Film[] actual = films.findLast();
        Film[] expected = {third, second, first};

        Assertions.assertArrayEquals(actual, expected);


    }
}
