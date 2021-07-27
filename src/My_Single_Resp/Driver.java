package My_Single_Resp;

public class Driver extends Car{

	private int milesDriven;

    public Driver() {
	}
    
	public Driver(int mileage) {
		super(colour, model, mileage);
		this.milesDriven = milesDriven;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void drive(String milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }

	@Override
	public String toString() {
		return "Driver [mileage=" + mileage + ", getColour()=" + getColour() + ", getModel()=" + getModel()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
