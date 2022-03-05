
public class ArithmeticCalculator {
	
	double remainder;
	long intDivision;
	public double addition(double number1,double number2) {
		double operationresult;
		operationresult=number1+number2;
		return operationresult;
	}
	
	public double subtraction(double number1,double number2) {
		double operationresult;
		operationresult=number1-number2;
		return operationresult;
	}
	
	public double multiplication(double number1,double number2) {
		double operationresult;
		operationresult=number1*number2;
		return operationresult;
	}
	
	public double division(double number1,double number2) {
		double operationresult;
		if(number1==0 && number2==0) {
			throw new ArithmeticException("Cannot divide zero by zero."); // result would Nan ... non sure if should be allowed or not
		}
		operationresult=doDivide(number1,number2);
		return operationresult;
	}
	
	private double doDivide(double number1,double number2) {
		double operationresult;
		operationresult=number1/number2;
		this.remainder=number1%number2;
		this.intDivision=(long) (number1/number2);
		return operationresult;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i1=1;
int i2=2;
float f1=1f;
float f2=2f;
double d1=1;
double d2=2;
final double PI=3.14;

ArithmeticCalculator operation = new ArithmeticCalculator();
System.out.println("Adding "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.addition(i1,i2));
System.out.println("Adding "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" : "+operation.addition(i1,f1));
System.out.println("Adding "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" : "+operation.addition(i1,d1));
System.out.println("Adding "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.addition(f1,i2));
System.out.println("Adding "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.addition(f1,f2));
System.out.println("Adding "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.addition(f1,d2));
System.out.println("Adding "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.addition(d1,i2));
System.out.println("Adding "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.addition(d1,f2));
System.out.println("Adding "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.addition(d1,d2));
System.out.println();



System.out.println("Subtracting "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.subtraction(i1,i2));
System.out.println("Subtracting "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" : "+operation.subtraction(i1,f1));
System.out.println("Subtracting "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" : "+operation.subtraction(i1,d1));
System.out.println("Subtracting "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.subtraction(f1,i2));
System.out.println("Subtracting "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.subtraction(f1,f2));
System.out.println("Subtracting "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.subtraction(f1,d2));
System.out.println("Subtracting "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.subtraction(d1,i2));
System.out.println("Subtracting "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.subtraction(d1,f2));
System.out.println("Subtracting "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.subtraction(d1,d2));
System.out.println("Subtracting "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(PI)).getClass().getSimpleName()+" "+PI+" : "+operation.subtraction(d1,PI));
System.out.println();


System.out.println("Multiplicating "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.multiplication(i1,i2));
System.out.println("Multiplicating "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" : "+operation.multiplication(i1,f1));
System.out.println("Multiplicating "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" : "+operation.multiplication(i1,d1));
System.out.println("Multiplicating "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.multiplication(f1,i2));
System.out.println("Multiplicating "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.multiplication(f1,f2));
System.out.println("Multiplicating "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.multiplication(f1,d2));
System.out.println("Multiplicating "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.multiplication(d1,i2));
System.out.println("Multiplicating "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.multiplication(d1,f2));
System.out.println("Multiplicating "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.multiplication(d1,d2));	
System.out.println();

System.out.println("Dividing "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.division(i1,i2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" : "+operation.division(i1,f1) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(i1)).getClass().getSimpleName()+" "+i1+" with "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" : "+operation.division(i1,d1) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.division(f1,i2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.division(f1,f2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(f1)).getClass().getSimpleName()+" "+f1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.division(f1,d2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(i2)).getClass().getSimpleName()+" "+i2+" : "+operation.division(d1,i2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(f2)).getClass().getSimpleName()+" "+f2+" : "+operation.division(d1,f2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);
System.out.println("Dividing "+((Object)(d1)).getClass().getSimpleName()+" "+d1+" with "+((Object)(d2)).getClass().getSimpleName()+" "+d2+" : "+operation.division(d1,d2) + " - Integer Division : "+operation.intDivision+" Remainder : "+operation.remainder);	
System.out.println();
System.out.println("Dividing 0 with 0 : "+operation.division(0,0));	

	}

}
