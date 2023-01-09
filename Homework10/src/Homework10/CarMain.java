package Homework10;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		// car objelerini oluşturup değerlerini Constructor ile atıyorum (car10 hariç)
		
		Car car1 = new Car ("01 aa 2000", "Ahmet", "Renault", "Ankara No:01", "var", "degil" );
		Car car2 = new Car ("02 ab 2100", "Mehmet", "Mercedes", "Izmir No:02", "var", "calinti");// çalıntı araç
		Car car3 = new Car ("03 ca 1000", "Asim", "Volvo", "Samsun No:01", "var", "degil");
		Car car4 = new Car ("04 ac 2001", "Veli", "Renault", "Afyonkarahisar No:01", "var", "degil");
		Car car5 = new Car ("05 ba 2500", "Omer", "Ferrari", "Bursa No:01", "yok", "degil");
		Car car6 = new Car ("06 ad 3600", "Hasan", "Audi", "Adana No:01", "var", "degil");
		Car car7 = new Car ("07 da 4000", "Hüseyin", "Opel", "Zonguldak No:01", "var", "degil");
		Car car8 = new Car ("08 va 2500", "Kasim", "Sahin", "Bolu No:01", "yok", "calinti");// çalıntı araç
		Car car9 = new Car ("02 av 2050", "Vedat", "Renault", "Sakarya No:01", "var", "degil");
		Car car10 = new Car ();
		
		// car10 objesinin değerlerini Setter ile atıyorum.
		car10.setPlateofCar("01 bb 2030");
		car10.setNameofOwner("Mustafa");
		car10.setModel("Mini Copper");
		car10.setAdress("Mardin No:1");
		car10.setInsurance("var");
		car10.setStolen("degil");
		
		// nesneleri içeren bir  dizi oluşturuyorum.
		
		Car[] obj = new Car[10];
		
		obj[0]=car1;
		obj[1]=car2;
		obj[2]=car3;
		obj[3]=car4;
		obj[4]=car5;
		obj[5]=car6;
		obj[6]=car7;
		obj[7]=car8;
		obj[8]=car9;
		obj[9]=car10;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Araç Plakasını şu formatta (11 aa 1111) Giriniz ");	
		System.out.println(" ");	
		String str =scan.nextLine();
		
		Car carInput = new Car("bos", "bos", "bos", "bos", "bos", "bos");
		
		for (Car car : obj) {
						
			if(car.getPlateofCar().equals(str)) {
				
				carInput = car;
				
				System.out.println("Bu araç sistemde kayıtlıdır");
				System.out.println("");
				
			}
			
						
		}
		
		if (!carInput.getStolen().equals("bos") && carInput.getStolen().equals("calinti")) {
			
			System.out.println("!!! Uyarı: Bu araç çalıntıdır !!!");
			System.out.println("");
			carInput.showInfos();
			
		}
		
		else if (carInput.getPlateofCar().equals("bos")) {
			
			System.out.println("!!! Bu araç sistemde kayıtlı değildir !!!");
			System.out.println("");
			
		}
		
			
		else {
			
			System.out.println("Bu araç çalıntı değildir");
			System.out.println("");
			carInput.showInfos();
		}
		
		
				
		scan.close();

	}

}
