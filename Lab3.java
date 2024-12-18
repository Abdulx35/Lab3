public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "B";

    
    long sTime = System.currentTimeMillis();
    int index = match(text, bestCase);
    
    long eTime = System.currentTimeMillis();
    // * Calculate elapsedTime here
    long elapsedTime = eTime - stime;
    System.out.println("elapsed time for best-case input is " + elapsedTime + " ms");
    
    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");   

    String worstCase = "7";
    
    // * Initialize startTime here
    sTime = System.currentTimeMillis();
    index = match(text, worstCase);
    // * Initialize endTime here
    eTime = System.currentTimeMillis();
    // * Calculate elapsedTime here
    elapsedTime = eTime - sTime;
    System.out.println("elapsed time for worst-case input is " + elapsedTime + " ms");
    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}