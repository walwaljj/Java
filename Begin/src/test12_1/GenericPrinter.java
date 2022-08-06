package test12_1;

public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
