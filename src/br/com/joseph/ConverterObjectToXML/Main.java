package br.com.joseph.ConverterObjectToXML;

import br.com.joseph.Model.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("Joseph", "xxx.xxx.xxx-xx", 19);
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("person", Person.class);
        System.out.println(xStream.toXML(person));

    }

}
