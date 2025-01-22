package videostore;

public class ChildrenPrice extends Price {
    @Override
    int getPrice() {
        return Movie.CHILDREN;
    }
}
