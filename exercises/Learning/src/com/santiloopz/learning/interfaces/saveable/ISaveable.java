package com.santiloopz.learning.interfaces.saveable;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> changes);
}
