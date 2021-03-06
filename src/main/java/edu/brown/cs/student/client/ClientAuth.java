package edu.brown.cs.student.client;

import edu.brown.cs.student.core.FileParser;

/**
 * This simple class is for reading the API Key from your secret file (THAT SHOULD NOT BE PUSHED TO GIT).
 */
public class ClientAuth {

  /**
   * Reads the API Key from the secret text file where we have stored it. Refer to the handout for more on security
   * practices.
   *
   * @return a String of the api key.
   */
  public static String getApiKey() {
    FileParser parser = new FileParser("config/secret/apiKey");
    return parser.readNewLine();
  }
}
