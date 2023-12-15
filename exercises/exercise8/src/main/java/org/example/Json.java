package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class Json {
    public static void main(String[] args) {
        // JSON string containing bookshelf and book information
        String jsonString = "{" +
                "\"BookShelf\": [" +
                "  {" +
                "    \"title\": \"Big brother\", " +
                "    \"publishedYear\": 2000, " +
                "    \"numberOfPages\": 999, " +
                "    \"authors\": [\"AAA\"]" +
                "  }," +
                "  {" +
                "    \"title\": \"Small brother\"," +
                "    \"publishedYear\": 2001," +
                "    \"numberOfPages\": 998," +
                "    \"authors\": [\"BBB\"]" +
                "  }," +
                "  {" +
                "    \"title\": \"Medium brother\"," +
                "    \"publishedYear\": 2002," +
                "    \"numberOfPages\": 997," +
                "    \"authors\": [\"CCC\"]" +
                "  }" +
                "]" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            // Read and parse the JSON string into a tree structure
            JsonNode rootNode = mapper.readTree(jsonString);
            JsonNode bookShelf = rootNode.path("BookShelf");

            // Print the original JSON data
            System.out.println("Original JSON:");
            System.out.println(bookShelf.toPrettyString());

            // Create a new Book object and add it to the original JSON
            ObjectNode newBook = mapper.createObjectNode();
            newBook.put("title", "Brother"); // New book title
            newBook.put("publishedYear", 2003);           // New book published year
            newBook.put("numberOfPages", 996);             // New book number of pages
            ArrayNode authors = newBook.putArray("authors"); // New book authors
            authors.add("DDD");               // Add a new author
            ((ArrayNode) bookShelf).add(newBook);

            // Print the updated JSON data
            System.out.println("\nUpdated JSON:");
            System.out.println(bookShelf.toPrettyString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
