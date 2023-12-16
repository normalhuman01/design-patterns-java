package com.edujlac.observer.observers;

public interface Observer {
    // Args are the state values the Observers get from the Subject when a weather measurements changes
    void update(float temperature, float humidity, float pressure);
}
