public class Loan {
    public String calculateLoanEligibility(double salary, int experience) {
        String eligibility = "Not eligible";

        if (salary >= 100000) {
            if (experience >= 5) {
                eligibility = LoanType.PREMIUM_LOAN;
            } else {
                eligibility = LoanType.STANDARD_LOAN;
            }
        }
        if (50000 <= salary && salary <= 99999) {
            eligibility = LoanType.SMALL_LOAN;
        }
        return eligibility;
    }

    public String calculateLoanEligibility(double salary, int experience, int age) {
            String loanType = calculateLoanEligibility(salary, experience);
            String eligibility;

            if (loanType.equals(LoanType.PREMIUM_LOAN)) {
                if (age > 55) {
                    eligibility = "Eligible for a premium loan - requires additional risk check";
                } else {
                    eligibility = "Eligible for high amount loan";
                }
            } else {
                eligibility = loanType;
            }

            return eligibility;
    }
}
