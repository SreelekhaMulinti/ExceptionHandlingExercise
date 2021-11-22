import java.util.Scanner;
import java.lang.Exception;
class ExceptionHandlingExercise
{
  static void solve(int arr[]) throws Exception
  {
    int ans=0;
    
    for(int i=0;i<10;i++)
      for(int j=i+1;j<10;j++)
        ans+=arr[i]/arr[j];
    
    throw new MyException(ans);
  }
  public static void main(String args[])
  {
    try
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int []arr= new int[n];
      in.nextLine();
      for(int i=0;i<10;i++)
        arr[i]=Integer.parseInt(in.nextLine());
      
      String s=in.nextLine();
      System.out.println(s.charAt(10));
      
      solve(arr);
    }
    catch(ArrayIndexOutOfBoundsException exception)
    {
      System.out.println("Array Index is invalid");
    }
    catch(NumberFormatException exception)
    {
      System.out.println("Format Mismatch");
    }
    catch(StringIndexOutOfBoundsException exception)
    {
      System.out.println("Index is invalid");
    }
    catch(ArithmeticException exception)
    {
      System.out.println("Invalid division");
    }
    catch(MyException exception)
    {
      System.out.println(exception);
    }
    catch(Exception exception)
    {
      System.out.println("Exception Encountered");
    }
    finally
    {
      System.out.println("Exception Handling Completed");
    }
  }
}
class MyException extends Exception
{
  int parameter;
  MyException(int message)
  {
    parameter = message;
  }
  public String toString()
  {
    return "MyException[" + this.parameter +"]";
  }
}
