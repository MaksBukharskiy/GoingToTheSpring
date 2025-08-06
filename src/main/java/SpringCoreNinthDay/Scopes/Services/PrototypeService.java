package SpringCoreNinthDay.Scopes.Services;

import org.springframework.stereotype.Service;

@Service
public class PrototypeService {

    private int Prototypecounter = 0;

    public void incrementCounter() {
        Prototypecounter++;
    }

    public int getCounter() {
        return Prototypecounter;
    }

    @Override
    public String toString() {
        return "PrototypeService [Prototypecounter=" + Prototypecounter + "]";
    }

}
