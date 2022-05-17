package interpreterpatterndemo;

/**
 *
 * @author Nicolas Sá de Souza
 */
public class InterpreterPatternDemo{
   // Rule:Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert,john);
  }
   
  // Rule:Julie isamarried women
  public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie,married);
  }
   public static void main(String[]args){
      Expression isMale = getMaleExpression();
      Expression isMarriedwoman = getMarriedWomanExpression();
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie isamarried women? " + isMarriedwoman.interpret("Married Julie"));
  }
}
