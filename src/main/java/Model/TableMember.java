/**************************************
 * Filename:  App.java
 * Short Description: L04D
 * @author  Hoang Phan
 * @version  March 31, 2020 
 ***************************************/
package Model;

import java.util.ArrayList;
/**
 *
 * @author hoang
 */
public interface TableMember
{

    public String getAttribute(int n);

    public ArrayList<String> getAttributes();

    public String getAttributeName(int n);

    public ArrayList<String> getAttributeNames();
}
