package Vector3D;
public interface VectorInterface3D {
    /**
     * These constants are used whenever a method requires
     * the specification of a component
     */
    enum COMPONENTS {XCOMPONENT, YCOMPONENT, ZCOMPONENT};
    
    /**
     * this constant is used whenever two float or double values are 
     * compared for equality
     */
    static double PRECISION = 0.000001;

	/**
	 * Accessor retrieves individual components 
	 * 
	 * @param component 	Specifies which component to retrieve
	 * @return 				The double value of requested component
	 */
	public abstract double get(COMPONENTS component);

	/**
	 * Mutator sets individual components
	 * 
	 * @param component	Specifies which component to set
	 * @param value		Value to set
	 */
	public abstract void set(COMPONENTS component, double value);

	/**
	 * Add the parameter (addend) to this (augend) and
	 * return a new (sum) Vector
	 *     this.X = this.X + parameter.X
	 *     this.Y = this.Y + parameter.Y
	 *     this.Z = this.Z + parameter.Z
	 * @param rhs	Addend of the operation
	 */
	public abstract VectorInterface3D Add(VectorInterface3D rhs);

	/**
	 * Subtract the parameter (subtrahend) from this (minuend) and
	 * return a new (difference) Vector
	 *     this.X = this.X - parameter.X
	 *     this.Y = this.Y - parameter.Y
	 *     this.Z = this.Z - parameter.Z
	 * @param rhs	Subtrahend of the operation
	 */
    	public abstract VectorInterface3D Subtract(VectorInterface3D rhs);

	/**
	 * Multiply this by a scalar value and return a new Vector
	 *     this.X = parameter * X
	 *     this.Y = parameter * Y
	 *     this.Z = parameter * Z
	 * @param value	Scalar for multiplication
	 */
	public abstract VectorInterface3D Multiply(double value);

	/**
	 * Compute the dot product between this and the parameter. Dot product of
	 * two vectors is defined as 
	 *   (this.X * parameter.X) + (this.Y * parameter.Y) + (this.Z * parameter.Z)
	 * @param rhs	Second operand 
	 * @return		A double representing the dot product of this and the parameter
	 */
	public abstract double Dot(VectorInterface3D rhs);

	/**
	 * Compute the cross product between this and the parameter as a new vector.
	 * Cross product of two vectors is defined as 
	 *   this.X = (this.Y * parameter.Z) - (this.Z * parameter.Y)
	 *   this.Y = (this.Z * parameter.X) - (this.X * parameter.Z)
	 *   this.Z = (this.X * parameter.Y) - (this.Y * parameter.X)
	 * @param rhs	Second operand 
	 */
	public abstract VectorInterface3D Cross(VectorInterface3D rhs);

	/**
	 * Retrieves the length (norm) of this.
	 * norm = sqrt(this.X * this.X + this.Y * this.Y + this.Z * this.Z)
	 * @return	A double representing the length (norm) of the vector
	 */
	public abstract double Norm();

	/**
	 * Return a unit vector representation of this. Unit vector is defined as
	 *     this.X = this.X / this.Norm()
	 *     this.Y = this.Y / this.Norm()
	 *     this.Z = this.Z / this.Norm()
	 * @return	A Vector representing the unit vector of this
	 */
	public abstract VectorInterface3D Unit();

	/**
	 * Return the angle between this and the parameter vector
	 * @param rhs
	 * @return	The angle between the this and the parameter in radians
	 */
	public abstract double AngleBetween(VectorInterface3D rhs);

	/**
	 * Return the direction angle of this
	 * @param comp specifies which of the 3 direction angles to compute
	 * @return	The requested direction angle in radians
	 */
	public abstract double DirectionAngle(COMPONENTS comp);

	/**
	 * Determine if this and the parameter vector are parallel
	 * @param rhs
	 * @return	true if this and the parameter are parallel, false otherwise
	 */
	public abstract boolean Parallel(VectorInterface3D rhs);

	/**
	 * Determine if this and the parameter vector are anti-parallel
	 * @param rhs
	 * @return		true if this and the parameter  are anti-parallel, false otherwise
	 */
	public abstract boolean AntiParallel(VectorInterface3D rhs);

	/**
	 * Project this onto the parameter vector and return the resulting vector
	 * @param rhs
	 * @return	The projection length of this onto the parameter
	 */
	public abstract VectorInterface3D Projection(VectorInterface3D rhs);


}
