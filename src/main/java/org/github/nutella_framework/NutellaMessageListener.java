package org.github.nutella_framework;

import com.fasterxml.jackson.databind.JsonNode;
import ltg.commons.MessageListener;

/**
 * Created by tebemis on 10/7/14.
 */
public interface NutellaMessageListener {
    public void processMessage(JsonNode message);
}
