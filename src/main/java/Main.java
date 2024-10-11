public class Main {
    public static void main(String[] args){
        // Instantiate an object of class Calculator with initial value of zero
        Calculator calc=new Calculator(1); // This will call the constructor
        // Add some values
        calc.add(10);
        calc.AC();
        calc.add(5);
        calc.AC();
        calc.subtract(10);

        calc.AC();
        int i;
        for(i=0;i<=10;i++){
            calc.add(i);
        }
        calc.AC();
        for(i=10;i>0;i=i-2){
            calc.add(i);
        }
        calc.AC();
        Calculator calc2 = new Calculator(1);
        int j;
        for(j=7;j>0 && j<=15;j=j+2) {
            calc2.multiply(j);
        }
        calc.AC();
        Calculator calc3 = new Calculator(1);
        int k;
        for(k=2;k<=100;k=k+2){
            if (k%6 !=0) {
                calc3.add(k);
            }
        }
    }
}
