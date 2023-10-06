class HotelApplication 
{
	public static void main(String[] args) 
	{
		HotelManagement h=new HotelManagement();
		for(;;)
		{
			System.out.println("1.choose hotel 2.order food 3.bill 4.exit");
             switch(h.sc.nextInt())
			{
				 case 1:
					 h.chooseFood();
					 break;
				  case 2:
					  h.orderFood();
					 break;
				   case 3:
					   h.bill();
					 break;
				    case 4:
						System.exit(1);
					 break;
			 }
		}
	}
}