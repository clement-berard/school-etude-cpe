
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;

public class Validator
{
	private String source ="test.xml";
	private String tmpDir="";
	
	public Validator(String s, String c)
	{
		tmpDir = "./";
		source = tmpDir + s;
		//cible = tmpDir + c;
		validate();
	}
	
	public void validate()
	{
		try
		{
			DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
			fabrique.setValidating(true);
			fabrique.setNamespaceAware(true);
			DocumentBuilder constructeur = fabrique.newDocumentBuilder();
			//constructeur.setErrorHandler(new DefaultHandler());
			// Création d'un nouveau DOM
			File src = new File(source);
			Document docsrc = constructeur.parse(src);
			
		}
		catch (ParserConfigurationException pce) {
			// TODO Auto-generated catch block
			pce.printStackTrace();
		}/* catch (TransformerConfigurationException tce) {
			// TODO Auto-generated catch block
			tce.printStackTrace();
		} catch (TransformerException te) {
			// TODO Auto-generated catch block
			te.printStackTrace();
		}*/ catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		if(args.length > 0){Validator test = new Validator(args[0],"");}
		else{System.err.println("Syntaxe: java Validator file.xml");}
	}
}
