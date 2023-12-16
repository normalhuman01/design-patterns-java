package com.edujlac.observer.subject;

import com.edujlac.observer.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(); // This method is called to notify all observers when the subject's state has changed
}
