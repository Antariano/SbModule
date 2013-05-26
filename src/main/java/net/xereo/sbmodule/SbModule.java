package net.xereo.sbmodule;

import com.drdanick.McRKit.ToolkitEvent;
import com.drdanick.McRKit.module.Module;
import com.drdanick.McRKit.module.ModuleLoader;
import com.drdanick.McRKit.module.ModuleMetadata;

public class SbModule extends Module
{
    protected SbModule(ModuleMetadata moduleMetadata, ModuleLoader moduleLoader, ClassLoader classLoader,
                       ToolkitEvent toolkitEvent, ToolkitEvent toolkitEvent2)
    {
        super(moduleMetadata, moduleLoader, classLoader, toolkitEvent, toolkitEvent2);
    }

    @Override
    protected void onEnable()
    {
        // TODO Everything!
    }

    @Override
    protected void onDisable()
    {
        // TODO EVerything!
    }
}
