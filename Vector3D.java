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
        
    }

    public VectorInterface3D subtract(VectorInterface3D rhs) {

    }

    public VectorInterface3D multiply(double value) {

    }

    public double dot(VectorInterface3D rhs) {

    }

    public VectorInterface3D cross(VectorInterface3D rhs) {

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
