package org.example.Gemini;

import com.google.genai.Client;
import com.google.genai.ResponseStream;
import com.google.genai.types.GenerateContentResponse;

public class GenerateTextFromTextInput {
    public static void main(String[] args) {
        // NOTE: For production, load API key from an environment variable!
        Client client = Client.builder().apiKey("AIzaSyDsv5mORHGj1Sv3pot1v6nOhnQWvzbTk3g").build();

        // 1. Get the ResponseStream object
        ResponseStream<GenerateContentResponse> stream =
                client.models.generateContentStream(
                        "gemini-2.5-pro",
                        "how vector databases work?",
                        null);

        System.out.println("🤖 Gemini Response Stream:");
        System.out.println("----------------------------------------");

        // 2. Iterate through the stream and print each chunk's text
        for (GenerateContentResponse chunk : stream) {
            // Use print() instead of println() to keep the text on one line,
            // creating the real-time "typing" effect.
            System.out.print(chunk.text());
        }

        // 3. Print a final newline character for clean formatting
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("✅ Generation Complete.");
    }
}