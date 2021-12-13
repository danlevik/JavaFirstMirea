package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManAutoTest {

    @Test
    public void testToString(){
        Man m1 = new Man("Daniel", "big", "gray", "undercut", 21);
        Man m2 = new Man("Michael", "small", "green", "bold", 38);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Man: " + "name=Daniel" + "; " +
                "noseSize=big" + "; " +
                "eyesColor=gray" + "; " +
                "haircut=undercut" + "; " +
                "age=21" +
                '.');
        expected.add("Man: " + "name=Michael" + "; " +
                "noseSize=small" + "; " +
                "eyesColor=green" + "; " +
                "haircut=bold" + "; " +
                "age=38" +
                '.');

        ArrayList<String> actual = new ArrayList<>();
        actual.add(m1.toString());
        actual.add(m2.toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode(){
        Man m1 = new Man("Daniel", "big", "gray", "undercut", 21);
        Man m2 = new Man("Michael", "small", "green", "bold", 38);
        Man m3 = new Man("Andrew", "big", "gray", "undercut", 21);
        Man m4 = new Man("George", "middle", "white", "cascade", 12);

        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(true);
        expected.add(false);

        ArrayList<Boolean> actual = new ArrayList<>();
        actual.add(m1.hashCode() == m2.hashCode());
        actual.add(m1.hashCode() == m3.hashCode());
        actual.add(m1.hashCode() == m4.hashCode());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  testAlwaysNotPass(){
        Man m1 = new Man("Daniel", "big", "gray", "undercut", 21);
        Man m2 = new Man("Michael", "small", "green", "bold", 38);

        String expected = "gray";
        String actual = m2.getEyesColor();

        Assert.assertEquals(expected, actual);
    }
}
