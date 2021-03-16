package ru.inxt.urok3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.inxt.urok3.model.DataTable;
import ru.inxt.urok3.model.Surnames;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String TAG_NAME_MAIN = "Title";
    private static final String TAG_SURNAMES = "Surnames";
    private static final String TAG_RUSSIAN_NAMES = "russian_names";
    private static final String TAG_ID = "ID";
    private static final String TAG_NAME = "Name";
    private static final String TAG_SEX = "Sex";
    private static final String TAG_PEOPLES = "PeoplesCount";
    private static final String TAG_WHEN_PEOPLES = "WhenPeoplesCount";

    public DataTable parse(){

        DataTable DataTable = new DataTable();

        Document doc ;

        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Open parsing error " + e.toString());
            return null;
        }

        Node DataTableNode = doc.getFirstChild();
        NodeList DataTableChilds = DataTableNode.getChildNodes();


        String mainTitle =null;
        Node SurnamesNode = null;

        for(int i=0; i < DataTableChilds.getLength(); i++) {

            if(DataTableChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            //        System.out.println("0--*--0 == " + DataTableChilds.item(i).getNodeName());

            switch (DataTableChilds.item(i).getNodeName()){
                case TAG_NAME_MAIN: {
                    mainTitle = DataTableChilds.item(i).getTextContent();
                    break;
                }
                case TAG_SURNAMES: {
                    SurnamesNode = DataTableChilds.item(i);
                    break;
                }
            }
        }

        if(SurnamesNode == null){
            return null;
        }

        List<Surnames> SurnamesList = parseSurnames(SurnamesNode);

        DataTable.setTitle(mainTitle);
        DataTable.setSurnames(SurnamesList);
   //     System.out.println(DataTable.toString());

        DataTable.getSurnames().stream().filter(Surnames -> {
            return Surnames.getPeoplesCount() == 1000;
        }).forEach(Surnames ->{
            System.out.println("People - " + Surnames.toString());
        });

        return DataTable;
    }

    private Document buildDocument() throws Exception{
        File file = new File("src/ru/inxt/urok3/test.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

    private List<Surnames> parseSurnames (Node SurnamesNode) {

        List<Surnames> SurnamesList = new ArrayList<>();
        NodeList SurnamesChilds = SurnamesNode.getChildNodes();
        for(int i=0; i < SurnamesChilds.getLength(); i++){

            if(SurnamesChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            if(!SurnamesChilds.item(i).getNodeName().equals(TAG_RUSSIAN_NAMES)){
                continue;
            }
            //       NodeList russian_namesChilds = SurnamesChilds.item(i).getChildNodes();

            Surnames Surnames = parsRusName(SurnamesChilds.item(i));
            SurnamesList.add(Surnames);
        }

        return SurnamesList;
    }

    private Surnames parsRusName (Node russian_namesNode){

        int ID, PeoplesCount;
        ID = PeoplesCount =0;
        String Name, Sex, WhenPeoplesCount;
        Name=Sex=WhenPeoplesCount = "";

        NodeList russian_namesChilds = russian_namesNode.getChildNodes();
        for(int j=0; j < russian_namesChilds.getLength(); j++) {

            if (russian_namesChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (russian_namesChilds.item(j).getNodeName()){
                case TAG_ID:{
                    ID =Integer.valueOf(russian_namesChilds.item(j).getTextContent());
                    break;
                }
                case TAG_NAME:{
                    Name = russian_namesChilds.item(j).getTextContent();
                    break;
                }
                case TAG_SEX:{
                    Sex = russian_namesChilds.item(j).getTextContent();
                    break;
                }
                case TAG_PEOPLES:{
                    PeoplesCount = Integer.valueOf(russian_namesChilds.item(j).getTextContent());
                    break;
                }
                case TAG_WHEN_PEOPLES:{
                    WhenPeoplesCount = russian_namesChilds.item(j).getTextContent();
                    break;
                }
            }
        }
        return new Surnames(ID, Name, Sex, PeoplesCount, WhenPeoplesCount);
    }

}
