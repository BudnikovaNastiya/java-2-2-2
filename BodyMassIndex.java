public class BodyMassIndex {
    public float  calculate (int height, int weight) {
        float  heighSquare = height * height;
        float  index = weight / heighSquare * 10_000;
        return index;
    }
}

