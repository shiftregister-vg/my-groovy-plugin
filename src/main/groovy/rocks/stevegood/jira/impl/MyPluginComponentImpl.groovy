package rocks.stevegood.jira.impl

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport
import com.atlassian.sal.api.ApplicationProperties
import rocks.stevegood.jira.api.MyPluginComponent

import javax.inject.Inject
import javax.inject.Named

@ExportAsService([MyPluginComponent])
@Named('myPluginComponent')
class MyPluginComponentImpl implements MyPluginComponent
{
    @ComponentImport
    private final ApplicationProperties applicationProperties

    @Inject
    MyPluginComponentImpl(final ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties
    }

    public String getName() {
        return "myComponent: ${applicationProperties?.displayName ?: ''}"
    }
}
