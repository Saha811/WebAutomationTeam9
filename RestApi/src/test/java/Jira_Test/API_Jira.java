package Jira_Test;

import JiraAPI.JiraRestApi;
import org.testng.annotations.Test;

public class API_Jira extends JiraRestApi {

        @Test
        public void Test2(){
            test2();
        }
        //creating issue/Defact
        @Test
        public void jiraApi(){
            JiraApi();
        }
        //insert comment --
        @Test
        public void TestInsertComment(){
            testInsertComment();
        }
        //update comment --put
        @Test
        public void TestUpdateComment(){
            testUpdateComment();
        }
    }

