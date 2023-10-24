package Vector3D;

public class TestVector3D {
	public static void main(String argv[]) {
		// -- construct some vectors
		VectorInterface3D v0 = new Vector3D(1.0, 2.0, 3.0);
		VectorInterface3D v1 = new Vector3D(4.0, 5.0, 6.0);
		VectorInterface3D vresult;
		
		// -- addition
		vresult = v0.Add(v1);
		System.out.println(v0 + " + " + v1 + " = " + vresult);
		
		// -- subtraction
		vresult = v0.Subtract(v1);
		System.out.println(v0 + " - " + v1 + " = " + vresult);
		
		// -- scalar multiplication
		double s = 2.0;
		vresult = v0.Multiply(2.0);
		System.out.println(s + " * " + v0 + " = " + vresult);
		
		// -- dot product
		double dot = v0.Dot(v1);
		System.out.println(v0 + " . " + v1 + " = " + dot);
		
		// -- cross product
		vresult = v0.Cross(v1);
		System.out.println(v0 + " x " + v1 + " = " + vresult);
		
		// -- norm (magnitude)
		double norm = v0.Norm();
		System.out.println("|" + v0 + "| = " + norm);
		// -- unit vector
		VectorInterface3D vunit = (Vector3D) v0.Unit();
		norm = vunit.Norm();
		System.out.println("|" + vunit + "| = " + norm);
		
		
		/// -- unit vector
		vresult = v0.Unit();
		System.out.println("unit(" + v0 + ") = " + vresult);
		
		// -- angle between and direction angles
		v0 = new Vector3D(2, -3, 4);
		v1 = new Vector3D(5, 2, 1);
		double angle = v0.AngleBetween(v1) * 180.0 / Math.PI;
		System.out.println("angle(" + v0 + ", " + v1 + ") = " + angle + " degrees");

		angle = v0.DirectionAngle(VectorInterface3D.COMPONENTS.XCOMPONENT);
		System.out.println("Xangle(" + v0 + ") = " + angle);
		
		angle = v0.DirectionAngle(VectorInterface3D.COMPONENTS.YCOMPONENT);
		System.out.println("Yangle(" + v0 + ") = " + angle);

		angle = v0.DirectionAngle(VectorInterface3D.COMPONENTS.ZCOMPONENT);
		System.out.println("Zangle(" + v0 + ") = " + angle);
		
		// -- parallel/anti-parallel
		System.out.println(v0 + " is parallel to " + v0 + " is " + v0.Parallel(v0));
		System.out.println(v0 + " is parallel to " + v1 + " is " + v0.Parallel(v1));

		v0 = new Vector3D(1, 0, 0);
		v1 = new Vector3D(-1, 0, 0);
		System.out.println(v0 + " is anti-parallel to " + v0 + " is " + v0.AntiParallel(v0));
		System.out.println(v0 + " is anti-parallel to " + v1 + " is " + v0.AntiParallel(v1));
		

		
		System.out.println(v0 + " == " + v0 + " is " + v0.equals(v0));
		System.out.println(v0 + " == " + v1 + " is " + v0.equals(v1));

		v0 = new Vector3D(2, -3, 4);
		v1 = new Vector3D(5, 2, 1);
		System.out.println("project of " + v0 + " onto " + v1 + " = " + v0.Projection(v1));
	}

}
