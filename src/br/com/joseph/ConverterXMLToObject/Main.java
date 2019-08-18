package br.com.joseph.ConverterXMLToObject;

import br.com.joseph.Model.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
    public static void main(String[] args) {

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("person", Person.class);
        Person person = (Person) xStream.fromXML("<person>" +
                "<name>Joseph</name>" +
                "<cpf>xxx.xxx.xxx-xx</cpf>" +
                "<age>19</age>" +
                "</person>");

        System.out.println(person);


    }
}
