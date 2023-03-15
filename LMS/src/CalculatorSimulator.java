
public class CalculatorSimulator {

	public static void main(String[] args) throws TaxNotEligibleException 
	{
		// TODO Auto-generated method stub
		TaxCalculator taxCalculator = new TaxCalculator();

        // Test the calculateTax method with valid inputs
        String empName = "John Doe";
        boolean isIndian = true;
        double empSal = 60000;
        try {
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        }
        
        empName = "John Doe";
        isIndian = false;
        empSal = 80000;
        try {
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        }
	}

}
