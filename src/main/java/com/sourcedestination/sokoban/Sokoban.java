package com.sourcedestination.sokoban;

import com.sourcedestination.mqttrpg.*;
import java.util.Map;

public class Sokoban extends Game {
    public Sokoban(String id, ClientHub hub, DataStore dataStore) {
        super(id, hub, dataStore);
    }

    @Override
    public Agent getAgent(String s, String s1) {
        return null;
    }

    @Override
    public boolean checkGameAlive() {
        return false;
    }

    @Override
    public Map<String, Object> getProperties() {
        return null;
    }

    @Override
    public void setProperty(String s, Object o) {

    }
}
