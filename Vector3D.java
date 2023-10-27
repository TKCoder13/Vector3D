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

    }

    public VectorInterface3D unit() {

    }

    public double angleBetween(VectorInterface3D rhs) {

    }

    public double directionAngle(COMPONENTS comp) {

    }

    public boolean parallel(VectorInterface3D rhs) {

    }

    public boolean antiParallel(VectorInterface3D rhs) {

    }

    public VectorInterface3D projection(VectorInterface3D rhs) {

    }
}
