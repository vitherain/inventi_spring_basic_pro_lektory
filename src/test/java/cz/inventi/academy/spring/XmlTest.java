package cz.inventi.academy.spring;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:**/XmlTest-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class XmlTest extends BasicTest {
}