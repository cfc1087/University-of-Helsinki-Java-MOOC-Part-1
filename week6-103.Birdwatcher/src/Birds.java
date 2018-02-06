
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class Birds {

    ArrayList<Bird> birds;

    public Birds() {
        birds = new ArrayList<Bird>();
    }

    public void add(String name, String latin) {

        birds.add(new Bird(name, latin));
    }

    public void Oberservation(String observed) {
        int count = 0;

        for (Bird bird : birds) {
            if (bird.getName().equals(observed) || bird.getLatin().equals(observed)) {
                bird.setOberserved(++count);
            }
        }
    }

    public void statistics() {
        System.out.println(getBirds());
    }

    public void Show(String name) {
      
        for(Bird bird:birds){
            if(bird.getName().equals(name)){
                System.out.printf("%s (%s): %d observations\n", bird.getName(), bird.getLatin(), bird.getObserved());
            }
        }

    }


    public String getBirds() {
        String s = "";
        for (Bird bird : birds) {
            s += bird.getBird() + "\n";
        }
        return s;
    }

}
