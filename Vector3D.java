public class Vector3D implements VectorInterface3D {
    
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double inputX, double inputY, double inputZ) {
        this.x = inputX;
        this.y = inputY;
        this.z = inputZ;
    }

    public Vector3D(Vector3D src) {
        this.x = src.x;
        this.y = src.y;
        this.z = src.z;
    }

    public double get(COMPONENTS component) {
        double output = 0;
        if (component == COMPONENTS.XCOMPONENT) {
            output = this.x;
        } else if (component == COMPONENTS.YCOMPONENT) {
            output = this.y;
        } else if (component == COMPONENTS.ZCOMPONENT) {
            output = this.z;
        }
        return output;
    }

    public void set(COMPONENTS component, double value) {
        if (component == COMPONENTS.XCOMPONENT) {
            this.x = value;
        } else if (component == COMPONENTS.YCOMPONENT) {
            this.y = value;
        } else if (component == COMPONENTS.ZCOMPONENT) {
            this.z = value;
        }
    }

    public VectorInterface3D add(VectorInterface3D rhs) {
        double xSum = this.x + rhs.get(COMPONENTS.XCOMPONENT);
        double ySum = this.y + rhs.get(COMPONENTS.YCOMPONENT);
        double zSum = this.z + rhs.get(COMPONENTS.ZCOMPONENT);
        VectorInterface3D sum = new Vector3D(xSum, ySum, zSum);
        return sum;
    }

    public VectorInterface3D subtract(VectorInterface3D rhs) {
        double xDiff = this.x - rhs.get(COMPONENTS.XCOMPONENT);
        double yDiff = this.y - rhs.get(COMPONENTS.YCOMPONENT);
        double zDiff = this.z - rhs.get(COMPONENTS.ZCOMPONENT);
        VectorInterface3D difference = new Vector3D(xDiff, yDiff, zDiff);
        return difference;
    }

    public VectorInterface3D multiply(double value) {
        double xProduct = this.x * value;
        double yProduct = this.y * value;
        double zProduct = this.z * value;
        VectorInterface3D product = new Vector3D(xProduct, yProduct, zProduct);
        return product;
    }

    public double dot(VectorInterface3D rhs) {
        double dotProduct = (this.x * rhs.get(COMPONENTS.XCOMPONENT))
            + (this.y * rhs.get(COMPONENTS.YCOMPONENT))
            + (this.z * rhs.get(COMPONENTS.ZCOMPONENT));
        return dotProduct;
    }

    public VectorInterface3D cross(VectorInterface3D rhs) {
        double xCross = (this.y * rhs.get(COMPONENTS.ZCOMPONENT)) - 
            (this.z * rhs.get(COMPONENTS.YCOMPONENT));
        double yCross = (this.z * rhs.get(COMPONENTS.XCOMPONENT)) - 
            (this.x * rhs.get(COMPONENTS.ZCOMPONENT));
        double zCross = (this.x * rhs.get(COMPONENTS.YCOMPONENT)) - 
            (this.y * rhs.get(COMPONENTS.XCOMPONENT));
        VectorInterface3D crossProduct = new Vector3D(xCross, yCross, zCross);
        return crossProduct;
    }

    public double norm() {
        double norm = Math.sqrt(
            this.x * this.x + this.y * this.y + this.z * this.z
        );
        return norm;
    }

    public VectorInterface3D unit() {
        double unitX = this.x / this.norm();
        double unitY = this.y / this.norm();
        double unitZ = this.z / this.norm();
        VectorInterface3D unitVector = new Vector3D(unitX, unitY, unitZ);
        return unitVector;
    }

    public double angleBetween(VectorInterface3D rhs) {
        // 1. Find the dot product
        // 2. Divide the dot product by the magnitude of each vector
        // 3. Take the inverse cosine of the result to find angle
        double mag1 = this.norm();
        double mag2 = rhs.norm();
        double result = this.dot(rhs) / (mag1 * mag2);
        // -- Figure out if it returns radians or degrees
        double angle = Math.acos(result);
        return angle;
    }

    public double directionAngle(COMPONENTS comp) {
        return 0.0;
    }

    public boolean parallel(VectorInterface3D rhs) {
        double output = this.dot(rhs) / (this.norm() * rhs.norm());
        if ((float) output == 1) {
            return true;
        }
        return false;
    }

    public boolean antiParallel(VectorInterface3D rhs) {
        double output = this.dot(rhs) / (this.norm() * rhs.norm());
        if (output == -1) 
            return true;
        return false;
    }

    public VectorInterface3D projection(VectorInterface3D rhs) {
        double numerator = this.dot(rhs);
        double denominator = rhs.norm();
        double scalar = numerator / denominator;
        VectorInterface3D output = new Vector3D(
            scalar * rhs.get(COMPONENTS.XCOMPONENT),
            scalar * rhs.get(COMPONENTS.YCOMPONENT),
            scalar * rhs.get(COMPONENTS.ZCOMPONENT)
        );
        return output;
    }

    @Override
    public String toString() {
        return "<" + this.x + ", " + this.y + ", " + this.z + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VectorInterface3D) {
            Vector3D test = (Vector3D) obj;
            if (this.x == test.get(COMPONENTS.XCOMPONENT) && 
            this.y == test.get(COMPONENTS.YCOMPONENT) && 
            this.z == test.get(COMPONENTS.ZCOMPONENT))
                return true;
        }
        return false;
    }
}
