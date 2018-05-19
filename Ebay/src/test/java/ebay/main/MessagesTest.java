package ebay.main;

import main.Messages;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MessagesTest extends Messages {
    //go to my messages
    @Test(priority = 1)
    public void MyMessage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        myMessages();
    }
    //create folder in messages
    @Test(priority = 2)
    public void FolderInMessages() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        folderInMessages();
    }
}
