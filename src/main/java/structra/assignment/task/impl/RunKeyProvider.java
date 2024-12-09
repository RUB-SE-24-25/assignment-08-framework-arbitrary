package structra.assignment.task.impl;

import structra.assignment.framework.llm.KeyProvider;

public class RunKeyProvider {
    public static void main(String[] args) {
        KeyProvider keyprovider = new KeyCreation();
        System.out.println("Key: " + keyprovider.getApiKey());
    }

}
