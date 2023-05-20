package mandrille84.mandrille.services;

import mandrille84.mandrille.object.PaintingObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaintingServices {
    @Autowired
    private PaintingObject paintingObject;

    public PaintingObject name(){
        String[] names = {};
        for (String name : names) {
            paintingObject.setName(name);
            System.out.println("value " + paintingObject.getName());
            paintingObject.setMessage("hello");
            System.out.println("value " + name);
        }
        System.out.println();

        return paintingObject;
    }
}
