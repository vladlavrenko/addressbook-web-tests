package vlad;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        goToGroupPage("groups");
        initGroupCreation();
        fillGroupFields(new GroupData("test1", "test2", "test3"));
        submitGroupForm();
        returnToGroupPage();
    }

}
