package Seminar5.CW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public List<Integer> getRandomNumbers(int n){
        List<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(100) + 1); //random
        }
        return numbers;
    }
}
