package mandrille84.mandrille.object;

import org.springframework.stereotype.Component;

@Component
public class PaintingObject {
    String name;
    String message;

    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
