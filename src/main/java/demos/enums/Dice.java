package demos.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public enum Dice {

    D4(4),
    D6(6),
    D10(10),
    D20(20),
    D100(100)
    ;

    int value;
    Dice(int value){
        this.value = value;
    }

    int roll(){
        Random rn = new Random();
        return rn.nextInt(this.value) + 1;
    }

    int rolls(int nbRoll){
        int result = 0;
        for (int i = 0; i < nbRoll; i++){
            result += roll();
        }
        return result;
    }

    int rolls(int nbRoll,int nbToKeep){
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nbRoll; i++){
            results.add(roll());
        }
        return results.stream()
                .sorted(Integer::compareTo)
                .limit(nbToKeep)
                .mapToInt(i -> i)
                .sum();
    }
}
