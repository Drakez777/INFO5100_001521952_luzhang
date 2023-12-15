package org.example;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.StringReader;
import org.xml.sax.InputSource;

public class XML {
    public static void main(String[] args) {
        // XML string containing bookshelf and book information
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        String xmlString = """
                <BookShelf>
                    <Book>
                        <title>Big brother</title>
                        <publishedYear>2000</publishedYear>
                        <numberOfPages>999</numberOfPages>
                        <authors>
                            <author>AAA</author>
                        </authors>
                    </Book>
                    <Book>
                        <title>Small brother</title>
                        <publishedYear>2001</publishedYear>
                        <numberOfPages>998</numberOfPages>
                        <authors>
                            <author>BBB</author>
                        </authors>
                    </Book>
                    <Book>
                        <title>Medium brother</title>
                        <publishedYear>2002</publishedYear>
                        <numberOfPages>997</numberOfPages>
                        <authors>
                            <author>CCC</author>
                        </authors>
                    </Book>
                </BookShelf>
                """;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));

            System.out.println("Original XML:");
            printXml(doc.getDocumentElement());

            Element newBook = doc.createElement("Book");
            newBook.appendChild(createElementWithText(doc, "title", "Brother")); // New book title
            newBook.appendChild(createElementWithText(doc, "publishedYear", "2003"));          // New book published year
            newBook.appendChild(createElementWithText(doc, "numberOfPages", "996"));            // New book number of pages
            Element authors = doc.createElement("authors");
            authors.appendChild(createElementWithText(doc, "author", "DDD"));     // Authors of the new book
            newBook.appendChild(authors);
            doc.getDocumentElement().appendChild(newBook);

            System.out.println("\nUpdated XML:");
            printXml(doc.getDocumentElement());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Element createElementWithText(Document doc, String elementName, String text) {
        Element elem = doc.createElement(elementName);
        elem.appendChild(doc.createTextNode(text));
        return elem;
    }

    private static void printXml(Node node) {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println("<" + node.getNodeName() + ">");
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                printXml(children.item(i));
            }
            System.out.println("</" + node.getNodeName() + ">");
        } else if (node.getNodeType() == Node.TEXT_NODE) {
            System.out.println(node.getNodeValue());
        }
    }
}
