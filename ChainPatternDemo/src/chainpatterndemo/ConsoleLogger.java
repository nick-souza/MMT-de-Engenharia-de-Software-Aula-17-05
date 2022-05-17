package chainpatterndemo;

/**
 *
 * @author Nicolas Sá de Souza
 */
public class ConsoleLogger extends AbstractLogger{
   public ConsoleLogger(int level){
      this.level = level;
  }
   @Override
   protected void write(String message){
      System.out.println("Standard 11 Console :: Logger "+message);
  }
}
                                                     