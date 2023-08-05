import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testFindAll() {
        Manager manager = new Manager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitEqualsSize() {
        Manager manager = new Manager(5);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreSize() {
        Manager manager = new Manager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        Manager manager = new Manager(5);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        Manager manager = new Manager(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        Manager manager = new Manager(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        Manager manager = new Manager(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Тролли.Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }
}