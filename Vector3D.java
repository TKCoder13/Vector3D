public class Vector3D implements VectorInterface3D {
    
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        this.XCOMPONENT = 0;
        this.YCOMPONENT = 0;
        this.ZCOMPONENT = 0;
    }

    public Vector3D(double inputX, double inputY, double inputZ) {
        this.XCOMPONENT = inputX;
        this.YCOMPONENT = inputY;
        this.ZCOMPONENT = inputZ;
    }

    public Vector3D(Vector3D src) {
        this.XCOMPONENT = src.XCOMPONENT;
        this.YCOMPONENT = src.YCOMPONENT;
        this.ZCOMPONENT = src.ZCOMPONENT;
    }

    public double get(COMPONENTS component) {
        return this.component;
    }

    public void set(COMPONENTS component, double value) {
        this.component = value;
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
