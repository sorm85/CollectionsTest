package exercises;

public class GetPorcentage {

    public GetPorcentage () {
//            10.25
//
//    17
//
//    5

//        15.50
//        15
//        10
        solve(15.50,15,10);
    }

    public  void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        // System.out.println("porcentaje de tip: "+tip_percent+" y de los taxis: "+tax_percent);

        double result =  meal_cost*(tip_percent/100.0);
        System.out.println("Result: "+result);
         result = Math.round(result);
        result = Math.round(result * Math.pow(10, 1)) / Math.pow(10,1);
         System.out.println("Result despues del math: "+result);

        double taxPay =meal_cost*(tax_percent/100.0);
        System.out.println("TaxPay: "+taxPay);
        taxPay = Math.round(taxPay * Math.pow(10, 1)) / Math.pow(10, 1);
        System.out.println("TaxPay despues del math: "+taxPay);


        result = result + taxPay + meal_cost;
        result = Math.round(result * Math.pow(10, 1)) / Math.pow(10, 1);
        System.out.println(result);
//        int printReturn  = (int) Math.ceil(result);
        int printReturn  =(result - Math.floor(result) < 0.5) ? (int)Math.floor(result) : (int)Math.ceil(result);

        System.out.println(printReturn);

    }
}
