public class LoanSystem {
     public static void main(String[] args) {

         //tc 01
         Loan loanObject = new Loan();
         String loanDecision;
         double salary = 100000;
         int years = 5;
         int age = 56;

         loanDecision = loanObject.calculateLoanEligibility(salary, years, age);

         System.out.println(loanDecision);

         //tc 02
         salary = 5000;
          years = 2;
          age = 56;

         loanDecision = loanObject.calculateLoanEligibility(salary, years, age);
         System.out.println(loanDecision);
     }
}
