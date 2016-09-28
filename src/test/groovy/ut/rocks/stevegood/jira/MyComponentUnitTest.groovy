package ut.rocks.stevegood.jira

import org.junit.Test
import rocks.stevegood.jira.api.MyPluginComponent
import rocks.stevegood.jira.impl.MyPluginComponentImpl

import static org.junit.Assert.assertEquals

class MyComponentUnitTest {
    @Test
    void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null)
        assertEquals 'names do not match!', 'myComponent: ', component.name
    }
}
