
public class NumberConverter{
	/**
	* i.e "invalid number of arguments <br> Number Converter "number" "conversion type" <br>
		"conversion type" <br> 1.binary to decimal <br> 2.decimal to binary <br> "number" <br> appropriate number
	**/
	public static void main(String args[]){
	if(args.length !=2)
	{
		System.out.println("invalid number of arguments");
		System.out.println(" Number Converter <number> <conversion type> ");
		System.out.println("<conversion type> \n 1.binary to decimal \n 2.decimal to binary");
		System.out.println("<number> \n appropriate number");
	}
	int number=Integer.parseInt(args[0]);
	int classType=Integer.parseInt(args[1]);
	if(classType==1)
	{	
		
		int temp=number;
		double decimal=0;
		while(temp>0)
		{
			for(int i=0;temp>0;i++)
			{
			
				int a=temp%10;
				decimal=decimal+(a*Math.pow(2,i));
				temp=temp/10;
			}
		}
		System.out.println(+number+"="+decimal+" in decimal");
	}
	else
	{
		int temp=number;
		String binary="";
		while(temp>0)
		{
			int a=temp%2;
			binary=a+binary;
			temp=temp/2;
		}
		System.out.println(+number+"="+binary+" in binary");
	}
}
}	