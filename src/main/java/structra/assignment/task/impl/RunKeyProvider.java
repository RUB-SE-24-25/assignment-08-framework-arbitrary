package structra.assignment.task.impl;

import structra.assignment.framework.llm.KeyProvider;
import structra.assignment.framework.llm.MachineLearningModel;
import structra.assignment.framework.llm.model.Mimic;

public class RunKeyProvider {
    public static void main(String[] args) {
        KeyProvider keyProvider = new KeyCreation();
        System.out.println("Key: " + keyProvider.getApiKey());
    }

}
