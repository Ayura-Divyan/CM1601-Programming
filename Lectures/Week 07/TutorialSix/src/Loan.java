public class Loan {
    public String calculateLoanEligibility(double salary, int experience) {
        if (salary >= 100000) {
            if (experience >= 5) {
                return ("Eligible for a " + LoanType.PREMIUM_LOAN);
            } else {
                return ("Eligible for a " + LoanType.STANDARD_LOAN);
            }
        } else if (50000 <= salary && salary <= 99999) {
            return ("Eligible for a " + LoanType.SMALL_LOAN);
        } else {
            return "Not eligible for a loan";
        }
    }
}
