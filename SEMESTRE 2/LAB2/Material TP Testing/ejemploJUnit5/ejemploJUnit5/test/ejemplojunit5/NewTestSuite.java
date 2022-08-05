/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplojunit5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author julio
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ejemplojunit5.utilesArreglosTest.class,ejemplojunit5.utilesMatricesTest.class})
public class NewTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}