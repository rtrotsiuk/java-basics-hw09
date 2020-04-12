import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

  /**
   * Test data for common array elements.
   *
   * @return test data array
   */
  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
            {
                    new String[]{"Dynamo", "Arsenal", "MC", "MU", "Juventus", "Barcelona"},
                    new String[]{"Burnley", "Barcelona", "Inter", "Atalanta", "Sevilla", "Real", "Arsenal"},
                    new String[]{"Barcelona", "Arsenal"}
            },
            {
                    new String[]{"test1", "test2", "test3", "TEST4", "test5", "TEST6"},
                    new String[]{"test7", "test8", "test9", "TEST6", "TEST4", "test10", "test11"},
                    new String[]{"TEST4", "TEST6"}
            }
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}