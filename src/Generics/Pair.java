package Generics;

public class Pair <V,S>{
    private V first;
    private S second;

    public Pair(V first, S second) {
        this.first = first;
        this.second = second;
    }

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
    }
}
