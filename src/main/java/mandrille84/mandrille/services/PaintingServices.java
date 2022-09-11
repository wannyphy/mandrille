package mandrille84.mandrille.services;

import mandrille84.mandrille.object.PaintingObject;
import org.springframework.stereotype.Service;

@Service
public class PaintingServices {
    PaintingObject paintingObject;

    public PaintingObject name(){
        String[] name = {"Cagliostro","Azul"};
        for (String value:name) {

            paintingObject.setNama(value);
            System.out.println( "velue"+paintingObject.getNama());
            paintingObject.setMessage("hello");
            System.out.println("value " +value);
        }
        System.out.println( );

        return paintingObject;
    }
}
