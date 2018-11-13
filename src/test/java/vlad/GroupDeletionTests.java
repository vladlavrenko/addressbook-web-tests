package vlad;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testsDeletionGroup() throws Exception {
    goToGroupPage("groups");
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}