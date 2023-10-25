public class TestVector3D {
	public static void main(String argv[]) {
		// -- construct some vectors
		VectorInterface3D v0 = new Vector3D(1.0, 2.0, 3.0);
		VectorInterface3D v1 = new Vector3D(4.0, 5.0, 6.0);
		VectorInterface3D vresult;
		
		// -- addition
		vresult = v0.add(v1);
		System.out.println(v0 + " + " + v1 + " = " + vresult);
		
		// -- subtraction
		vresult = v0.subtract(v1);
		System.out.println(v0 + " - " + v1 + " = " + vresult);
		
		// -- scalar multiplication
		double s = 2.0;
		vresult = v0.multiply(2.0);
		System.out.println(s + " * " + v0 + " = " + vresult);
		
		// -- dot product
		double dot = v0.dot(v1);
		System.out.println(v0 + " . " + v1 + " = " + dot);
		
		// -- cross product
		vresult = v0.cross(v1);
		System.out.println(v0 + " x " + v1 + " = " + vresult);
		
		// -- norm (magnitude)
		double norm = v0.norm();
		System.out.println("|" + v0 + "| = " + norm);
		// -- unit vector
		VectorInterface3D vunit = (Vector3D) v0.unit();
		norm = vunit.norm();
		System.out.println("|" + vunit + "| = " + norm);
		
		
		/// -- unit vector
		vresult = v0.unit();
		System.out.println("unit(" + v0 + ") = " + vresult);
		
		// -- angle between and direction angles
		v0 = new Vector3D(2, -3, 4);
		v1 = new Vector3D(5, 2, 1);
		double angle = v0.angleBetween(v1) * 180.0 / Math.PI;
		System.out.println("angle(" + v0 + ", " + v1 + ") = " + angle + " degrees");

		angle = v0.directionAngle(VectorInterface3D.COMPONENTS.XCOMPONENT);
		System.out.println("Xangle(" + v0 + ") = " + angle);
		
		angle = v0.directionAngle(VectorInterface3D.COMPONENTS.YCOMPONENT);
		System.out.println("Yangle(" + v0 + ") = " + angle);

		angle = v0.directionAngle(VectorInterface3D.COMPONENTS.ZCOMPONENT);
		System.out.println("Zangle(" + v0 + ") = " + angle);
		
		// -- parallel/anti-parallel
		System.out.println(v0 + " is parallel to " + v0 + " is " + v0.parallel(v0));
		System.out.println(v0 + " is parallel to " + v1 + " is " + v0.parallel(v1));

		v0 = new Vector3D(1, 0, 0);
		v1 = new Vector3D(-1, 0, 0);
		System.out.println(v0 + " is anti-parallel to " + v0 + " is " + v0.antiParallel(v0));
		System.out.println(v0 + " is anti-parallel to " + v1 + " is " + v0.antiParallel(v1));
		

		
		System.out.println(v0 + " == " + v0 + " is " + v0.equals(v0));
		System.out.println(v0 + " == " + v1 + " is " + v0.equals(v1));

		v0 = new Vector3D(2, -3, 4);
		v1 = new Vector3D(5, 2, 1);
		System.out.println("project of " + v0 + " onto " + v1 + " = " + v0.projection(v1));
	}

}
