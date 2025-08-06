package SpringCoreNinthDay.Scopes.Services;

public class SingletonService {
    private int SingletonCounter;

    public void increaseInstance() {
        SingletonCounter++;
    }

    public int getSingletonCounter() {
        return SingletonCounter;
    }

    @Override
    public String toString() {
        return "SingletonService [SingletonCounter=" + SingletonCounter + ']';
    }

}
