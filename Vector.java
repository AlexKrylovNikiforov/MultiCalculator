import java.util.Arrays;

public class Vector extends Var implements Operation{
    private final double[] values;
    public Vector(double[] values) {
        this.values=values;
    }

    public Vector(String values) {
        String[] parts = values.replace("{", "")
                .replace("}", "")
                .split(",\\s*");
        this.values=new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            this.values[i]=Double.parseDouble(parts[i]);
        }
    }
    @Override
    public Var add(Scalar other) {
        double[] result = this.values.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] += other.getValue();
        }
        return new Vector(result);
    }

    @Override
    public Var add(Vector other) {
        double[] result = values.clone();
        if(values.length == other.values.length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < other.values.length; j++) {
                    result[i] += other.values[j];
                }
            }
        }
        else {
            throw new CalcException("Operation not supported. Both vectors must have equal length") {
            };
        }
        return new Vector(result);
    }

    @Override
    public Var add(Matrix other) {
        return null;
    }

    @Override
    public Var sub(Scalar other) {
        double[] result = this.values.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] -= other.getValue();
        }
        return new Vector(result);
    }

    @Override
    public Var sub(Vector other) {
        double[] result = values.clone();
        if(values.length == other.values.length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < other.values.length; j++) {
                    result[i] -= other.values[j];
                }
            }
        }
        else {
            throw new CalcException("Operation not supported. Both vectors must have equal length") {
            };
        }
        return new Vector(result);
    }

    @Override
    public Var sub(Matrix other) {
        return null;
    }

    @Override
    public Var mul(Scalar other) {
        double[] result = this.values.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] *= other.getValue();
        }
        return new Vector(result);
    }

    @Override
    public Var mul(Vector other) {
        double[] result = values.clone();
        if(values.length == other.values.length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < other.values.length; j++) {
                    result[i] *= other.values[j];
                }
            }
        }
        else {
            throw new CalcException("Operation not supported. Both vectors must have equal length") {
            };
        }
        return new Vector(result);
    }

    @Override
    public Var mul(Matrix other) {
        return null;
    }

    @Override
    public Var div(Scalar other) {
        double[] result = this.values.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] /= other.getValue();
        }
        return new Vector(result);
    }

    @Override
    public Var div(Vector other) {
        double[] result = values.clone();
        if(values.length == other.values.length) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < other.values.length; j++) {
                    result[i] /= other.values[j];
                }
            }
        }
        else {
            throw new CalcException("Operation not supported. Both vectors must have equal length") {
            };
        }
        return new Vector(result);
    }

    @Override
    public Var div(Matrix other) {
        return null;
    }

    @Override
    public String toString() {
        return "values:" + Arrays.toString(values).replace('[', ' ').replace(']', ' ');
    }
}
