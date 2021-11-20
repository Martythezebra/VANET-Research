/* 
 * This is an exercise in parsing XML documents in java
 * 
 * Written by Marty Roger, with advisor Miguel Mosteiro 
 * 
 */

package Test1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class FileReadDriver {
    public static void main(String[] args){
        
        System.out.println("Let's boogie, baby");

        final String FILENAME = "D:\\Git Repositories & Misc\\VANET-Research\\SumoCFG\\OutputFile.xml";

        DocumentBuilderFactory builderBuilder = DocumentBuilderFactory.newInstance();



        try {

            DocumentBuilder builder = builderBuilder.newDocumentBuilder();

            //Create the DOM
            Document xmlFile = builder.parse(new File(FILENAME));
            xmlFile.normalize();

            System.out.println(xmlFile.getDocumentElement().getElementsByTagName("timestep").item(0).getNodeName());

            
        } catch (ParserConfigurationException | IOException | SAXException exception) {

            System.out.println("There was an error parsing the document!");
            exception.printStackTrace();
        }


    }
}