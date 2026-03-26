class Parcel{
	private String trackingId;
	private double weightKg;
	
	Parcel(String trackingId,double weightKg){
		this.trackingId = trackingId;
		this.weightKg = weightKg;
	}
	
	public void display(){
		System.out.println("Tracking Id" + trackingId);
		System.out.println("Weight In Kg: "+ weightKg);
	}

	public double shippingCost(){
		return 50.0 + weightKg * 10;
	}
	
	public double getWeightKg(){
		return weightKg;
	}
}

class BoxParcel extends Parcel{
	
	BoxParcel(String trackingId,double weightKg){
		super(trackingId,weightKg);
	}
		
	@Override
    public double shippingCost() {
        if (getWeightKg() <= 0) return 0;
        return super.shippingCost() + 25.0;
    }
}

class FragileParcel extends Parcel{
	private double insurancePercent;
	
	//constructor
	public FragileParcel(String trackingId, double weightKg, double insurancePercent) {
        super(trackingId, weightKg); 
        this.insurancePercent = insurancePercent;
    }
	
	@Override
	public double shippingCost() {
        if (getWeightKg() <= 0) return 0;
        return super.shippingCost() * (1 + insurancePercent / 100);
    }
}

class main{
	public static void main(String args[]){
		double weight = 20.0;
		//objects
		Parcel obj1 = new Parcel("TCSK-001", weight);
        BoxParcel obj2 = new BoxParcel("TCSK-002", weight);
        FragileParcel obj3 = new FragileParcel("TCSK-003", weight, 20.0); 
		
		System.out.println("========================");
		System.out.println("        Shipping");
		System.out.println("========================\n");
		System.out.println("\n--- Standard Parcel ---");
        obj1.display();
        System.out.println("Shipping Cost: Rs " + obj1.shippingCost());
 
        System.out.println("\n--- Box Parcel(+Rs 25 handling) ---");
        obj2.display();
        System.out.println("Shipping Cost: Rs " + obj2.shippingCost());
 
        System.out.println("\n--- Fragile Parcel(+20% insurance) ---");
        obj3.display();
        System.out.println("Shipping Cost: Rs " + obj3.shippingCost());
	}
}
