package in.Shrii.beans;

public class PetrolEngine implements IEngine{
	

	public PetrolEngine() {
		int i=10;
		int j=20;
		System.out.println("PetrolEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine Started");
		return 1;
	}

}
