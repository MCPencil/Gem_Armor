package net.iqrx.gemarmor;

import net.fabricmc.api.ClientModInitializer;
import net.iqrx.gemarmor.util.ModModelPredicateProvider;

public class GemArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
