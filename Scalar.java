public class Scalar extends Var implements Operation{
    private final double value;

    public double getValue() {
        return value;
    }

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String stringValue) {
        this.value = Double.parseDouble(stringValue);
    }


    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public Var add(Scalar other) {
        return new Scalar(this.value + other.value);
    }

    @Override
    public Var add(Vector other) {
        return other.add(this);
    }

    @Override
    public Var add(Matrix other) {
        return other.add(this);
    }

    @Override
    public Var sub(Scalar other) {
        return new Scalar(this.value - other.value);
    }

    @Override
    public Var sub(Vector other) {
        return other.sub(this);
    }

    @Override
    public Var sub(Matrix other) {
        return null;
    }

    @Override
    public Var mul(Scalar other) {
        return new Scalar(this.value*other.value);
    }

    @Override
    public Var mul(Vector other) {
        return other.mul(this);
    }

    @Override
    public Var mul(Matrix other) {
        return null;
    }

    @Override
    public Var div(Scalar other) {
        return null;
    }

    @Override
    public Var div(Vector other) {
        return null;
    }

    @Override
    public Var div(Matrix other) {
        return null;
    }
}
