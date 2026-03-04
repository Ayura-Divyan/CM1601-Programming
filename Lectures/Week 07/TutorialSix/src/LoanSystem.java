public class LoanSystem {
     public static void main(String[] args) {
         Loan loanObject = new Loan();
         String loanDecision;
         double salary = 100000;
         int years = 5;
         loanDecision = loanObject.calculateLoanEligibility(salary, years);
         System.out.println(loanDecision);
     }
}
