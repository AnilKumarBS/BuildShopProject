package libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public void robotSendKeys(String keys){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		String text = keys;
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);		
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(1000);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	public void robotSendEnter(){
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {			
			e.printStackTrace();
		}				
	}
	
	public static void switchToWindow(String title, WebDriver driver){
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals(title)){
				break;
			}
		}		
	}
}
