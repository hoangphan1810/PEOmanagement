/**************************************
 * Filename:  App.java
 * Short Description: L04D
 * @author  Hoang Phan
 * @version  March 31, 2020 
 ***************************************/
package Model;
/**
 *
 * @author hoang
 */
public interface Displayable {
   public int getFirstLineToDisplay(); 
   public int getLineToHighlight(); 
   public int getLastLineToDisplay(); 
   public int getLinesBeingDisplayed(); 
   
   public void setFirstLineToDisplay(int firstLine); 
   public void setLineToHighlight(int highlightedLine); 
   public void setLastLineToDisplay(int lastLine); 
   public void setLinesBeingDisplayed(int numberOfLines); 
       
}