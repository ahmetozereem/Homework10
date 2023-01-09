package Homework10;

public class Car {
	
	private String plateofCar;
	private String nameofOwner;
	private String model;
	private String adress;
	private String insurance;
	private String stolen;
	
	
	public Car() {
		super();
	}

	public Car(String plateofCar, String nameofOwner, String model, String adress, String insurance, String stolen) {
		super();
		this.plateofCar = plateofCar;
		this.nameofOwner = nameofOwner;
		this.model = model;
		this.adress = adress;
		this.insurance = insurance;
		this.stolen= stolen;
	}
	
	public String getPlateofCar() {
		return plateofCar;
	}
	public void setPlateofCar(String plateofCar) {
		this.plateofCar = plateofCar;
	}
	public String getNameofOwner() {
		return nameofOwner;
	}
	public void setNameofOwner(String nameofOwner) {
		this.nameofOwner = nameofOwner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getStolen() {
		return stolen;
	}
	public void setStolen(String stolen) {
		this.stolen = stolen;
	}
	
	
	public void showInfos () {
		
		System.out.println("Araç Bilgileri: ");
		System.out.println("Araç Plakası: " + plateofCar);
		System.out.println("Araç Sahibinin ismi: " + nameofOwner);
		System.out.println("Araç modeli: " + model);
		System.out.println("Araç sahibinin adresi: " + adress);
		System.out.println("Araç sigortası: " + insurance);
		System.out.println("Çalıntı durumu: " + stolen);
	}

}
