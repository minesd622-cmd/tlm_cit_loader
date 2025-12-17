package com.yourname.tlmcitloader;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.minecraft.resource.ResourceType;

public class TlmCitLoaderMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register custom resource reloader (to detect cit/tlm folders)
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES)
                .registerReloadListener(new loader.ResourceReloader());
    }
}
