public abstract class BasicFuseableObserver<T, R> {

    public final boolean offer(R e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

}