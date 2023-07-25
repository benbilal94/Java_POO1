package demos.interfacsFonctioelles;

import java.util.ArrayList;
import java.util.List;

public class Carwash {

    private List<CarwashHelper> commands;

    public Carwash() {
        this.commands = new ArrayList<>();
//        commands.add(v -> preparer(v));
//        commands.add(v -> lave(v));
//        commands.add(v -> finalise(v));

    }


    public void addSubscriber(CarwashHelper carwashHelper){

        commands.add(carwashHelper);
    }

    public void preparer(Voiture v) {
        System.out.println("Je prepar la voiture " + v.getNumeroPlaque());
    }

    public void lave(Voiture v) {
        System.out.println("Je lave la voiture " + v.getNumeroPlaque());
    }

    public void finalise(Voiture v) {
        System.out.println("Je finalise la voiture " + v.getNumeroPlaque());
    }

    public void traiter(Voiture v) {
        for (CarwashHelper c : commands) {
            c.execute(v);
        }

    }
}
