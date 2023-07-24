package demos.demoStatic;

import java.util.*;

public class Des {
    public static int lancerDe(int nbFaces, int nbLance, int nbAGarder) {

        Random rand = new Random();

        List<Integer> lances = new ArrayList<>();
        int nbAleatoir;
        int sum = 0;
        for (int i = 0; i < nbLance; i++) {
            nbAleatoir = (rand.nextInt(nbFaces) +1);
            lances.add(nbAleatoir);
        }
        System.out.println(lances);
        lances.sort(Comparator.reverseOrder());
        System.out.println(lances);
        for (int i = 0 ;i < nbAGarder;i++){
            sum += lances.get(i);
        }
        return sum;
    }
}
