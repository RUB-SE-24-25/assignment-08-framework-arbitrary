package structra.assignment.task.impl;
import structra.assignment.framework.llm.KeyProvider;

public class KeyCreation implements KeyProvider {
    private static final String apiKey = "structra-1343abnc-dGhpcyBpcyBub3Qgb3VyIGFwaSBrZXksIG5pY2UgdHJ5IHRobyA6KQ==";


    @Override
    public String getApiKey() {
        // @throws RuntimeException If an error occurs during retrieval or decryption.
        if (apiKey == null || apiKey.isEmpty()) {
            throw new RuntimeException("API key retrieval failed.");
        }
        //@return The decrypted API key as a string.
        return apiKey;
    }
}
