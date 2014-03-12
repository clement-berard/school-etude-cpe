
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

public class XMLDOM
{
	private String source ="test.xml";
	private String cible ="test2.xml";
	private String tmpDir="";
	
	public XMLDOM(String s, String c)
	{
		tmpDir = "./";
		source = tmpDir + s;
		cible = tmpDir + c;
		copyNode();
	}
	
	public void copyNode()
	{
		try
		{
			DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder constructeur = fabrique.newDocumentBuilder();
			// Création d'un nouveau DOM
			File src = new File(source);
			Document docsrc = constructeur.parse(src);
			// Création d'un nouveau DOM vide
			Document document = constructeur.newDocument();
			
			// Propriétés du DOM
			document.setXmlVersion("1.0");
			document.setXmlStandalone(true);

			//Création de l'arborescence du DOM
			//racine
			Element racine = document.createElement("racine");
			
			Element obs = document.createElement("fils");
			racine.appendChild(obs);
			
			//Copie d'un élément de la source dans le nouveau document
			//l'élément à copier
			Node acopier = docsrc.getElementsByTagName("item").item(2);
			
			//nouveau noeud, copie de a copier
			Node noeud = document.importNode(acopier, true);
			//on peut utiliser noeud où l'on veut dans le document maintenant de sortie
			racine.appendChild(noeud);
			
			document.appendChild(racine);
			/* Sauvegarde de document dans un fichier */
			Source source = new DOMSource(document);
			
			// Création du fichier de sortie
			File f = new File(cible);
			Result resultat = new StreamResult(f);
			
			// Configuration du transformer
			TransformerFactory tfabrique = TransformerFactory.newInstance();
			Transformer transformer = tfabrique.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");            
			// Transformation
			transformer.transform(source, resultat);
			System.out.println("terminé");
		}
		catch (ParserConfigurationException pce) {
			// TODO Auto-generated catch block
			pce.printStackTrace();
		} catch (TransformerConfigurationException tce) {
			// TODO Auto-generated catch block
			tce.printStackTrace();
		} catch (TransformerException te) {
			// TODO Auto-generated catch block
			te.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		XMLDOM test = new XMLDOM("test.xml","test2.xml");
	}
}
