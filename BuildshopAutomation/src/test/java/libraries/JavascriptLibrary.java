package libraries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class JavascriptLibrary.
 */
public class JavascriptLibrary {
	
	/**
	 * Gets the image load status.
	 *
	 * @param driver The driver
	 * @param element - The element
	 * @return the image load status
	 */
	public static boolean getImageLoadStatus(WebDriver driver, WebElement element){
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", element);
		return ImagePresent;
		
	}
	
	/**
	 * JavaScript click element.
	 *
	 * @param driver - The driver
	 * @param element - The element to click
	 */
	public static void javascriptClickElement(WebDriver driver, WebElement element){
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}
	
	
	/**
	 * JavaScript type into textbox.
	 *
	 * @param driver the driver
	 * @param element1 the element1
	 * @param value - The value to type
	 */
	public static void javascriptType(WebDriver driver, WebElement element1, String value){
		((JavascriptExecutor)driver).executeScript("arguments[0].value='"+value+"'",element1);
	}
	
	/**
	 * JavaScript scroll window.
	 *
	 * @param driver - The driver
	 * @param xScroll the horizontal scroll
	 * @param yScroll the vertical scroll
	 */
	public static void javascriptScrollWindow(WebDriver driver, int xScroll, int yScroll){
		((JavascriptExecutor)driver).executeScript("window.scrollTo("+xScroll+","+yScroll+")");
	}
	
	
//	public static void javascriptScrollToElement(WebDriver driver, WebElement element){	
//		((JavascriptExecutor)driver).executeScript("element = arguments[0];element.scrollIntoView(true);arguments[0].scrollTop -= 100;",element);		
//	}
	
	public static void javascriptScrollToElement(WebDriver driver, WebElement element){
		int yPos = element.getLocation().getY()-200;
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+yPos+")");
	}
	
	
	/**
	 * Gets the jQuery load status.
	 *
	 * @param driver the driver
	 * @return the jQuery load status
	 */
	public static boolean getJqueryLoadStatus(WebDriver driver){
		boolean status=false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		status = Boolean.valueOf(js.executeScript("if (typeof jQuery != 'undefined') {return true;}else{return false;}").toString());		
		return status;
	}
	
	public static void executeSnippet(WebDriver driver, String status){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(status.equals("hide")){
			js.executeScript("document.getElementsByClassName('reservation-fixed-action')[0].style.display='none';");
		}
		else if(status.equals("show")){
			js.executeScript("document.getElementsByClassName('reservation-fixed-action')[0].style.display='block';");
		}
	}
}










