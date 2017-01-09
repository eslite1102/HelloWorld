public class Shirt{
		public int ShirtID=0;//¹w³]­È
		public String description="-description required-";
		public char colorcode='U';
		public double price=0.0;//price
		public int quantityInStock=0;
			
		public void displayShirtInformation(){	 
			
			System.out.println("Shirt ID="+ShirtID);
			System.out.println("Description="+description);
			System.out.println("ColorCode="+colorcode);
			System.out.println("Price="+price);
			System.out.println("QuantityInStock="+quantityInStock);
		
		}
}