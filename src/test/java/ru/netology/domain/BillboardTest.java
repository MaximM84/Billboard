package ru.netology.domain;

import jdk.internal.jimage.ImageStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BillboardTest {

    @Test
    public void shouldRemoverIfExists () {
        Billboard manager = new Billboard();
        int idToRemove = 1;
        Billboard first = new Billboard(1, 1, "first", 1, 1);
        Billboard second = new Billboard(2, 2, "second", 2, 2);
        Billboard third = new Billboard(3, 3, "third", 3, 3);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Billboard[] actual = manager.getAll();
        Billboard[] expected = new Billboard[] {third, second};

    }

    @Test
    public void BillboardTest(String[] args) {
        Billboard first = new Billboard("R1");
        Billboard second = new Billboard("R2");
        Billboard third = new Billboard("R3");
        Billboard fourth = new Billboard("R4");
        Billboard fifth = new Billboard("R5");
        Billboard sixth = new Billboard("R6");
        Billboard seventh = new Billboard("R7");
        Billboard eighth = new Billboard("R8");
        Billboard ninth = new Billboard("R9");
        Billboard tenth = new Billboard("R10");

        Billboard manager = new Billboard();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        Billboard findLast = new Billboard(3);
        manager.findLast();

    }


}