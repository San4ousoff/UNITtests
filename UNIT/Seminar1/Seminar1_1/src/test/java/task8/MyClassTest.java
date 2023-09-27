package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {
    @Test
    public void sumListsShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> resultTest = MyClass.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков неверна");
    }

    @Test
    public void findMaxShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 2, 5));
        int result = 7;
        int resultTest = MyClass.findMax(list1);
        assertEquals(result, resultTest, "Значение не максимальное");
    }

    @Test
    public void filterStringsShouldBeCorrect() {
        List<String> words = Arrays.asList("один", "два", "три", "четыре", "пять", "шесть");
        List<String> result = Arrays.asList("четыре", "шесть");
        List<String> resultTest = MyClass.filterStrings(words, 5);
        assertEquals(result, resultTest, "Неверно");
    }

}
