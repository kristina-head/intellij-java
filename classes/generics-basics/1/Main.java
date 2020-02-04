class Pair<T, U> {
    private final T first;
    private final U second;

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longFirst = first.hashCode();
        long longSecond = second.hashCode();

        result = 31 * result + (int) (longFirst ^ (longFirst >>> 31));
        result = 31 * result + (int) (longSecond ^ (longSecond >>> 31));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<T, U> pair = (Pair<T, U>) obj;

        return ((this.first == null && pair.first == null) || (this.first != null && this.first.equals(pair.first)))
                        && ((this.second == null && pair.second == null) || (this.second != null && this.second.equals(pair.second)));
    }
}
