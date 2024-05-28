public record Pair1<F,S>(F first,S second) {
    public Pair1(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public F first() {
        return first;
    }

    @Override
    public S second() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
