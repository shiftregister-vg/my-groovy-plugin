package it.rocks.stevegood.jira

import org.junit.Test
import org.junit.runner.RunWith
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner
import rocks.stevegood.jira.api.MyPluginComponent
import com.atlassian.sal.api.ApplicationProperties

import static org.junit.Assert.assertEquals

@RunWith(AtlassianPluginsTestRunner)
class MyComponentWiredTest {
    private final ApplicationProperties applicationProperties
    private final MyPluginComponent myPluginComponent

    MyComponentWiredTest(ApplicationProperties applicationProperties,MyPluginComponent myPluginComponent) {
        this.applicationProperties = applicationProperties
        this.myPluginComponent = myPluginComponent
    }

    @Test
    void testMyName() {
        assertEquals 'names do not match!', "myComponent: ${applicationProperties?.displayName}", myPluginComponent.name
    }
}
